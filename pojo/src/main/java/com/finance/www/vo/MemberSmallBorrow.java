package com.finance.www.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 封装用户小额借款的Vo类
 * Created by Administrator on 2019/7/25.
 */
@Data
public class MemberSmallBorrow implements Serializable{
    private int load_id;
    private int memberId;
    private String borrowMoney;
    private int borrowTime;
    private int borrowStyle;
    private String cardName;
    private int borrowUse;
    private String open;
    private int is_agreed;

}
