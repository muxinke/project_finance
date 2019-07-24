package com.finance.www.mapper;

import com.finance.www.pojo.MemberProduitCreditor;
import com.finance.www.pojo.MemberProduitCreditorExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MemberProduitCreditorMapper {
    long countByExample(MemberProduitCreditorExample example);

    int deleteByExample(MemberProduitCreditorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MemberProduitCreditor record);

    int insertSelective(MemberProduitCreditor record);

    List<MemberProduitCreditor> selectByExample(MemberProduitCreditorExample example);

    MemberProduitCreditor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MemberProduitCreditor record, @Param("example") MemberProduitCreditorExample example);

    int updateByExample(@Param("record") MemberProduitCreditor record, @Param("example") MemberProduitCreditorExample example);

    int updateByPrimaryKeySelective(MemberProduitCreditor record);

    int updateByPrimaryKey(MemberProduitCreditor record);
}