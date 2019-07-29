package com.finance.www.mapper;

import com.finance.www.pojo.BigloanImgurl;
import com.finance.www.pojo.BigloanImgurlExample;
import java.util.List;

import com.finance.www.vo.AddBigLoanImg;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BigloanImgurlMapper {
    int countByExample(BigloanImgurlExample example);

    int deleteByExample(BigloanImgurlExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BigloanImgurl record);

    int insertSelective(BigloanImgurl record);

    List<BigloanImgurl> selectByExample(BigloanImgurlExample example);

    BigloanImgurl selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BigloanImgurl record, @Param("example") BigloanImgurlExample example);

    int updateByExample(@Param("record") BigloanImgurl record, @Param("example") BigloanImgurlExample example);

    int updateByPrimaryKeySelective(BigloanImgurl record);

    int updateByPrimaryKey(BigloanImgurl record);

    int addBigloanImg(@Param("mid") int id,@Param("imgUrl") String imgUrl);
}