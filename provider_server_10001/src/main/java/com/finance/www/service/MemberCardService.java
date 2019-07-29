package com.finance.www.service;

import com.finance.www.pojo.MemberCard;

import java.util.List;

/**
 * Created by Administrator on 2019/7/24.
 */
public interface MemberCardService {
    /**根据用户id查找银行卡*/
    public List<MemberCard> queryById(Integer id);

}
