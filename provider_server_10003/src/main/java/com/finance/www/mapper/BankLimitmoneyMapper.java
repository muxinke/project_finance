package com.finance.www.mapper;

import com.finance.www.pojo.BankLimitmoney;
import com.finance.www.pojo.BankLimitmoneyExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BankLimitmoneyMapper {
    int countByExample(BankLimitmoneyExample example);

    int deleteByExample(BankLimitmoneyExample example);

    int deleteByPrimaryKey(Integer bankId);

    int insert(BankLimitmoney record);

    int insertSelective(BankLimitmoney record);

    List<BankLimitmoney> selectByExample(BankLimitmoneyExample example);

    BankLimitmoney selectByPrimaryKey(Integer bankId);

    int updateByExampleSelective(@Param("record") BankLimitmoney record, @Param("example") BankLimitmoneyExample example);

    int updateByExample(@Param("record") BankLimitmoney record, @Param("example") BankLimitmoneyExample example);

    int updateByPrimaryKeySelective(BankLimitmoney record);

    int updateByPrimaryKey(BankLimitmoney record);

    //根据name查询
    BankLimitmoney findByName(String bankName);
}