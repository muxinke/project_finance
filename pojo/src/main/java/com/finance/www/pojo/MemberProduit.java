package com.finance.www.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class MemberProduit implements Serializable {
    /**
    * id
    */
    private Integer id;

    /**
    * 会员id
    */
    private Integer memberId;

    /**
    * 投资列表id
    */
    private Integer produitId;

    /**
    * 预期收益
    */
    private String predictIncome;

    /**
    * 投标时间
    */
    private Date tenderDate;

    /**
    * 投资本金
    */
    private String principal;

    /**
    * 应收本息
    */
    private String receivable;

    /**
    * 投标状态
    */
    private Integer isState;

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