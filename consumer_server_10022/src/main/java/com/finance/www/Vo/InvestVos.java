package com.finance.www.Vo;

import lombok.Data;

/**
 * Created by 杜碧天 on 2019/7/27.
 */
@Data
public class InvestVos {
    private Integer id;
    /**
     * 投资会员名
     */
    private String investName;
    /**
     * 投资金额
     */
    private String jine;
    /**
     * 投资有效金额
     */
    private String yxjine;
    /**
     * 投标方式
     */
    private Integer investWay;
    /**
     * 投标时间
     */
    private  String investtime;
}
