package com.finance.www.vox;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2019/8/1.
 */
@Data
public class RegisterVo implements Serializable{
    /**
     * 会员id
     */
    private Integer id;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 身份证号
     */
    private String idNumber;
}
