package com.finance.www.mapper;

import com.finance.www.pojo.MemberCard;
import com.finance.www.pojo.MemberCardExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MemberCardMapper {
    long countByExample(MemberCardExample example);

    int deleteByExample(MemberCardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MemberCard record);

    int insertSelective(MemberCard record);

    List<MemberCard> selectByExample(MemberCardExample example);

    MemberCard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MemberCard record, @Param("example") MemberCardExample example);

    int updateByExample(@Param("record") MemberCard record, @Param("example") MemberCardExample example);

    int updateByPrimaryKeySelective(MemberCard record);

    int updateByPrimaryKey(MemberCard record);
}