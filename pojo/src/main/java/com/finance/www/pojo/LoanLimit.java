package com.finance.www.pojo;

import java.io.Serializable;
import lombok.Data;

@Data
public class LoanLimit implements Serializable {
    private Integer userid;//用户id

    private Long edu;//贷款最高额度

    private static final long serialVersionUID = 1L;
}