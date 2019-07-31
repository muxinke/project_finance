package com.finance.www.service;

import com.finance.www.pojo.Produit;
import com.finance.www.pvo.JieKuanXxVo;
import com.finance.www.pvo.PageVo;

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
    //根据标的类型与标的还款方式，标的还款时间来获取资源并分页
    PageVo chaProduitByPage(String ProduitType, String style, String timeLimit,Integer page);
    //根据userid和标的类型来查询投该类型标的次数
    Integer chaCountByIdType(Integer userid,Integer biaotype);
}
