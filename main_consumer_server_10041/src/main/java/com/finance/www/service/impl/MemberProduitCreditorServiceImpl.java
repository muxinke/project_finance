package com.finance.www.service.impl;

import com.finance.www.mapper.MemberProduitCreditorMapper;
import com.finance.www.pojo.MemberProduitCreditor;
import com.finance.www.service.MemberProduitCreditorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lenovo-pc on 2019/7/31.
 */
@Service
public class MemberProduitCreditorServiceImpl implements MemberProduitCreditorService{
    @Autowired
    private MemberProduitCreditorMapper creditorMapper;

    @Override
    public int addCreditor(MemberProduitCreditor creditor) {
        int i = creditorMapper.insert(creditor);
        return i;
    }
}
