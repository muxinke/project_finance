package com.finance.www.service.impl;

import com.finance.www.mapper.MemeberMapper;
import com.finance.www.pojo.Memeber;
import com.finance.www.pojo.MemeberExample;
import com.finance.www.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lenovo-pc on 2019/7/24.
 */
@Service
public class MainServiceImpl implements MainService {
    @Autowired
    private MemeberMapper memeberMapper;
    @Override
    public List<Memeber> findAll() {
        MemeberExample example = new MemeberExample();
        /*MemeberExample.Criteria criteria = example.createCriteria();*/
        List<Memeber> memebers = memeberMapper.selectByExample(example);
        return memebers;
    }

    @Override
    public List<Memeber> selectUser(String info) {
        MemeberExample example = new MemeberExample();
        MemeberExample.Criteria criteria = example.createCriteria();
        criteria.andEmailLike("%"+info+"%");
        MemeberExample.Criteria criteria1 = example.createCriteria();
        criteria1.andMobileLike("%"+info+"%");
        MemeberExample.Criteria criteria2 = example.createCriteria();
        criteria2.andUsernameLike("%"+info+"%");
        example.or(criteria1);
        example.or(criteria2);
        List<Memeber> memebers = memeberMapper.selectByExample(example);
        return memebers;
    }

    @Override
    public int addUser(Memeber memeber) {
        /*MemeberExample example = new MemeberExample();*/
        /*MemeberExample.Criteria criteria = example.createCriteria();*/
        int i = memeberMapper.insert(memeber);
        return i;
    }

    @Override
    public int delUser(int id) {
        int i = memeberMapper.deleteByPrimaryKey(id);
        return i;
    }

    @Override
    public Memeber selectUserById(int id) {
        Memeber memeber = memeberMapper.selectByPrimaryKey(id);
        return memeber;
    }

    @Override
    public int edUser(Memeber memeber) {
        int i = memeberMapper.updateByPrimaryKey(memeber);
        return i;
    }
}
