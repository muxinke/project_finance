package com.finance.www.controller;

import com.finance.www.Vo.ProduitVo;
import com.finance.www.pojo.Produit;
import com.finance.www.service.IndexService;
import com.finance.www.utils.PojoZVoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Created by 杜碧天 on 2019/7/24.
 * NEW_STANDARD(1, "新手标"),
 INSURANCE_COVERS(2, "保险承保"),
 SUPPLY_CHAIN(3, "供应链"),
 CASH_DEPOSIT(4, "保证金"),
 EASY_CONSUMPTION(5, "轻松消费"),
 FINANCE_LEASE(6, "融资租赁"),
 GUARANTEE_THE(7, "担保标"),
 MORTGAGE_THE(8, "抵押标"),
 THE_CREDIT_SCALE(9, "信用标"),
 */
@Controller
public class Dcontroller {
    @Autowired
    IndexService indexService;

    @GetMapping("/")
    public String index(Model model){
        //新手标
        List<Produit> produitBySan1 = indexService.findProduitBySan(1);
        List<ProduitVo> produitVos1 = PojoZVoUtil.produitUtil(produitBySan1);
        //保险承保
        List<Produit> produitBySan2 = indexService.findProduitBySan(2);
        List<ProduitVo> produitVos2 = PojoZVoUtil.produitUtil(produitBySan2);
        //保证金
        List<Produit> produitBySan4 = indexService.findProduitBySan(4);
        List<ProduitVo> produitVos4 = PojoZVoUtil.produitUtil(produitBySan4);
        //供应链
        List<Produit> produitBySan3 = indexService.findProduitBySan(3);
        List<ProduitVo> produitVos3 = PojoZVoUtil.produitUtil(produitBySan3);
        //抵押标
        List<Produit> produitBySan8 = indexService.findProduitBySan(8);
        List<ProduitVo> produitVos8 = PojoZVoUtil.produitUtil(produitBySan8);
        //担保标
        List<Produit> produitBySan7 = indexService.findProduitBySan(7);
        List<ProduitVo> produitVos7 = PojoZVoUtil.produitUtil(produitBySan7);
        model.addAttribute("produit1s",produitVos1);
        model.addAttribute("produit2s",produitVos2);
        model.addAttribute("produit4s",produitVos4);
        model.addAttribute("produit3s",produitVos3);
        model.addAttribute("produit8s",produitVos8);
        model.addAttribute("produit7s",produitVos7);
        return "index";
    }
}
