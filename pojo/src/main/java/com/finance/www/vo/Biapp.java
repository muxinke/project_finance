package com.finance.www.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2019/7/26.
 */
@Data
public class Biapp implements Serializable {
    private String totalMoney;
    private String totalInterest;
    private List<BiappMoneyVo> moneyVoList;
}
