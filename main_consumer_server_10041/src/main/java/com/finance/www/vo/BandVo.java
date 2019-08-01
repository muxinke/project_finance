package com.finance.www.vo;

import lombok.Data;

import java.util.Date;

/**
 * Created by lenovo-pc on 2019/7/26.
 */
@Data
public class BandVo {
    private Integer id;

    private Integer memberId;

    private Long amount;

    private String use;

    private Integer howlong;

    private String paymethod;

    private String idcardone;

    private String idcardtwo;

    private String bankcard;

    private Date createTime;

    private String state;

    private String username;

    private String mobile;

    private String email;


}
