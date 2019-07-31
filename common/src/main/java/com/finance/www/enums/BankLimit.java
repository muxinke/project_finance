package com.finance.www.enums;

/**
 * Created by Administrator on 2019/7/30.
 */
public enum BankLimit {
    JIANSHE_BANK(1,1000000),
    XINGYE_BANK(2,50000),
    ZHONGXIN_BANK(3,5000),
    YOUZHENG_BANK(4,10000),
    GUANGDA_BANK(5,50000),
    GONGSHANG_BANK(6,990000),
    NONGYE_BANK(7,2000),
    ZHONGGUO_BANK(8,50000),
    ZHAOSHANG_BANK(9,100000),
    GUANGFA_BANK(10,1000000),
    JIAOTONG_BANK(11,200000),
    PUFA_BANK(12,200000),
    HUAXIA_BANK(13,20000),
    SHANGHAI_BANK(14,5000),
    BEIJING_BANK(15,1000000);
    private int type;
    private long limitMoney;

    BankLimit(int type, long limitMoney) {
        this.type = type;
        this.limitMoney = limitMoney;
    }
    public static long getLimitMoney(int val){
            for(BankLimit bankLimit : BankLimit.values()){
                if(bankLimit.type==val){
                    return bankLimit.limitMoney;
                }
            }
            return -1;
    }
}
