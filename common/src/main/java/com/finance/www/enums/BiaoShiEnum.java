package com.finance.www.enums;

/**
 * Created by 杜碧天 on 2019/7/26.
 */
public enum BiaoShiEnum {
    NEW(1, "新"),
    XIAN(2, "险"),
    LIAN(3, "链"),
    JIN(4, "金"),
    XIAO(5, "消"),
    ZU(6, "租"),
    BAO(7, "保"),
    YA(8, "押"),
    XIN(9, "信")
    ;
    private Integer type;
    private String biaoshiname;

    BiaoShiEnum(Integer type, String biaoshiname) {
        this.type = type;
        this.biaoshiname = biaoshiname;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getBiaoshiname() {
        return biaoshiname;
    }

    public void setBiaoshiname(String biaoshiname) {
        this.biaoshiname = biaoshiname;
    }

    public static String getBiaoShi(int val){
        for(BiaoShiEnum biaoShi: BiaoShiEnum.values()){
            if(biaoShi.getType()==val){
                return biaoShi.getBiaoshiname();
            }
        }
        return null;
    }
}
