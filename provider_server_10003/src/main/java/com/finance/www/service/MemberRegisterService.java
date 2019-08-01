package com.finance.www.service;

import com.finance.www.pojo.MemberRegister;
import com.finance.www.vox.RegisterVo;

/**
 * Created by Administrator on 2019/7/30.
 */
public interface MemberRegisterService {
    //根据用户id查询真实姓名
    public MemberRegister findById(Integer id);
    //判断实名注册表是否含有该id
    public int isHaveMyId(Integer id);
    //根据用户id添加实名认证信息
    public int shiming(RegisterVo registerVo);
}
