package com.finance.www.mapper;

import com.finance.www.pojo.MemberTrarecords;
import com.finance.www.pojo.MemberTrarecordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MemberTrarecordsMapper {
    long countByExample(MemberTrarecordsExample example);

    int deleteByExample(MemberTrarecordsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MemberTrarecords record);

    int insertSelective(MemberTrarecords record);

    List<MemberTrarecords> selectByExample(MemberTrarecordsExample example);

    MemberTrarecords selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MemberTrarecords record, @Param("example") MemberTrarecordsExample example);

    int updateByExample(@Param("record") MemberTrarecords record, @Param("example") MemberTrarecordsExample example);

    int updateByPrimaryKeySelective(MemberTrarecords record);

    int updateByPrimaryKey(MemberTrarecords record);
}