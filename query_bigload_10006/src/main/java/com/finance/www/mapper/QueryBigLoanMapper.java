package com.finance.www.mapper;

import com.finance.www.pojo.BigLoan;
import com.finance.www.pojo.BigLoanExample;
import java.util.List;

import com.finance.www.vo.ApplyMoney;
import com.finance.www.vox.BasicAddBigLoan;
import com.netflix.ribbon.proxy.annotation.ClientProperties;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface QueryBigLoanMapper {
    int countByExample(BigLoanExample example);

    int deleteByExample(BigLoanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BigLoan record);

    int insertSelective(BigLoan record);

    List<BigLoan> selectByExample(BigLoanExample example);

    BigLoan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BigLoan record, @Param("example") BigLoanExample example);

    int updateByExample(@Param("record") BigLoan record, @Param("example") BigLoanExample example);

    int updateByPrimaryKeySelective(BigLoan record);

    int updateByPrimaryKey(BigLoan record);

    int addBigLoan(BasicAddBigLoan basicAddBigLoan);

    List<ApplyMoney> query(@Param("memberId")int memberId,@Param("state") int state);

    List<ApplyMoney> selectInfo(@Param("memberId") int memberId,@Param("state") int state);
}