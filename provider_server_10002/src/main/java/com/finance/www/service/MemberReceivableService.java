package com.finance.www.service;

/**
 * 会员汇款明细
 * Created by 杜碧天 on 2019/7/30.
 */
public interface MemberReceivableService {
    //给表里添加数据
    void addMemberReceivble(Integer userid,Integer pid,Integer benjins);
}
