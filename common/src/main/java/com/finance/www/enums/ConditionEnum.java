package com.finance.www.enums;

/**
 * 项目状态
 * Created by 杜碧天 on 2019/7/26.
 */
public enum ConditionEnum {
    TBZ(1, "投标中"),

    FSZ(2, "复审中"),
    HKZ(3, "还款中");

    private Integer type;
    private String typename;

    ConditionEnum(Integer type, String typename) {
        this.type = type;
        this.typename = typename;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;

    }

    /**
     * 根据数据库的数字得到项目的状态
     * @param val
     * @return
     */

    public static String getConditionName(int val) {
        for (ConditionEnum aa : ConditionEnum.values()) {
            if (aa.getType() == val) {
                return aa.getTypename();
            }
        }
        return null;
    }
}