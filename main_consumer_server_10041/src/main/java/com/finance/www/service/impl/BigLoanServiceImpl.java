package com.finance.www.service.impl;

import com.finance.www.mapper.BigLoanMapper;
import com.finance.www.pojo.BigLoan;
import com.finance.www.pojo.BigLoanExample;
import com.finance.www.service.BigLoanService;
import com.finance.www.vo.BandMvo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lenovo-pc on 2019/7/25.
 */
@Service
public class BigLoanServiceImpl implements BigLoanService {
    @Autowired
    private BigLoanMapper bigLoanMapper;
    @Override
    public List<BandMvo> findAll() {
        List<BandMvo> list = bigLoanMapper.findBandM();

        return list;
    }

    @Override
    public List<BandMvo> selectBandM(String info) {
        List<BandMvo> list = bigLoanMapper.selectBandM(info);

        return list;
    }

    @Override
    public BandMvo findUserById(int id) {
        BandMvo userById = bigLoanMapper.findUserById(id);
        return userById;
    }

    @Override
    public int upSt(int state,int id) {
        int i = bigLoanMapper.upSt(state, id);
        return i;
    }
}
