package com.finance.www.mapper;

import com.finance.www.pojo.MemberLimit;
import com.finance.www.pojo.MemberLimitExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MemberLimitMapper {
    long countByExample(MemberLimitExample example);

    int deleteByExample(MemberLimitExample example);

    int insert(MemberLimit record);

    int insertSelective(MemberLimit record);

    List<MemberLimit> selectByExample(MemberLimitExample example);

    int updateByExampleSelective(@Param("record") MemberLimit record, @Param("example") MemberLimitExample example);

    int updateByExample(@Param("record") MemberLimit record, @Param("example") MemberLimitExample example);
}