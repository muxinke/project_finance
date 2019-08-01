package com.finance.www.utils;

import com.finance.www.vo.Biapp;
import com.finance.www.vo.BiappMoneyVo;
import com.finance.www.vox.XianXiHouBenMethod;
import com.finance.www.vox.XianXiHouBenVo;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Created by Administrator on 2019/7/26.
 */
public class XianXiHouBenUtils {

    /**
     * 先息 后本和利息
     * @param money 贷款本金
     * @param count  期数
     * @param interestRate 利率
     * @return
     */
    public static XianXiHouBenMethod getXianXiHouBen(String money, int count, float interestRate){
        //创建返回对象
        XianXiHouBenMethod xianXiHouBenMethod = new XianXiHouBenMethod();
        ArrayList<XianXiHouBenVo> xianXiHouBenVos=new ArrayList<>();
        //每月还款信息
        DecimalFormat df = new DecimalFormat("0.00");
        BigDecimal moneyDecial = new BigDecimal(money);
        BigDecimal interestRateDecimal = new BigDecimal(interestRate);
        /**计算总利息*/
        BigDecimal interest = BIAPPUtils.interest(moneyDecial, interestRateDecimal, count);
        String interestFormat = df.format(interest);
        /**计算每月还款金额，还款期数，还款时的时间*/
        for(int i=1;i<=count;i++){
            XianXiHouBenVo xianXiHouBenVo = new XianXiHouBenVo();
            BigDecimal moneyDecimal = BIAPPUtils.monthlyRepayment(moneyDecial, interestRateDecimal, count, i);
            String moneyDecialFormat = df.format(moneyDecimal);
            String scheDule = CalculateScheDule.getScheDule(i);
            xianXiHouBenVo.setDays(scheDule);
            xianXiHouBenVo.setMoney(moneyDecialFormat);
            if(i==1){
                xianXiHouBenVo.setPeriods("首期");
            }else{
                xianXiHouBenVo.setPeriods("第"+i+"期");
            }
            xianXiHouBenVos.add(xianXiHouBenVo);
        }

        /**返回给前台的对象*/
        xianXiHouBenMethod.setTotalMoney(df.format(moneyDecial.add(interest)));
        xianXiHouBenMethod.setTotalInterest(interestFormat);
        xianXiHouBenMethod.setXianXiHouBenVoList(xianXiHouBenVos);
        return xianXiHouBenMethod;
    }
}
