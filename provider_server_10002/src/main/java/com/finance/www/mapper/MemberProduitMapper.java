
package com.finance.www.mapper;

import com.finance.www.pojo.MemberProduit;
import com.finance.www.pojo.MemberProduitExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MemberProduitMapper {
    long countByExample(MemberProduitExample example);

    int deleteByExample(MemberProduitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MemberProduit record);

    int insertSelective(MemberProduit record);

    List<MemberProduit> selectByExample(MemberProduitExample example);

    MemberProduit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MemberProduit record, @Param("example") MemberProduitExample example);

    int updateByExample(@Param("record") MemberProduit record, @Param("example") MemberProduitExample example);

    int updateByPrimaryKeySelective(MemberProduit record);

    int updateByPrimaryKey(MemberProduit record);
}
