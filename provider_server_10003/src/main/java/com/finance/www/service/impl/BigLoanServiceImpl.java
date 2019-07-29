package com.finance.www.service.impl;

import com.finance.www.mapper.BigLoanMapper;
import com.finance.www.mapper.BigloanImgurlMapper;
import com.finance.www.service.BigLoanService;
import com.finance.www.voxx.AddBigLoan;
import com.finance.www.voxx.BasicAddBigLoan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.ArrayList;

/**
 * Created by Administrator on 2019/7/26.
 */
@EnableTransactionManagement
@Service
public class BigLoanServiceImpl implements BigLoanService {
    @Autowired
    private BigLoanMapper bigLoanMapper;
    @Autowired
    private BigloanImgurlMapper bigloanImgurlMapper;
    /**开启事务,添加记录和保存照片  操作两张表*/
    @Transactional(rollbackFor = Exception.class)
    @Override
    public int addBigLoan(ArrayList<AddBigLoan> list) {
        BasicAddBigLoan basicAddBigLoan = list.get(0);
        /**操作贷款表记录数据*/
        try {
            int bigLoan = bigLoanMapper.addBigLoan(basicAddBigLoan);
            int id=basicAddBigLoan.getId();
            System.out.println(id+"&&&&&&&&&&&&&&&&&&&&&&&&");
            /**操作图片表*/
            for(int i = 0;i<list.size();i++){
                bigloanImgurlMapper.addBigloanImg(id,list.get(i).getImgUrl1());
            }
        } catch (Exception e) {
            e.printStackTrace();
            /**手动设置回滚*/
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return 0;
        }
        return 1;
    }


}
