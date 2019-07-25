package com.finance.www.service;

import com.finance.www.pojo.Produit;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by 杜碧天 on 2019/7/24.
 */
@FeignClient(name = "provider_server2")
public interface IndexService {
    @GetMapping("findProduitBySan")
    public List<Produit> findProduitBySan(@RequestParam(value = "ProduitType") Integer ProduitType);
}
