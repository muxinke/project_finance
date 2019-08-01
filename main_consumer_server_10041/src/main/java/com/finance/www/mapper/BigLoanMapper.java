package com.finance.www.mapper;

import com.finance.www.pojo.BigLoan;
import com.finance.www.pojo.BigLoanExample;
import java.util.List;

import com.finance.www.vo.BandMvo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BigLoanMapper {
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
	
	List<BandMvo> findBandM();

    List<BandMvo> selectBandM(String info);

    BandMvo findUserById(int id);

    int upSt(@Param("state") int state,@Param("id") int id);
}