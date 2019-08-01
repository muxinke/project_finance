package com.finance.www.service;

import com.finance.www.pojo.MemberLimit;

/**
 * Created by Administrator on 2019/7/24.
 */
public interface MemberLimitService {
    /**根据用户id获取额度*/
    public MemberLimit queryById(Integer id);
}
