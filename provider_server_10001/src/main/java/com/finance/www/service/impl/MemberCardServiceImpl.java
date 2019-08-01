package com.finance.www.service.impl;

import com.finance.www.mapper.MemberCardMapper;
import com.finance.www.pojo.MemberCard;
import com.finance.www.pojo.MemberCardExample;
import com.finance.www.service.MemberCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/7/24.
 */
@Service
public class MemberCardServiceImpl implements MemberCardService {
    @Autowired
    private MemberCardMapper memberCardMapper;
    @Override
    public List<MemberCard> queryById(Integer id) {

        return memberCardMapper.queryByMemberId(id);

    }

    @Override
    public int insertCard(String bankcard, String bankName,int memberId) {
        int i =memberCardMapper.insertCard(bankcard,bankName,memberId);
        return i;
    }
}
