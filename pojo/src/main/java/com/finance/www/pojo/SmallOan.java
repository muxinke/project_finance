package com.finance.www.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class SmallOan implements Serializable {
    /**
    * id
    */
    private Integer id;

    /**
    * 会员id
    */
    private Integer memberId;

    /**
    * 借款金额
    */
    private String amount;

    /**
    * 借多久
    */
    private Integer borrow;

    /**
    * 还款方式
    */
    private Integer alsoMeans;

    /**
    * 用途id
    */
    private Integer useId;

    /**
    * 是否同意协议
    */
    private Integer isAgreed;

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