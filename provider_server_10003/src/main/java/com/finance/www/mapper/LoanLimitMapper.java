package com.finance.www.mapper;

import com.finance.www.pojo.LoanLimit;
import com.finance.www.pojo.LoanLimitExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface LoanLimitMapper {
    long countByExample(LoanLimitExample example);

    int deleteByExample(LoanLimitExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(LoanLimit record);

    int insertSelective(LoanLimit record);

    List<LoanLimit> selectByExample(LoanLimitExample example);

    LoanLimit selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") LoanLimit record, @Param("example") LoanLimitExample example);

    int updateByExample(@Param("record") LoanLimit record, @Param("example") LoanLimitExample example);

   int updateByPrimaryKeySelective(LoanLimit record);

    int updateByPrimaryKey(int record);
    int updateByUid(@Param("userid")Integer userid,@Param("edu")Long edu);

}