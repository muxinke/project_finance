package com.finance.www.controller;

import com.finance.www.pojo.Produit;
import com.finance.www.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 杜碧天 on 2019/7/24.
 */
@RestController
public class TController {
    @Autowired
    ProduitService produitService;
    @GetMapping("findProduitBySan")
    public List<Produit> findProduitBySan(@RequestParam(value = "ProduitType") Integer ProduitType){
        List<Produit> produits = produitService.chaProduitsanBytype(ProduitType);
        return produits;
    }
}
