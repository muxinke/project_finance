package com.finance.www.enums;

/**
 * 信用等级
 * Created by 杜碧天 on 2019/7/25.
 */
public enum OrdreEnum {
    ONE(1,"A"),
    TWO(2,"AA"),
    ThREE(3,"AAA")
    ;
    private Integer identifier;
    private String level;

    OrdreEnum(Integer identifier, String level) {
        this.identifier = identifier;
        this.level = level;
    }

    public Integer getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Integer identifier) {
        this.identifier = identifier;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * 根据数字得到信用等级
     * @param val
     * @return
     */
    public static String getEnumLevel (int val) {
        for (OrdreEnum aa : OrdreEnum .values()) {
            if (aa.getIdentifier() == val) {
                return aa.getLevel();
            }
        }
        return null;
    }
}
