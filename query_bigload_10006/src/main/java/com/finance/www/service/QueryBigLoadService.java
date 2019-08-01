package com.finance.www.service;

import com.finance.www.vo.ApplyMoney;

import java.util.List;

/**
 * Created by Administrator on 2019/7/30.
 */
public interface QueryBigLoadService {
    List<ApplyMoney> query(int memberId,int state);

}
