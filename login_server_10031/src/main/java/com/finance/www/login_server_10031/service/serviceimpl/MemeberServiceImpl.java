package com.finance.www.login_server_10031.service.serviceimpl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.finance.www.pojo.Memeber;
import java.util.List;
import com.finance.www.pojo.MemeberExample;
import com.finance.www.login_server_10031.mapper.MemeberMapper;
import com.finance.www.login_server_10031.service.MemeberService;
@Service
public class MemeberServiceImpl implements MemeberService{

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
