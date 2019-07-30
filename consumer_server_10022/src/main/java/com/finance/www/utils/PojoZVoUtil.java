package com.finance.www.utils;

import com.finance.www.Vo.InvestVos;
import com.finance.www.Vo.JieKuanXxVos;
import com.finance.www.Vo.ProduitVo;
import com.finance.www.enums.*;
import com.finance.www.pojo.Produit;
import com.finance.www.pvo.InvestmentVo;
import com.finance.www.pvo.JieKuanXxVo;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by 杜碧天 on 2019/7/24.
 */
public class PojoZVoUtil {
    public static List<ProduitVo> produitUtil(List<Produit> produits){
        DecimalFormat df = new DecimalFormat("0.0");
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
            produitVo.setMontantDeOffre((df.format(Long.valueOf(produit.getMontantDeOffre())/100)));
            produitVo.setInvestmentAmount(df.format(Long.valueOf(produit.getInvestmentAmount())/100));
            produitVo.setProduitDureeDes(produit.getProduitDureeDes());
            produitVo.setProduitMarque(produit.getProduitMarque());
            produitVo.setRemboursementsExpires(produit.getRemboursementsExpires());
            String guise="";
            if(produit.getRemboursementsGuise()==1){
                guise="按期付息到期还本";
            }else if(produit.getRemboursementsGuise()==2){
                guise="按期月分期还款";
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
            produitVo.setRevenuAnnuel(df.format(Long.valueOf(produit.getRevenuAnnuel())/100));
            produitVo.setCreditFruit(produit.getCreditFruit());
            produitVo.setTotalEngagements(produit.getTotalEngagements());
            produitVo.setAutresEmprunts(produit.getAutresEmprunts());
            produitVo.setYearInterestRate(produit.getYearInterestRate());
            produitVo.setBorrowingTitle(produit.getBorrowingTitle());
            produitVo.setKetou(df.format((Long.valueOf(produit.getMontantDeOffre())/100)-(Long.valueOf(produit.getInvestmentAmount()))/100));
            //完成率
            Double aDouble = Double.valueOf(Long.valueOf(produit.getInvestmentAmount()));
            Double aDouble1 = Double.valueOf(Long.valueOf(produit.getMontantDeOffre()));
            double v = aDouble / aDouble1;
            produitVo.setWanchenglv(df.format(Math.round(v*100)));
            produitVo.setWcbaifenbi(Math.round(v*100)+"%");
            produitVo.setBiaotizi(BiaoShiEnum.getBiaoShi(produit.getInvestmentType()));
            produitVos.add(produitVo);
        }
        return produitVos;
    }
    public  static JieKuanXxVos JieKuanVozJieKuanVos(JieKuanXxVo jieKuanXxVo){
        DecimalFormat df = new DecimalFormat("0.0");
        JieKuanXxVos jieKuanXxVos = new JieKuanXxVos();
        jieKuanXxVos.setPid(jieKuanXxVo.getPid());
        jieKuanXxVos.setInvestmentType(ProduitEnum.getEnumType(jieKuanXxVo.getInvestmentType()));
        jieKuanXxVos.setProduitsOrdre(OrdreEnum.getEnumLevel(jieKuanXxVo.getProduitsOrdre()));
        jieKuanXxVos.setMontantDeOffre(df.format(Long.valueOf(jieKuanXxVo.getMontantDeOffre())/100));
        jieKuanXxVos.setInvestmentAmount(df.format(Long.valueOf(jieKuanXxVo.getInvestmentAmount())/100));
        jieKuanXxVos.setProduitDureeDes(jieKuanXxVo.getProduitDureeDes());
        jieKuanXxVos.setProduitMarque(jieKuanXxVo.getProduitMarque());
        jieKuanXxVos.setRemboursementsExpires(jieKuanXxVo.getRemboursementsExpires());
        jieKuanXxVos.setRemboursementsGuise(GuiseEnum.getGuiseTypeName(jieKuanXxVo.getRemboursementsGuise()));
        jieKuanXxVos.setIsCondition(ConditionEnum.getConditionName(jieKuanXxVo.getIsCondition()));
        jieKuanXxVos.setDateDeValeur(DateZString.dateHZhuanString(jieKuanXxVo.getDateDeValeur()));
        jieKuanXxVos.setNatureDuSujet(jieKuanXxVo.getNatureDuSujet());
        jieKuanXxVos.setSecteurActivite(jieKuanXxVos.getSecteurActivite());
        jieKuanXxVos.setRevenuAnnuel(df.format(Long.valueOf(jieKuanXxVo.getRevenuAnnuel())/100));
        jieKuanXxVos.setCreditFruit(jieKuanXxVo.getCreditFruit());
        jieKuanXxVos.setTotalEngagements(jieKuanXxVo.getTotalEngagements());
        jieKuanXxVos.setAutresEmprunts(jieKuanXxVo.getAutresEmprunts());
        jieKuanXxVos.setYearInterestRate(jieKuanXxVo.getYearInterestRate());
        jieKuanXxVos.setBorrowingTitle(jieKuanXxVo.getBorrowingTitle());
        jieKuanXxVos.setKetou(df.format((Long.valueOf(jieKuanXxVo.getMontantDeOffre())/100)-(Long.valueOf(jieKuanXxVo.getInvestmentAmount()))/100));
        //完成率
        Double aDouble = Double.valueOf(Long.valueOf(jieKuanXxVo.getInvestmentAmount()));
        Double aDouble1 = Double.valueOf(Long.valueOf(jieKuanXxVo.getMontantDeOffre()));
        double v = aDouble / aDouble1;
        jieKuanXxVos.setWanchenglv(df.format(Math.round(v*100)));
        jieKuanXxVos.setWcbaifenbi(Math.round(v*100)+"%");
        jieKuanXxVos.setNumberSuccess(jieKuanXxVo.getNumberSuccess());
        jieKuanXxVos.setFlowStandardNumber(jieKuanXxVo.getFlowStandardNumber());
        jieKuanXxVos.setSuccessPaymentNumber(jieKuanXxVo.getSuccessPaymentNumber());
        jieKuanXxVos.setSecteurActivite(jieKuanXxVo.getSecteurActivite());
        jieKuanXxVos.setDaysOverdue(jieKuanXxVo.getDaysOverdue());
        jieKuanXxVos.setOverdueBillsNumber(jieKuanXxVo.getOverdueBillsNumber());
        jieKuanXxVos.setPrepaymentPeriodsNumber(jieKuanXxVo.getPrepaymentPeriodsNumber());
        jieKuanXxVos.setMore30daysOverdue(jieKuanXxVo.getMore30daysOverdue());
        jieKuanXxVos.setDaihuancs(jieKuanXxVo.getNumberSuccess()-jieKuanXxVo.getSuccessPaymentNumber());
        jieKuanXxVos.setDebtorParticulars(jieKuanXxVo.getDebtorParticulars());
        jieKuanXxVos.setGuarantorDetails(jieKuanXxVo.getGuarantorDetails());
        jieKuanXxVos.setLoansUsed(jieKuanXxVo.getLoansUsed());
        jieKuanXxVos.setSourceRepayment(jieKuanXxVo.getSourceRepayment());
        jieKuanXxVos.setBiaoShiXiaoZi(BiaoShiEnum.getBiaoShi(jieKuanXxVo.getInvestmentType()));
       // 剩余时间的毫秒值
        //产品期限
        Integer qx = jieKuanXxVo.getProduitDureeDes();
        System.out.println(qx);
        Date createTime = jieKuanXxVo.getCreateTime();
        Date date = DateMonthUtil.stepMonth(createTime, qx);
        System.out.println(date);
        long l = (date.getTime())- (System.currentTimeMillis());
        System.out.println(l);
        jieKuanXxVos.setDateShengyu( String.valueOf(l));
        jieKuanXxVos.setFinalOpinion(jieKuanXxVo.getFinalOpinion());
        return jieKuanXxVos;
    }
    public static  List<InvestVos> getInvestVos(List<InvestmentVo> investmentVos){
        DecimalFormat df = new DecimalFormat("0.0");
        ArrayList<InvestVos> investVos = new ArrayList<>();
        for(InvestmentVo investmentVo:investmentVos){
            InvestVos investVos1 = new InvestVos();
            investVos1.setId(investmentVo.getId());
            investVos1.setInvestName(investmentVo.getInvestName());
            investVos1.setJine(df.format(Long.valueOf(investmentVo.getJine())/100));
            investVos1.setYxjine(df.format(Long.valueOf(investmentVo.getJine())/100));
            investVos1.setInvesttime(investmentVo.getInvesttime());
            investVos1.setInvestWay(investmentVo.getInvestWay());
            investVos.add(investVos1);
        }
        return investVos;
    }
}
