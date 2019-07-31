package com.finance.www.service;

import com.finance.www.pojo.MemberAccount;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Administrator on 2019/7/30.
 */
public interface MemberAccountService {
    //根据用户id 查询账户余额
    public MemberAccount selectById(Integer id);
    //根据用户id修改账户余额
    public int updateBalanceById(@Param("id")int id,@Param("accountBalance")long accountBalance);

}
