package com.finance.www.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class MemberTrarecords implements Serializable {
    /**
    * id
    */
    private Integer id;

    /**
    * 交易流水号
    */
    private String dealFlowSn;

    /**
    * 交易备注
    */
    private String commerceNote;

    /**
    * 交易对方
    */
    private String counterparty;

    /**
    * 操作金额
    */
    private String operationAmount;

    /**
    * 类型
    */
    private Integer type;

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