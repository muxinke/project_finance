package com.finance.www.service.impl;

import com.finance.www.mapper.BankLimitmoneyMapper;
import com.finance.www.pojo.BankLimitmoney;
import com.finance.www.service.BankLimitmoneySerrvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019/7/30.
 */
@Service
public class BankLimitmoneySerrviceImpl implements BankLimitmoneySerrvice {
    @Autowired
    private BankLimitmoneyMapper bankLimitmoneyMapper;

    @Override
    public BankLimitmoney findByName(String bankName) {
        BankLimitmoney bankLimitmoney = bankLimitmoneyMapper.findByName(bankName);
        return bankLimitmoney;
    }
}
