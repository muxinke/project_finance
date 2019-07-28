package com.finance.www.testinterest;

import com.finance.www.utils.BIAPPUtils;
import com.finance.www.utils.CPMUtils;
import com.finance.www.utils.CalculateScheDule;
import com.finance.www.vo.Biapp;
import com.finance.www.vo.BiappMoneyVo;
import com.finance.www.vo.CpmMoneyVo;
import com.finance.www.vo.CpmVo;
import org.aspectj.bridge.MessageWriter;
import org.junit.Test;

import javax.lang.model.SourceVersion;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2019/7/26.
 */
public class InterestTest {
        @Test
    public void test1() {
            DecimalFormat df = new DecimalFormat("0.00");
            BigDecimal principal = new BigDecimal("500");
            BigDecimal monthlyInterestRate = new BigDecimal(0.02);
            BigDecimal monthlyRepayment = CPMUtils.monthlyRepayment(principal, monthlyInterestRate, 6);
            System.out.println("每月还款金额"+df.format(monthlyRepayment));
            BigDecimal interest = CPMUtils.interest(principal, monthlyInterestRate, 6);
            System.out.println("还款总利息："+df.format(interest));
            System.out.println("还款总金额："+df.format(principal.add(interest)));
            //根据期数 计算一共有多少期

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.MONTH,6);
            Date time = calendar.getTime();
            String format = sdf.format(time);
            System.out.println(format);
            getPeriods(3);
        }
        public void getPeriods(int count){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            for(int i=1;i<=count;i++){
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.MONTH,i);
                Date time = calendar.getTime();
                String format = sdf.format(time);
                System.out.println(format);
            }
        }

    /**
     *  等额本息还款方式
     * @param money 借款本金
     * @param count 借款期数
     * @param interestRate 借款利率
     * @return
     */
        public CpmVo lists(String money,int count,float interestRate){
            CpmVo cpmVo = new CpmVo();
            ArrayList<CpmMoneyVo> cpmMoneyVos = new ArrayList<>();
            DecimalFormat df = new DecimalFormat("0.00");
            //每月还款金额
            BigDecimal moneyDecimal = new BigDecimal(money);
            //还款利率
            BigDecimal RatedDcimal = new BigDecimal(interestRate);
            System.out.println(RatedDcimal);
            BigDecimal monthlyRepayment = CPMUtils.monthlyRepayment(moneyDecimal, RatedDcimal, count);
            String monthlyMoney= df.format(monthlyRepayment);
            //还款总利息
            BigDecimal interest = CPMUtils.interest(moneyDecimal, RatedDcimal, count);
            String interestFormat = df.format(interest);

            //还款总金额
            BigDecimal totalMoney = moneyDecimal.add(interest);
            String totalMoneyFormat = df.format(totalMoney);

            for(int i=1;i<=count;i++){

                CpmMoneyVo cpmMoneyVo = new CpmMoneyVo();
                //预计还款期数总计
               /* Calendar instance = Calendar.getInstance();
                instance.add(Calendar.MONTH,i);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
                Date time = instance.getTime();
                String formatTime = simpleDateFormat.format(time);*/
                String formatTime = CalculateScheDule.getScheDule(i);
                System.out.println(formatTime);
                cpmMoneyVo.setMoney(monthlyMoney);
                cpmMoneyVo.setSchedule(formatTime);
                if(i==1){
                    cpmMoneyVo.setPeriods("首期");
                }else{
                    cpmMoneyVo.setPeriods("第"+i+"期");
                }
                cpmMoneyVos.add(cpmMoneyVo);
            }
            cpmVo.setTotalMoney(totalMoneyFormat);
            cpmVo.setTotalInterest(interestFormat);
            cpmVo.setMoneyVoList(cpmMoneyVos);
            return cpmVo;
        }

        @Test
    public void test2(){
            CpmVo lists = lists("500", 3, 0.025f);
            System.out.println(lists);
        }


        @Test
    public void test3(){
            DecimalFormat df = new DecimalFormat("0.00");
            BigDecimal moneyDecimal = new BigDecimal("500");
            BigDecimal monthlyInterestRate = new BigDecimal(0.025);
            BigDecimal monthlyInterest = BIAPPUtils.monthlyInterest(moneyDecimal, monthlyInterestRate);
            String monthlyInterestFormat = df.format(monthlyInterest);
            System.out.println(monthlyInterestFormat);
            BigDecimal interest = BIAPPUtils.interest(moneyDecimal, monthlyInterestRate, 3);
            String format = df.format(interest);
            System.out.println(format);
            BigDecimal bigDecimal = BIAPPUtils.monthlyRepayment(moneyDecimal, monthlyInterestRate, 3, 1);
            String format1 = df.format(bigDecimal);
            System.out.println(format1);
        }

    /**
     * 先息 后本和利息
     * @param money 贷款本金
     * @param count  期数
     * @param interestRate 利率
      * @return
     */
        public Biapp getBiapp(String money, int count, float interestRate){
            //创建返回对象
            Biapp biapp = new Biapp();
            ArrayList<BiappMoneyVo> biappMoneyVos = new ArrayList<>();
            //每月还款信息
            DecimalFormat df = new DecimalFormat("0.00");
            BigDecimal moneyDecial = new BigDecimal(money);
            BigDecimal interestRateDecimal = new BigDecimal(interestRate);
            /**计算总利息*/
            BigDecimal interest = BIAPPUtils.interest(moneyDecial, interestRateDecimal, count);
            String interestFormat = df.format(interest);
            /**计算每月还款金额，还款期数，还款时的时间*/
            for(int i=1;i<=count;i++){
                BiappMoneyVo biappMoneyVo = new BiappMoneyVo();
                BigDecimal moneyDecimal = BIAPPUtils.monthlyRepayment(moneyDecial, interestRateDecimal, count, i);
                String moneyDecialFormat = df.format(moneyDecimal);
                String scheDule = CalculateScheDule.getScheDule(i);
                biappMoneyVo.setSchedule(scheDule);
                biappMoneyVo.setMoney(moneyDecialFormat);
               if(i==1){
                   biappMoneyVo.setPeriods("首期");
               }else{
                   biappMoneyVo.setPeriods("第"+i+"期");
               }
                biappMoneyVos.add(biappMoneyVo);
            }

            /**返回给前台的对象*/
            biapp.setTotalMoney(df.format(moneyDecial.add(interest)));
            biapp.setTotalInterest(interestFormat);
            biapp.setMoneyVoList(biappMoneyVos);
            System.out.println(biapp);
            return biapp;
        }
        @Test
         public void test4(){
            getBiapp("500",3,0.025f);
        }
}
