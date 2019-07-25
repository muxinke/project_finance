package com.finance.www.zuul_server_8070.service;

import com.finance.www.pojo.Memeber;
import com.finance.www.pojo.MemeberExample;

import java.util.List;

public interface MemeberService{


    long countByExample(MemeberExample example);

    int deleteByExample(MemeberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Memeber record);

    int insertSelective(Memeber record);

    List<Memeber> selectByExample(MemeberExample example);

    Memeber selectByPrimaryKey(Integer id);

    int updateByExampleSelective(Memeber record, MemeberExample example);

    int updateByExample(Memeber record, MemeberExample example);

    int updateByPrimaryKeySelective(Memeber record);

    int updateByPrimaryKey(Memeber record);



}
