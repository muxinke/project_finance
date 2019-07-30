package com.finance.www.service;

import com.finance.www.pojo.MemberCard;

import java.util.List;

/**
 * Created by Administrator on 2019/7/30.
 */
public interface MemberCardService {
    //根据用户id查询银行卡信息
    public List<MemberCard> findCardById(Integer memberId);
}
