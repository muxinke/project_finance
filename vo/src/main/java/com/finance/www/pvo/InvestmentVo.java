package com.finance.www.pvo;

import lombok.Data;

import java.io.Serializable;

/**
 * 前台商品展示投资人员的vo
 * Created by 杜碧天 on 2019/7/27.
 */
@Data
public class InvestmentVo implements Serializable{
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
