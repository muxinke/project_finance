package com.finance.www.service;

import com.finance.www.pojo.RecordMemberTender;
import com.finance.www.pvo.InvestmentVo;

import java.util.List;

/**
 * 商品的投资记录
 * Created by 杜碧天 on 2019/7/27.
 */
public interface RecordMemberTenderService {
    List<InvestmentVo> chaInvestmentBypid(Integer pid);
}
