package com.finance.www.service.impl;

import com.finance.www.mapper.MemberRegisterMapper;
import com.finance.www.pojo.MemberRegister;
import com.finance.www.service.MemberRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019/7/30.
 */
@Service
public class MemberRegisterServiceImpl implements MemberRegisterService {
    @Autowired
    private MemberRegisterMapper memberRegisterMapper;
    @Override
    public MemberRegister findById(Integer id) {
        MemberRegister memberRegister = memberRegisterMapper.selectByPrimaryKey(id);
        return memberRegister;
    }
}
