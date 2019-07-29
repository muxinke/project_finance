package com.finance.www.service;

import com.finance.www.vo.AddBigLoan;
import com.finance.www.vo.AddBigLoanImg;
import com.finance.www.vo.BasicAddBigLoan;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/7/26.
 */
public interface BigLoanService {
    //根据用户id添加其大额贷款记录
    public int addBigLoan(ArrayList<AddBigLoan> list);


}
