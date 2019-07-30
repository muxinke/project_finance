package com.finance.www.service.Impl;

import com.finance.www.mapper.MemberProduitMapper;
import com.finance.www.mapper.ProduitMapper;
import com.finance.www.pojo.MemberProduit;
import com.finance.www.pojo.Produit;
import com.finance.www.service.MemberProduitService;
import com.finance.www.utils.DateMonthUtil;
import com.finance.www.utils.StringFloatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by 杜碧天 on 2019/7/29.
 */
@Service
public class MemberProduitServiceImpl implements MemberProduitService{
    @Autowired
    MemberProduitMapper memberProduitMapper;
    @Autowired
    ProduitMapper produitMapper;
    @Override
    @Async("asyncServiceExecutor")
    public void addTouZiGuanLi(Integer userid,Integer pid,Integer benjis) {
        MemberProduit memberProduit = new MemberProduit();
        Produit produit = produitMapper.selectByPrimaryKey(pid);
        String yearInterestRate = produit.getYearInterestRate();
        Integer produitDureeDes = produit.getProduitDureeDes();
        float lilv = StringFloatUtils.stringFloat(yearInterestRate);
        //预期收益
        Double v = Double.valueOf(benjis * lilv);
        //投标时间
        Date date = new Date();
        //应收本息
        double v1 = benjis + v * ((float)(Math.round(( produitDureeDes / 12)*100))/100);
        //存进来都时未结清项目
        //会员id
        memberProduit.setMemberId(userid);
        //投资列表id
        memberProduit.setProduitId(pid);
        //预期收益
        memberProduit.setPredictIncome(String.valueOf(v));
        //投标时间
        memberProduit.setTenderDate(date);
        //投资本金
        memberProduit.setPrincipal(String.valueOf(benjis));
        //应收本息
        memberProduit.setReceivable(String.valueOf(v1));
        //投标状态
        memberProduit.setIsState(0);
        memberProduitMapper.insertSelective(memberProduit);
    }
}
