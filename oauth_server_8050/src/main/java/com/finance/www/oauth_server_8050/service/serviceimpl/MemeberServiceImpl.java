package com.finance.www.oauth_server_8050.service.serviceimpl;


import com.finance.www.oauth_server_8050.mapper.MemeberMapper;
import com.finance.www.oauth_server_8050.service.MemeberService;
import com.finance.www.pojo.Memeber;
import com.finance.www.pojo.MemeberExample;


import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MemeberServiceImpl implements MemeberService {

    @Resource
    private MemeberMapper memeberMapper;

    @Override
    public long countByExample(MemeberExample example) {
        return memeberMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(MemeberExample example) {
        return memeberMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return memeberMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Memeber record) {
        return memeberMapper.insert(record);
    }

    @Override
    public int insertSelective(Memeber record) {
        return memeberMapper.insertSelective(record);
    }

    @Override
    public List<Memeber> selectByExample(MemeberExample example) {
        return memeberMapper.selectByExample(example);
    }

    @Override
    public Memeber selectByPrimaryKey(Integer id) {
        return memeberMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Memeber record,MemeberExample example) {
        return memeberMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Memeber record,MemeberExample example) {
        return memeberMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Memeber record) {
        return memeberMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Memeber record) {
        return memeberMapper.updateByPrimaryKey(record);
    }

}
