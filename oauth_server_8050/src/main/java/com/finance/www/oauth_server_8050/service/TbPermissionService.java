package com.finance.www.oauth_server_8050.service;

import com.finance.www.oauth_server_8050.pojo.TbPermission;
import java.util.List;
import com.finance.www.oauth_server_8050.pojo.TbPermissionExample;
public interface TbPermissionService{


    long countByExample(TbPermissionExample example);

    int deleteByExample(TbPermissionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbPermission record);

    int insertSelective(TbPermission record);

    List<TbPermission> selectByExample(TbPermissionExample example);

    TbPermission selectByPrimaryKey(Long id);

    int updateByExampleSelective(TbPermission record,TbPermissionExample example);

    int updateByExample(TbPermission record,TbPermissionExample example);

    int updateByPrimaryKeySelective(TbPermission record);

    int updateByPrimaryKey(TbPermission record);



	List<TbPermission> selectAllByMemberId(Long id);


}
