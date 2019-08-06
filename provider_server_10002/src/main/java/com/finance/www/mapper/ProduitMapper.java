package com.finance.www.mapper;

import com.finance.www.pojo.Produit;
import com.finance.www.pojo.ProduitExample;
import java.util.List;

import com.finance.www.pvo.JieKuanXxVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ProduitMapper {
    int countByExample(ProduitExample example);

    int deleteByExample(ProduitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Produit record);

    int insertSelective(Produit record);

    List<Produit> selectByExample(ProduitExample example);

    Produit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Produit record, @Param("example") ProduitExample example);

    int updateByExample(@Param("record") Produit record, @Param("example") ProduitExample example);

    int updateByPrimaryKeySelective(Produit record);

    int updateByPrimaryKey(Produit record);
    JieKuanXxVo chajkXx(@Param("pid")Integer pid);

    Integer chaCountBytype(@Param("userid")Integer userid,@Param("biaotype") Integer biaotype);
    String chaProduitMember(@Param("pid")Integer pid);
    String chaMoneys();
}