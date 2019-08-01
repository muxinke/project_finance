package com.finance.www.mapper;

import com.finance.www.pojo.RecordMemberTender;
import com.finance.www.pojo.RecordMemberTenderExample;
import java.util.List;

import com.finance.www.pvo.InvestmentVo;
import lombok.Data;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface RecordMemberTenderMapper {
    int countByExample(RecordMemberTenderExample example);

    int deleteByExample(RecordMemberTenderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RecordMemberTender record);

    int insertSelective(RecordMemberTender record);

    List<RecordMemberTender> selectByExample(RecordMemberTenderExample example);

    RecordMemberTender selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RecordMemberTender record, @Param("example") RecordMemberTenderExample example);

    int updateByExample(@Param("record") RecordMemberTender record, @Param("example") RecordMemberTenderExample example);

    int updateByPrimaryKeySelective(RecordMemberTender record);

    int updateByPrimaryKey(RecordMemberTender record);
    List<InvestmentVo> findInvestmentBypid(@Param("pid")Integer pid);
}