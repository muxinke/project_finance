package com.finance.www.service.impl;

import com.finance.www.mapper.MemberLimitMapper;
import com.finance.www.pojo.MemberLimit;
import com.finance.www.pojo.MemberLimitExample;
import com.finance.www.service.MemberLimitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019/7/24.
 */
@Service
public class MemberLimitServiceImpl implements MemberLimitService {
    @Autowired
    private MemberLimitMapper memberLimitMapper;
    @Override
    public MemberLimit queryById(Integer id) {

        return  memberLimitMapper.queryById(id);
    }
}
