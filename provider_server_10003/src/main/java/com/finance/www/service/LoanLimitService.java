package com.finance.www.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2019/7/24.
 */
public interface LoanLimitService {
    //根据用户id修改其贷款额度
    public int updateByUid(@RequestParam("userid")Integer userid, @RequestParam("edu")Long edu);
}
