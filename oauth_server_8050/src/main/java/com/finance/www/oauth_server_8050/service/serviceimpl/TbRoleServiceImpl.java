package com.finance.www.oauth_server_8050.service.serviceimpl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.finance.www.oauth_server_8050.mapper.TbRoleMapper;
import java.util.List;
import com.finance.www.oauth_server_8050.pojo.TbRoleExample;
import com.finance.www.oauth_server_8050.pojo.TbRole;
import com.finance.www.oauth_server_8050.service.TbRoleService;
@Service
public class TbRoleServiceImpl implements TbRoleService{

    @Resource
    private TbRoleMapper tbRoleMapper;

    @Override
    public long countByExample(TbRoleExample example) {
        return tbRoleMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbRoleExample example) {
        return tbRoleMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return tbRoleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TbRole record) {
        return tbRoleMapper.insert(record);
    }

    @Override
    public int insertSelective(TbRole record) {
        return tbRoleMapper.insertSelective(record);
    }

    @Override
    public List<TbRole> selectByExample(TbRoleExample example) {
        return tbRoleMapper.selectByExample(example);
    }

    @Override
    public TbRole selectByPrimaryKey(Long id) {
        return tbRoleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TbRole record,TbRoleExample example) {
        return tbRoleMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(TbRole record,TbRoleExample example) {
        return tbRoleMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(TbRole record) {
        return tbRoleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TbRole record) {
        return tbRoleMapper.updateByPrimaryKey(record);
    }

}
