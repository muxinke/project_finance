package com.finance.www.service;

import com.finance.www.pojo.ProduitImg;

import java.util.List;

/**
 * Created by 杜碧天 on 2019/7/26.
 */
public interface ProduitImgService {
    //根据传过来的商品id查询对应的图片
    List<ProduitImg> chaProduitImgById(Integer pid);
}
