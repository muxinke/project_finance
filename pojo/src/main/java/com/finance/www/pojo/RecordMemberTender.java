package com.finance.www.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class RecordMemberTender implements Serializable {
    /**
    * id
    */
    private Integer id;

    /**
    * 投资会员id
    */
    private Integer memberId;

    /**
    * 产品id
    */
    private Integer produitId;

    /**
    * 投资时间
    */
    private Date investmentTime;

    /**
    * 投资方式
    */
    private Integer investmentWay;

    /**
    * 投资金额
    */
    private String investmentAmount;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 最后更改时间
    */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}