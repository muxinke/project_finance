package com.finance.www.enums;


/**
 * Created by Administrator on 2019/7/30.
 */
public enum  RepaymentStateEnum {
    CHECK(0, "审核中"),
    IN_THE_REPAYMENT(1, "还款中"),
    CLOSE_OFF(2, "已还清");

    private Integer type;
    private String typename;
    RepaymentStateEnum(Integer type,String typename){
        this.type=type;
        this.typename=typename;
    }
    public static String  getTypeName(Integer val){
        for(RepaymentStateEnum item: RepaymentStateEnum.values()){
            if(item.type.equals(val)){
                return item.typename;
            }
        }
        return null;
    }
}
