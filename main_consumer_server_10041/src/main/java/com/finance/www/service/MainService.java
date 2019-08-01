package com.finance.www.service;

import com.finance.www.pojo.Memeber;

import java.util.List;

/**
 * Created by lenovo-pc on 2019/7/24.
 */
public interface MainService {
    //全查
    List<Memeber> findAll();
    //条件查询
    List<Memeber> selectUser(String info);
    //添加
    int addUser(Memeber memeber);
    //删除
    int delUser(int id);
    //通过id查询
    Memeber selectUserById(int id);
    //修改
    int edUser(Memeber memeber);
}
