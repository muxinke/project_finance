package com.finance.www.service.impl;

import com.finance.www.mapper.ProduitMapper;
import com.finance.www.pojo.Produit;
import com.finance.www.pojo.ProduitExample;
import com.finance.www.service.ProduitService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lenovo-pc on 2019/7/30.
 */
@Service
public class ProduitServiceImpl implements ProduitService {
    @Autowired
    private ProduitMapper produitMapper;
    @Override
    public int addProduit(Produit produit) {
        ProduitExample example = new ProduitExample();
        ProduitExample.Criteria criteria = example.createCriteria();
        int i = produitMapper.insert(produit);
        return i;
    }
}
