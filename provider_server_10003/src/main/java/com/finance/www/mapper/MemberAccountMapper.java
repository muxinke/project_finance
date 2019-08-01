package com.finance.www.mapper;


import com.finance.www.pojo.MemberAccount;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author muxinke
 * Created by Administrator on 2019/7/25.
 */
@Mapper
public interface MemberAccountMapper {
    /**给用户本地账户打钱*/
    void add(@Param("id") int memberId, @Param("account") long accountBalance);
    /**根据id查询该用户对应的信息*/
    MemberAccount queryById(int memberId);
    //根据用户id修改账户余额
    public int updateBalanceById(@Param("id")int id,@Param("accountBalance")long accountBalance);

}
