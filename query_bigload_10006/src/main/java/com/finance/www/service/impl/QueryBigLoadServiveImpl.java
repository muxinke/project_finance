package com.finance.www.service.impl;

import com.finance.www.mapper.QueryBigLoanMapper;
import com.finance.www.service.QueryBigLoadService;
import com.finance.www.vo.ApplyMoney;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/7/30.
 */
@Service
public class QueryBigLoadServiveImpl implements QueryBigLoadService {
    @Autowired
    private QueryBigLoanMapper queryBigLoanMapper;
    @Override
    public List<ApplyMoney> query(int memberId,int state) {
            List<ApplyMoney>  list =queryBigLoanMapper.query(memberId,state);
        return list;
    }

}
