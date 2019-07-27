package com.finance.www.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2019/7/25.
 */
@Data
public class MemberAccount implements Serializable {
    private int id;
    private long accountBalance;
    private Date createTime;
    private Date updateTime;

}
