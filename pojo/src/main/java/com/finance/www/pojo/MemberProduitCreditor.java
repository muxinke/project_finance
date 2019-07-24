package com.finance.www.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class MemberProduitCreditor implements Serializable {
    /**
    * id
    */
    private Integer id;

    /**
    * 用户id
    */
    private Integer memberId;

    /**
    * 产品id
    */
    private Integer produitId;

    /**
    * 债务人详情
    */
    private String debtorParticulars;

    /**
    * 担保人详情
    */
    private String guarantorDetails;

    /**
    * 贷款用途
    */
    private String loansUsed;

    /**
    * 还款来源
    */
    private String sourceRepayment;

    /**
    * 风险控制
    */
    private String riskControl;

    /**
    * 终审意见
    */
    private String finalOpinion;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 最后修改时间
    */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}