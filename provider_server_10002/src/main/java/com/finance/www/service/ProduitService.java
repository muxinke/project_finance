package com.finance.www.service;

import com.finance.www.pojo.Produit;
import com.finance.www.pvo.JieKuanXxVo;

import java.util.List;

/**
 * Created by 杜碧天 on 2019/7/24.
 */
public interface ProduitService {
    //随机查询各个类别的投资项目三个展示到首页
    List<Produit> chaProduitsanBytype(Integer ProduitType);
    //根据类型查询展示到商品列表
    List<Produit> chaProduitBytype(Integer pt);
    //查询一个商品的详细信息
    JieKuanXxVo chaProduitBypid(Integer pid);
    //根据商品来查询上传的图片

}
