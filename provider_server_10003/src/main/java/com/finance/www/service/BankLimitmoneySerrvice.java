package com.finance.www.service;

import com.finance.www.pojo.BankLimitmoney;

/**
 * Created by Administrator on 2019/7/30.
 */
public interface BankLimitmoneySerrvice {
    //根据name查询
    public BankLimitmoney findByName(String bankName);
}
