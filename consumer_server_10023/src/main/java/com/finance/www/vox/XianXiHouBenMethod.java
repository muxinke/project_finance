package com.finance.www.vox;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2019/7/29.
 */
@Data
public class XianXiHouBenMethod implements Serializable {
    private String totalMoney;
    private String totalInterest;
    private List<XianXiHouBenVo> xianXiHouBenVoList;
}
