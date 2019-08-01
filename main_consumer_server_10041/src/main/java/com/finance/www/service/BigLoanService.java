package com.finance.www.service;

import com.finance.www.pojo.BigLoan;
import com.finance.www.vo.BandMvo;

import java.util.List;

/**
 * Created by lenovo-pc on 2019/7/25.
 */
public interface BigLoanService {
    List<BandMvo> findAll();
    List<BandMvo> selectBandM(String info);
    BandMvo findUserById(int id);
    int upSt(int state,int id);
}
