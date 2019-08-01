package com.finance.www.mapper;

import com.finance.www.pojo.Memeber;
import com.finance.www.pojo.MemeberExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface MemeberMapper {
    int countByExample(MemeberExample example);

    int deleteByExample(MemeberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Memeber record);

    int insertSelective(Memeber record);

    List<Memeber> selectByExample(MemeberExample example);

    Memeber selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Memeber record, @Param("example") MemeberExample example);

    int updateByExample(@Param("record") Memeber record, @Param("example") MemeberExample example);

    int updateByPrimaryKeySelective(Memeber record);

    int updateByPrimaryKey(Memeber record);
}