package com.finance.www.pojo;

import java.io.Serializable;
import lombok.Data;

@Data
public class MemberLimit implements Serializable {
    private Integer id;

    private Long edu;

    private Long shengyuedu;

    private static final long serialVersionUID = 1L;
}