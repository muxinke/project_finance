package com.finance.www.vox;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Administrator on 2019/7/27.
 */
@Data
public class BasicAddBigLoan implements Serializable{
    protected Integer id;
    protected Integer memberId;
    protected Long amount;
    protected Integer xingzhi;
    protected Integer howlong;
    protected Integer paymethod;
    protected Integer state;//0--审核中,1--借款成功,2--还款完成
}
