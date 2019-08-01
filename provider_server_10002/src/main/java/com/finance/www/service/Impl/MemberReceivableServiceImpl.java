package com.finance.www.service.Impl;

import com.finance.www.mapper.MemberReceivableMapper;
import com.finance.www.mapper.ProduitMapper;
import com.finance.www.pojo.MemberReceivable;
import com.finance.www.pojo.Produit;
import com.finance.www.service.MemberReceivableService;
import com.finance.www.utils.DateMonthUtil;
import com.finance.www.utils.StringFloatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by 杜碧天 on 2019/7/30.
 */
@Service
public class MemberReceivableServiceImpl implements MemberReceivableService {
    @Autowired
    MemberReceivableMapper memberReceivableMapper;
    @Autowired
    ProduitMapper produitMapper;
    @Override
    @Async("asyncServiceExecutor")
    public void addMemberReceivble(Integer userid, Integer pid, Integer benjins) {
        MemberReceivable mr = new MemberReceivable();
        Produit produit = produitMapper.selectByPrimaryKey(pid);
        Integer produitDureeDes = produit.getProduitDureeDes();
        //利率
        String yearInterestRate = produit.getYearInterestRate();
        float v = StringFloatUtils.stringFloat(yearInterestRate);
        float v1 = v * ((float) (Math.round((produitDureeDes / 12) * 100)) / 100);
        float v2 = v1 / produitDureeDes;
        //还款期限
        Integer huankuanday = produit.getRemboursementsExpires();
        //气息时间
        Date  dv= produit.getDateDeValeur();
        for(Integer a=1;a<=produitDureeDes;a++) {
            //投资列表iddv
            mr.setProduitId(pid);
            //userid
            mr.setMemberId(userid);
            //应收日期
            mr.setAccountsReceivableDate(DateMonthUtil.stepMonth(dv,a));
            //档期/总数
            String dq=a+"/"+huankuanday;
            mr.setCurrentTotal(dq);
            //代收本金
            mr.setCollectedPrincipal(String.valueOf(benjins));
            //待收利息
            mr.setCollectingInterest(String.valueOf(v1));
            //代收总额
            mr.setCollectingTotal(String.valueOf(benjins+v1));
            //管理费
            mr.setManagementFee("1");
            //状态
            mr.setState(0);
            //应收本金
            mr.setShouldPrincipal(String.valueOf(benjins));
            //应收总额
            mr.setReceivableAccount(String.valueOf(benjins+v1));
            //实收ben息
            mr.setPaidPrincipalInterest(String.valueOf(benjins+(v2*a)));
            //实收利息
            mr.setPaidInterest(String.valueOf(v2*a));
            memberReceivableMapper.insertSelective(mr);
        }
    }
}
