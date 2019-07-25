package com.finance.www.service;

import com.finance.www.pojo.Produit;

import java.util.List;

/**
 * Created by 杜碧天 on 2019/7/24.
 */
public interface ProduitService {
    //随机查询各个类别的投资项目三个展示到首页
    List<Produit> chaProduitsanBytype(Integer ProduitType);
}
