package com.finance.www.utils;

import com.finance.www.Vo.ProduitVo;
import com.finance.www.enums.ProduitEnum;
import com.finance.www.pojo.Produit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 杜碧天 on 2019/7/24.
 */
public class PojoZVoUtil {
    public static List<ProduitVo> produitUtil(List<Produit> produits){
        ArrayList<ProduitVo> produitVos = new ArrayList<>();
        for(Produit produit:produits){
            ProduitVo produitVo = new ProduitVo();
            produitVo.setId(produit.getId());
            produitVo.setInvestmentType(ProduitEnum.getEnumType(produit.getInvestmentType()));
            String order="";
            if(produit.getProduitsOrdre()==1){
                order="A";
            }else if(produit.getProduitsOrdre()==2){
                order="AA";
            }else {
                order="AAA";
            }
            produitVo.setProduitsOrdre(order);
            produitVo.setMontantDeOffre(produit.getMontantDeOffre());
            produitVo.setInvestmentAmount(produit.getInvestmentAmount());
            produitVo.setProduitDureeDes(produit.getProduitDureeDes());
            produitVo.setProduitMarque(produit.getProduitMarque());
            produitVo.setRemboursementsExpires(produit.getRemboursementsExpires());
            String guise="";
            if(produit.getRemboursementsGuise()==1){
                guise="按期付息到期还本";
            }else if(produit.getRemboursementsGuise()==2){
                guise="按期付息到期还本";
            }else {
                guise="到期全额还款";
            }
            produitVo.setRemboursementsGuise(guise);
            String condition="";
            if(produit.getIsCondition()==1){
                condition="投标中";
            }else if(produit.getIsCondition()==2){
                condition="等待复核";
            }else {
                condition="还款中";
            }
            produitVo.setIsCondition(condition);
            produitVo.setDateDeValeur(produit.getDateDeValeur());
            produitVo.setNatureDuSujet(produit.getNatureDuSujet());
            produitVo.setSecteurActivite(produit.getSecteurActivite());
            produitVo.setRevenuAnnuel(produit.getRevenuAnnuel());
            produitVo.setCreditFruit(produit.getCreditFruit());
            produitVo.setTotalEngagements(produit.getTotalEngagements());
            produitVo.setAutresEmprunts(produit.getAutresEmprunts());
            produitVo.setYearInterestRate(produit.getYearInterestRate());
            produitVo.setBorrowingTitle(produit.getBorrowingTitle());
            produitVos.add(produitVo);
        }
        return produitVos;
    }
}
