package com.finance.www.service.impl;

import com.finance.www.mapper.ProduitImgMapper;
import com.finance.www.pojo.ProduitImg;
import com.finance.www.pojo.ProduitImgExample;
import com.finance.www.service.ProduitImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lenovo-pc on 2019/7/30.
 */
@Service
public class ProduitImgServiceImpl implements ProduitImgService {
    @Autowired
    private ProduitImgMapper produitImgMapper;
    @Override
    public int addProImg(ProduitImg produitImg) {
        int i = produitImgMapper.insert(produitImg);
        return i;
    }
}
