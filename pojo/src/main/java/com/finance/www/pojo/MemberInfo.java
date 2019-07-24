package com.finance.www.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class MemberInfo implements Serializable {
    /**
    * 会员id
    */
    private Integer memberId;

    /**
    * 毕业学校id
    */
    private Integer schoolId;

    /**
    * 性别
            1：男
            2：女
    */
    private Integer gender;

    /**
    * 出生日期
    */
    private Date dateBirth;

    /**
    * 最高学历
    */
    private String recordSchooling;

    /**
    * 婚姻情况
            1：未婚
            2：已婚
            3：离异
            4：丧偶
    */
    private Integer marriageStatus;

    /**
    * 住房条件
            1：自购
            2：与父母同住
            3：租房
            4：集体宿舍
    */
    private String housingInfo;

    /**
    * 月收入
    */
    private String monthlyIncome;

    /**
    * 常住地址
    */
    private String homeAddress;

    /**
    * 所在行业
    */
    private String industry;

    /**
    * 交易密码设置状态
    */
    private Integer isTransactionPassword;

    /**
    * 头像图片地址
    */
    private String imgUrl;

    /**
    * 登陆密码设置状态
    */
    private Integer isLoginPassword;

    /**
    * 银行卡绑定状态
    */
    private Integer isTiedCard;

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