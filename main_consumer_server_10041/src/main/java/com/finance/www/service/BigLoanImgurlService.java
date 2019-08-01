package com.finance.www.service;

import com.finance.www.pojo.BigloanImgurl;

import java.util.List;

/**
 * liupeng
 * Created by lenovo-pc on 2019/7/29.
 */
public interface BigLoanImgurlService {
    //根据用户id查找业务相关的所有图片
    List<BigloanImgurl> findImgsByUid(int id);
}
