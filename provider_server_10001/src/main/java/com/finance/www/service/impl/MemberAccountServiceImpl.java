package com.finance.www.service.impl;

import com.finance.www.mapper.MemberAccountMapper;
import com.finance.www.pojo.MemberAccount;
import com.finance.www.service.MemberAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019/7/25.
 */
@Service
public class MemberAccountServiceImpl implements MemberAccountService {
    @Autowired
    private MemberAccountMapper memberAccountMapper;
    @Override
    public MemberAccount queryById(int id) {
        MemberAccount memberAccount = memberAccountMapper.queryById(id);
        return memberAccount;
    }
}
