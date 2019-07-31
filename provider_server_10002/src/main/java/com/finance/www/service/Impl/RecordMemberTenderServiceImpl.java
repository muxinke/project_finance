package com.finance.www.service.Impl;

import com.finance.www.mapper.ProduitMapper;
import com.finance.www.mapper.RecordMemberTenderMapper;
import com.finance.www.pojo.Produit;
import com.finance.www.pojo.RecordMemberTender;
import com.finance.www.pojo.RecordMemberTenderExample;
import com.finance.www.pvo.InvestmentVo;
import com.finance.www.service.RecordMemberTenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by 杜碧天 on 2019/7/27.
 */
@Service
public class RecordMemberTenderServiceImpl implements RecordMemberTenderService{
    @Autowired
    RecordMemberTenderMapper rmtMapper;
    @Autowired
    ProduitMapper produitMapper;
    @Override
    public List<InvestmentVo> chaInvestmentBypid(Integer pid) {
       List<InvestmentVo> investments = rmtMapper.findInvestmentBypid(pid);

        return investments;
    }

    @Override
    @Async("asyncServiceExecutor")
    public void addtoubiaojilu(Integer userid, Integer pid, Integer benjins) {
        Produit produit = produitMapper.selectByPrimaryKey(pid);
        //已投金额
        String investmentAmount = produit.getInvestmentAmount();
       /* //投标金额
        String montantDeOffre = produit.getMontantDeOffre();*/
        RecordMemberTender recordMemberTender = new RecordMemberTender();
        recordMemberTender.setMemberId(userid);
        recordMemberTender.setProduitId(pid);
        recordMemberTender.setInvestmentTime(new Date());
        recordMemberTender.setInvestmentWay(1);
        recordMemberTender.setInvestmentAmount(String.valueOf(benjins)+"00");
        String newinvestmentAmount=String.valueOf((Integer.valueOf(investmentAmount))+benjins*100);
        //将已投金额改为新的已投金额
        Produit produit1 = new Produit();
        produit1.setId(pid);
        produit1.setInvestmentAmount(newinvestmentAmount);
        produitMapper.updateByPrimaryKeySelective(produit1);
        rmtMapper.insertSelective(recordMemberTender);
    }
}
