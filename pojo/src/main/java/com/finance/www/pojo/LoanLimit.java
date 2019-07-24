package com.finance.www.pojo;

import java.io.Serializable;
import lombok.Data;

@Data
public class LoanLimit implements Serializable {
    private Integer userid;

    private Long edu;

    private static final long serialVersionUID = 1L;
}