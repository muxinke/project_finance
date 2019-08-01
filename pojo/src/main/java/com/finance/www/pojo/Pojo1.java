package com.finance.www.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author ：邓一凡
 * @date ：Created in 2019/8/1 10:52
 * @description ：
 */
@Data
public class Pojo1 implements Serializable {

    private String reason;
    private Result result;
    private Integer error_code;

}
