package com.finance.www.service.Impl;

import com.finance.www.mapper.MemeberMapper;
import com.finance.www.pojo.Memeber;
import com.finance.www.pojo.MemeberExample;
import com.finance.www.service.MemeberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 杜碧天 on 2019/7/31.
 */
@Service
public class MemeberServiceImpl implements MemeberService{
    @Autowired
    MemeberMapper memeberMapper;
    @Override
    public Integer findMemberNum() {
        MemeberExample memeberExample = new MemeberExample();
        int i = memeberMapper.countByExample(memeberExample);
        return i;
    }

    @Override
    public Memeber findMemberByid(Integer userid) {
        Memeber memeber = memeberMapper.selectByPrimaryKey(userid);
        return memeber;
    }
}
