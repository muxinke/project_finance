package com.finance.www.controller;

import com.finance.www.pojo.Produit;
import com.finance.www.pojo.ProduitImg;
import com.finance.www.service.ProduitImgService;
import com.finance.www.service.ProduitService;
import com.finance.www.pvo.JieKuanXxVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by 杜碧天 on 2019/7/24.
 */
@RestController
public class TController {
    @Autowired
    ProduitImgService produitImgService;
    @Autowired
    ProduitService produitService;
    @RequestMapping(value = "/findtypesan",method = RequestMethod.GET)
    public List<Produit> findProduitBySan(@RequestParam(value = "pt") Integer pt){
        List<Produit> produits = produitService.chaProduitsanBytype(pt);
        return produits;
    }
    //商品列表
    @RequestMapping(value = "/findAllp",method =RequestMethod.GET)
    List<Produit> findProduitBytype(@RequestParam(value = "pt")Integer pt){
        List<Produit> produits = produitService.chaProduitBytype(pt);
        return produits;
    }
    //商品详情
    @RequestMapping(value = "/findproduitbyid",method = RequestMethod.GET)
    JieKuanXxVo findProduitByPid(@RequestParam(value = "pid")Integer pid){
        JieKuanXxVo jieKuanXxVo = produitService.chaProduitBypid(pid);
        return jieKuanXxVo;
    }
    //商品的图片
    @RequestMapping(value = "/findProduitImgById",method = RequestMethod.GET)
    List<ProduitImg> findProduitImgById(@RequestParam(value = "pid")Integer pid){
        List<ProduitImg> produitImgs = produitImgService.chaProduitImgById(pid);
        return produitImgs;
    }
}
