package com.finance.www.service.Impl;

import com.finance.www.mapper.RecordMemberTenderMapper;
import com.finance.www.pojo.RecordMemberTender;
import com.finance.www.pojo.RecordMemberTenderExample;
import com.finance.www.pvo.InvestmentVo;
import com.finance.www.service.RecordMemberTenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 杜碧天 on 2019/7/27.
 */
@Service
public class RecordMemberTenderServiceImpl implements RecordMemberTenderService{
    @Autowired
    RecordMemberTenderMapper rmtMapper;
    @Override
    public List<InvestmentVo> chaInvestmentBypid(Integer pid) {
       List<InvestmentVo> investments = rmtMapper.findInvestmentBypid(pid);

        return investments;
    }
}
