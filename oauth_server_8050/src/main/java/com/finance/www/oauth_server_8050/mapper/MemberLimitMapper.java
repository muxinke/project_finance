package com.finance.www.oauth_server_8050.mapper;

import com.finance.www.pojo.MemberLimit;
import com.finance.www.pojo.MemberLimitExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MemberLimitMapper {
    /**
     *
     * @param id
     * @return
     */
    MemberLimit queryById(@Param("id") Integer id);
    long countByExample(MemberLimitExample example);

    int deleteByExample(MemberLimitExample example);

    int insert(MemberLimit record);

    int insertSelective(MemberLimit record);

    List<MemberLimit> selectByExample(MemberLimitExample example);

    int updateByExampleSelective(@Param("record") MemberLimit record, @Param("example") MemberLimitExample example);

    int updateByExample(@Param("record") MemberLimit record, @Param("example") MemberLimitExample example);
    /**修改剩余额度*/
    void updateEdu(@Param("id") int id, @Param("l") long l);


}
