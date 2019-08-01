package com.finance.www.vo;

import lombok.Data;

import java.util.Date;

/**
 * Created by lenovo-pc on 2019/7/25.
 */
@Data
public class BandMvo {
    private Integer id;

    private Integer memberId;

    private Long amount;

    private Integer xingzhi;

    private Integer howlong;

    private Integer paymethod;

    private String idcardone;

    private String idcardtwo;

    private String bankcard;

    private Date createTime;

    private Integer state;

    private String username;

    private String mobile;

    private String email;
}
