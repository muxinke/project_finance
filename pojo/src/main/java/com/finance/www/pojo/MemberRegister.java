package com.finance.www.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class MemberRegister implements Serializable {
    /**
    * 会员id
    */
    private Integer id;

    /**
    * 真实姓名
    */
    private String realName;

    /**
    * 身份证号
    */
    private String idNumber;

    /**
    * 是否同意合同
            1：同意
            2：不同意
    */
    private Integer isAgreed;

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