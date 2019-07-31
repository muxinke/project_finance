package com.finance.www.oauth_server_8050.service.serviceimpl;

import com.finance.www.oauth_server_8050.mapper.TbPermissionMapper;
import com.finance.www.oauth_server_8050.pojo.TbPermissionExample;
import com.finance.www.oauth_server_8050.service.TbPermissionService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.finance.www.oauth_server_8050.pojo.TbPermission;
import java.util.List;

@Service
public class TbPermissionServiceImpl implements TbPermissionService {

    @Resource
    private TbPermissionMapper tbPermissionMapper;

    @Override
    public long countByExample(TbPermissionExample example) {
        return tbPermissionMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbPermissionExample example) {
        return tbPermissionMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return tbPermissionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TbPermission record) {
        return tbPermissionMapper.insert(record);
    }

    @Override
    public int insertSelective(TbPermission record) {
        return tbPermissionMapper.insertSelective(record);
    }

    @Override
    public List<TbPermission> selectByExample(TbPermissionExample example) {
        return tbPermissionMapper.selectByExample(example);
    }

    @Override
    public TbPermission selectByPrimaryKey(Long id) {
        return tbPermissionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TbPermission record,TbPermissionExample example) {
        return tbPermissionMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(TbPermission record,TbPermissionExample example) {
        return tbPermissionMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(TbPermission record) {
        return tbPermissionMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TbPermission record) {
        return tbPermissionMapper.updateByPrimaryKey(record);
    }

	@Override
	public List<TbPermission> selectAllByMemberId(Long id){
		 return tbPermissionMapper.selectAllByMemberId(id);
	}


}
