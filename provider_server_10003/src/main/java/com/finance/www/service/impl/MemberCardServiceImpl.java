package com.finance.www.service.impl;

import com.finance.www.mapper.MemberCardMapper;
import com.finance.www.pojo.MemberCard;
import com.finance.www.service.MemberCardService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * Created by Administrator on 2019/7/30.
 */
@Service
public class MemberCardServiceImpl implements MemberCardService {
    @Autowired
    private MemberCardMapper memberCardMapper;
    @Override
    public List<MemberCard> findCardById(Integer memberId) {
        List<MemberCard> memberCards = memberCardMapper.findCardById(memberId);
        return memberCards;
    }
}
