package com.finance.www.service.impl;

import com.finance.www.mapper.LoanLimitMapper;
import com.finance.www.service.LoanLimitService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2019/7/24.
 */
@Service
public class LoanLimitServiceImpl implements LoanLimitService {
    @Autowired
    private LoanLimitMapper loanLimitMapper;

    @Override
    public int updateByUid(@RequestParam("userid")Integer userid, @RequestParam("edu")Long edu) {
        int updateByUid = loanLimitMapper.updateByUid(userid, edu);
        return updateByUid;
    }
}
