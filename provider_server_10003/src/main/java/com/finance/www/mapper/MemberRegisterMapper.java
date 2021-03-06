package com.finance.www.mapper;

import com.finance.www.pojo.MemberRegister;
import com.finance.www.pojo.MemberRegisterExample;
import java.util.List;

import com.finance.www.vox.RegisterVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MemberRegisterMapper {
    long countByExample(MemberRegisterExample example);

    int deleteByExample(MemberRegisterExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MemberRegister record);

    int insertSelective(MemberRegister record);

    List<MemberRegister> selectByExample(MemberRegisterExample example);

    MemberRegister selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MemberRegister record, @Param("example") MemberRegisterExample example);

    int updateByExample(@Param("record") MemberRegister record, @Param("example") MemberRegisterExample example);

    int updateByPrimaryKeySelective(MemberRegister record);

    int updateByPrimaryKey(MemberRegister record);

    //判断实名注册表是否含有该id
     int isHaveMyId(Integer id);

    //根据用户id添加实名认证信息
    public int shiming(RegisterVo registerVo);
}
