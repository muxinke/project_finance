package com.finance.www.pojo;

import java.io.Serializable;
import java.util.Date;

//import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data

public class Memeber implements Serializable {
    /**
    * id
    */
    private Integer id;

    /**
    * 会员登陆名
    */
    private String username;

    /**
    * 会员登陆密码
    */
   // @JsonIgnore
    private String password;

    /**
    * 会员手机号
    */
    private String mobile;

    /**
    * 会员邮箱
    */
    private String email;

    /**
    * 会员注册时间

    */
    private Date createTime;

    /**
    * 最后修改时间
    */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}