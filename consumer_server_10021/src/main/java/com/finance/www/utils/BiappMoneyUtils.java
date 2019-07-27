package com.finance.www.utils;

import com.finance.www.vo.Biapp;
import com.finance.www.vo.BiappMoneyVo;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Created by Administrator on 2019/7/26.
 */
public class BiappMoneyUtils {

    /**
     * 先息 后本和利息
     * @param money 贷款本金
     * @param count  期数
     * @param interestRate 利率
     * @return
     */
    public static Biapp getBiapp(String money, int count, float interestRate){
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
        return biapp;
    }
}
