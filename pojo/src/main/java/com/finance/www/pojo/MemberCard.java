package com.finance.www.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class MemberCard implements Serializable {
    /**
    * id
    */
    private Integer id;

    /**
    * 用户id
    */
    private Integer memberId;

    /**
    * 银行卡号
    */
    private String bankcard;

    /**
    * 银行名称
    */
    private String bankname;

    /**
    * 银行英文简写
    */
    private String abbreviation;

    /**
    * 卡类型
    */
    private String cardtype;

    /**
    * 卡名称
    */
    private String nature;

    /**
    * 归属地（省）
    */
    private String province;

    /**
    * 归属地（市区）
    */
    private String city;

    /**
    * 所属银行logo
    */
    private String banklogo;

    /**
    * 银行官方网站
    */
    private String weburl;

    /**
    * 银行客服电话
    */
    private String kefu;

    /**
    * 开卡时间
    */
    private Date cerateTime;

    /**
    * 最后更新时间
    */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}