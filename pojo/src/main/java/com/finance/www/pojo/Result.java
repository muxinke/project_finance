package com.finance.www.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author ：邓一凡
 * @date ：Created in 2019/8/1 10:54
 * @description ：
 */
@Data
public class Result implements Serializable {

    private String bankcard;
    private String bankname;
    private String abbreviation;
    private String cardtype;
    private String nature;
    private String province;
    private String city;
    private String card_bin;
    private Integer bin_digits;
    private Integer card_digits;
    private boolean isLuhn;
    private String banklogo;
    private String weburl;
    private String kefu;

}
