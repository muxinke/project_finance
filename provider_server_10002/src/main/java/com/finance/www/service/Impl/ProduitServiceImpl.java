package com.finance.www.service.Impl;

import com.finance.www.mapper.ProduitMapper;
import com.finance.www.pojo.Produit;
import com.finance.www.pojo.ProduitExample;
import com.finance.www.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 杜碧天 on 2019/7/24.
 */
@Service
public class ProduitServiceImpl implements ProduitService{
    @Autowired
    ProduitMapper produitMapper;
    @Override
    public List<Produit> chaProduitsanBytype(Integer ProduitType) {
        ProduitExample produitExample = new ProduitExample();
        ProduitExample.Criteria criteria = produitExample.createCriteria();
        criteria.andInvestmentTypeEqualTo(ProduitType);
        List<Produit> produits = produitMapper.selectByExample(produitExample);
        List<Produit> produits1 = new ArrayList<>();
        if(ProduitType==1){
            produits1.add(produits.get(produits.size()-1));
        }else {
            produits1.add(produits.get(produits.size()-1));
            produits1.add(produits.get(produits.size()-2));
            produits1.add(produits.get(produits.size()-3));
        }

        return produits1;
    }
}
