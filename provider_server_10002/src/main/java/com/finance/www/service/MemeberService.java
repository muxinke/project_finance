package com.finance.www.service;

import com.finance.www.pojo.Memeber;

/**
 * Created by 杜碧天 on 2019/7/31.
 */
public interface MemeberService {
    //查询用户的数量
    Integer findMemberNum();
    //查询用户根据id
    Memeber findMemberByid(Integer userid);
}
