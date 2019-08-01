package com.finance.www.service.impl;

import com.finance.www.mapper.BigloanImgurlMapper;
import com.finance.www.pojo.BigloanImgurl;
import com.finance.www.service.BigLoanImgurlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lenovo-pc on 2019/7/29.
 */
@Service
public class BigLoanImgurlServiceImpl implements BigLoanImgurlService {
    @Autowired
    private BigloanImgurlMapper bigloanImgurlMapper;
    @Override
    public List<BigloanImgurl> findImgsByUid(int id) {
        List<BigloanImgurl> list = bigloanImgurlMapper.findImgsByUid(id);
        return list;
    }
}
