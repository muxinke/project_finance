package com.finance.www.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Administrator on 2019/7/26.
 */
@Data
public class CpmMoneyVo implements Serializable {
        private String periods;//期数
        private String schedule;//日期
        private String money;//还款金额
}
