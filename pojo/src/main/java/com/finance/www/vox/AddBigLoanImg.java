package com.finance.www.vox;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Administrator on 2019/7/26.
 */
@Data
public class AddBigLoanImg implements Serializable {
    private Integer bigloanId;
    private String imgUrl;
}
