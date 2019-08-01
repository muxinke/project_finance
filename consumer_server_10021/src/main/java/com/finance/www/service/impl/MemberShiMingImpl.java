package com.finance.www.service.impl;

import com.finance.www.pojo.MemberRegister;
import com.finance.www.service.MemberShiMingService;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019/8/1.
 */
@Component
public class MemberShiMingImpl implements MemberShiMingService {
    @Override
    public MemberRegister getMember(int id) {

        return new MemberRegister();
    }
}
