package com.finance.www.enums;

/**
 * 还款方式
 * Created by 杜碧天 on 2019/7/26.
 */
public enum GuiseEnum {
   FEN(1,"按期付息到期还本"),
    YUE(2,"按期月分期还款"),
    QUAN(3,"到期全额还款");
   private int type;
   private String typename;

    GuiseEnum(int type, String typename) {
        this.type = type;
        this.typename = typename;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    /**
     * 根据数据库的数字得到还款方式
     * @param val
     * @return
     */
    public static String getGuiseTypeName(int val){
        for(GuiseEnum ss: GuiseEnum.values()){
            if(ss.getType()==val){
                return ss.getTypename();
            }
        }
        return  null;
    }
}
