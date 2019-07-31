package com.finance.www.service.Impl;

import com.finance.www.mapper.MemberInfoMapper;
import com.finance.www.pojo.MemberInfo;
import com.finance.www.service.MemberInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 杜碧天 on 2019/7/29.
 */
@Service
public class MemberInfoServiceImpl implements MemberInfoService{
    @Autowired
    MemberInfoMapper memberInfoMapper;
    @Override
    public MemberInfo chaXunYongHuXx(Integer userid) {
        MemberInfo memberInfo = memberInfoMapper.selectByPrimaryKey(userid);
        return memberInfo;
    }
}
