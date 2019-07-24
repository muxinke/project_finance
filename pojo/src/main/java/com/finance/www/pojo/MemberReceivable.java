package com.finance.www.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class MemberReceivable implements Serializable {
    /**
    * id
    */
    private Integer id;

    /**
    * 投资列表id
    */
    private Integer produitId;

    /**
    * 投资列表id
    */
    private Integer memberId;

    /**
    * 应收日期
    */
    private Date accountsReceivableDate;

    /**
    * 当期/总数
    */
    private String currentTotal;

    /**
    * 待收本金
    */
    private String collectedPrincipal;

    /**
    * 待收利息
    */
    private String collectingInterest;

    /**
    * 待收总额
    */
    private String collectingTotal;

    /**
    * 管理费
    */
    private String managementFee;

    /**
    * 状态
    */
    private Integer state;

    /**
    * 应收本金
    */
    private String shouldPrincipal;

    /**
    * 应收总额
    */
    private String receivableAccount;

    /**
    * 实收本息
    */
    private String paidPrincipalInterest;

    /**
    * 实收利息
    */
    private String paidInterest;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 最后更新时间
    */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}