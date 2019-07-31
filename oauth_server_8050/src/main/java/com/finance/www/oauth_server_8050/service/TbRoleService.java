package com.finance.www.oauth_server_8050.service;

import java.util.List;
import com.finance.www.oauth_server_8050.pojo.TbRoleExample;
import com.finance.www.oauth_server_8050.pojo.TbRole;
public interface TbRoleService{


    long countByExample(TbRoleExample example);

    int deleteByExample(TbRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbRole record);

    int insertSelective(TbRole record);

    List<TbRole> selectByExample(TbRoleExample example);

    TbRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(TbRole record,TbRoleExample example);

    int updateByExample(TbRole record,TbRoleExample example);

    int updateByPrimaryKeySelective(TbRole record);

    int updateByPrimaryKey(TbRole record);

}
