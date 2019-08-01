package com.finance.www.oauth_server_8050.service.serviceimpl;

import com.finance.www.oauth_server_8050.mapper.MemberLimitMapper;
import com.finance.www.oauth_server_8050.service.MemberLimitService;
import com.finance.www.pojo.MemberLimit;
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
