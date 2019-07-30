package com.finance.www.service;

import com.finance.www.pojo.MemberRegister;

/**
 * Created by Administrator on 2019/7/30.
 */
public interface MemberRegisterService {
    //根据用户id查询真实姓名
    public MemberRegister findById(Integer id);
}
