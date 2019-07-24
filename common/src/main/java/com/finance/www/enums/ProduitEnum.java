package com.finance.www.enums;

/**
 * @author ：邓一凡
 * @date ：Created in 2019/7/24 19:12
 * @description ：
 */
public enum ProduitEnum {
    NEW_STANDARD(1, "新手标"),
    Insurance_covers(2, "保险承保"),
    supply_chain(3, "供应链"),
    cash_deposit(4, "保证金"),
    Easy_consumption(5, "轻松消费"),
    finance_lease(6, "融资租赁"),
    Guarantee_the(7, "担保标"),
    Mortgage_the(8, "抵押标"),
    The_credit_scale(9, "信用标"),
    ;

    public int getType() {
        return type;
    }

    ProduitEnum(int type) {
        this.type = type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }

    ProduitEnum(int type, String typeName) {
        this.type = type;
        this.typeName = typeName;
    }

     int type;
    String typeName;

    /**
     * 通过 typeVal 的数值获取枚举实例
     *
     * @param val
     * @return
     */
    public static String getEnumType (int val) {
        for (ProduitEnum type : ProduitEnum .values()) {
            if (type.getType() == val) {
                return type.getTypeName();
            }
        }
        return null;
    }
}
