package com.finance.www.mapper;

import com.finance.www.pojo.ProduitImg;
import com.finance.www.pojo.ProduitImgExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ProduitImgMapper {
    int countByExample(ProduitImgExample example);

    int deleteByExample(ProduitImgExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProduitImg record);

    int insertSelective(ProduitImg record);

    List<ProduitImg> selectByExample(ProduitImgExample example);

    ProduitImg selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProduitImg record, @Param("example") ProduitImgExample example);

    int updateByExample(@Param("record") ProduitImg record, @Param("example") ProduitImgExample example);

    int updateByPrimaryKeySelective(ProduitImg record);

    int updateByPrimaryKey(ProduitImg record);
}