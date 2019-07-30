package com.finance.www.service;

import com.finance.www.vox.AddBigLoan;

import java.util.ArrayList;

/**
 * Created by Administrator on 2019/7/26.
 */
public interface BigLoanService {
    //根据用户id添加其大额贷款记录
    public int addBigLoan(ArrayList<AddBigLoan> list);


}
