package com.finance.www.vox;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Administrator on 2019/7/29.
 */
@Data
public class DengEVo implements Serializable{
    private String periods;//期数
    private String days;//日期
    private String money;//还款金额
}
