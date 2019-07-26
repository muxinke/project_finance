package com.finance.www.enums;

/**
 * @author ：邓一凡
 * @date ：Created in 2019/7/24 19:12
 * @description ：
 */
public enum ProduitEnum {
    NEW_STANDARD(1, "新手标"),
    INSURANCE_COVERS(2, "保险承保"),
    SUPPLY_CHAIN(3, "供应链"),
    CASH_DEPOSIT(4, "保证金"),
    EASY_CONSUMPTION(5, "轻松消费"),
    FINANCE_LEASE(6, "融资租赁"),
    GUARANTEE_THE(7, "担保标"),
    MORTGAGE_THE(8, "抵押标"),
    THE_CREDIT_SCALE(9, "信用标"),
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
