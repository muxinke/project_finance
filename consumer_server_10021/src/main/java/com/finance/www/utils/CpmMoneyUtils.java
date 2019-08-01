package com.finance.www.utils;

import com.finance.www.vo.CpmMoneyVo;
import com.finance.www.vo.CpmVo;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Administrator on 2019/7/26.
 */

public class CpmMoneyUtils {

/**
     *
     * @param money 借款本金
     * @param count 借款期数
     * @param interestRate 借款利率
     * @return
     */

    public static CpmVo getCpm(String money, int count, float interestRate){
        CpmVo cpmVo = new CpmVo();
        ArrayList<CpmMoneyVo> cpmMoneyVos = new ArrayList<>();
/*大数字(超过16位有效位)的操作类*/

        DecimalFormat df = new DecimalFormat("0.00");
        //每月还款金额
        BigDecimal moneyDecimal = new BigDecimal(money);
        //还款利率
        BigDecimal RatedDcimal = new BigDecimal(interestRate);
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
            Calendar instance = Calendar.getInstance();
            instance.add(Calendar.MONTH,i);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
            Date time = instance.getTime();
            String formatTime = simpleDateFormat.format(time);


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
}
