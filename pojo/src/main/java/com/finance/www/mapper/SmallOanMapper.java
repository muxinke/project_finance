package com.finance.www.mapper;

import com.finance.www.pojo.SmallOan;
import com.finance.www.pojo.SmallOanExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SmallOanMapper {
    long countByExample(SmallOanExample example);

    int deleteByExample(SmallOanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SmallOan record);

    int insertSelective(SmallOan record);

    List<SmallOan> selectByExample(SmallOanExample example);

    SmallOan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SmallOan record, @Param("example") SmallOanExample example);

    int updateByExample(@Param("record") SmallOan record, @Param("example") SmallOanExample example);

    int updateByPrimaryKeySelective(SmallOan record);

    int updateByPrimaryKey(SmallOan record);
}