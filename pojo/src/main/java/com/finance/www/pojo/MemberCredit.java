package com.finance.www.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class MemberCredit implements Serializable {
    /**
    * id
    */
    private Integer id;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 最后更新时间
    */
    private Date updateTime;

    /**
    * 成功借款次数
    */
    private Integer numberSuccess;

    /**
    * 流标次数
    */
    private Integer flowStandardNumber;

    /**
    * 成功还款次数
    */
    private Integer successPaymentNumber;

    /**
    * 30天内逾期数
    */
    private Integer daysOverdue;

    /**
    * 逾期未还款期数
    */
    private Integer overdueBillsNumber;

    /**
    * 提前还款期数
    */
    private Integer prepaymentPeriodsNumber;

    /**
    * 超过30天的逾期期数
    */
    private Integer more30daysOverdue;

    private static final long serialVersionUID = 1L;
}