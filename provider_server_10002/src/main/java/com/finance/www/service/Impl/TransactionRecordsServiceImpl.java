package com.finance.www.service.Impl;

import com.finance.www.mapper.ProduitMapper;
import com.finance.www.mapper.TransactionRecordsMapper;
import com.finance.www.pojo.Produit;
import com.finance.www.pojo.TransactionRecords;
import com.finance.www.service.TransactionRecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by 杜碧天 on 2019/7/30.
 */
@Service
public class TransactionRecordsServiceImpl implements TransactionRecordsService {
    @Autowired
    TransactionRecordsMapper transactionRecordsMapper;
    @Autowired
    ProduitMapper produitMapper;

    @Override
    @Async("asyncServiceExecutor")
    public void addjiaoyijl(Integer userid, Integer benjins, Integer pid) {
        String member= produitMapper.chaProduitMember(pid);
        TransactionRecords transactionRecords = new TransactionRecords();
        transactionRecords.setJytype(3);
        transactionRecords.setJine(String.valueOf(benjins));
        transactionRecords.setDealingParty(member);
        transactionRecords.setMemberId(userid);
        transactionRecordsMapper.insertSelective(transactionRecords);
    }
}
