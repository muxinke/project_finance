package com.finance.www.service.Impl;

import com.finance.www.mapper.ProduitMapper;
import com.finance.www.pojo.Produit;
import com.finance.www.pojo.ProduitExample;
import com.finance.www.pvo.PageVo;
import com.finance.www.service.ProduitService;
import com.finance.www.pvo.JieKuanXxVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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

    @Override
    public List<Produit> chaProduitBytype(Integer pt) {
        ProduitExample produitExample = new ProduitExample();
        ProduitExample.Criteria criteria = produitExample.createCriteria();
        if(!"".equals(pt)) {
            criteria.andInvestmentTypeEqualTo(pt);
            List<Produit> produits = produitMapper.selectByExample(produitExample);
            return produits;
        }else {
            List<Produit> produits = produitMapper.selectByExample(produitExample);
            return produits;
        }

    }

    @Override
    public JieKuanXxVo  chaProduitBypid(Integer pid) {
        JieKuanXxVo jieKuanXxVo = produitMapper.chajkXx(pid);
        return jieKuanXxVo;
    }

    @Override
    public PageVo chaProduitByPage(String ProduitType, String style, String timeLimit,Integer page) {
        ProduitExample produitExample = new ProduitExample();
        ProduitExample.Criteria criteria = produitExample.createCriteria();
        if(!"".equals(ProduitType)) {
            Integer biaotype = Integer.valueOf(ProduitType);
            criteria.andInvestmentTypeEqualTo(biaotype);
        }
        if(!"".equals(style)){
            Integer style1 = Integer.valueOf(style);
            criteria.andRemboursementsGuiseEqualTo(style1);
        }
        if(!"".equals(timeLimit)){
            Integer timeLimit1 = Integer.valueOf(timeLimit);
            if(timeLimit1==6){
                criteria.andRemboursementsExpiresBetween(1,6);
            }else if(timeLimit1==12){
                criteria.andRemboursementsExpiresBetween(7,12);
            }else {
                criteria.andRemboursementsExpiresBetween(13,24);
            }
        }
        PageHelper.startPage(page,6);
        List<Produit> produits = produitMapper.selectByExample(produitExample);
        PageInfo<Produit> pg = new PageInfo<>(produits);
        Integer total =(int) pg.getTotal();
        PageVo pageVo = new PageVo();
        pageVo.setKk(produits);
        pageVo.setTotal(total);
        return pageVo;
    }

}
