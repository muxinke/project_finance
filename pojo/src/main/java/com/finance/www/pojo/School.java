package com.finance.www.pojo;

import java.io.Serializable;
import lombok.Data;

@Data
public class School implements Serializable {
    private Integer id;

    private String name;

    private String place;

    private String type;

    private String properties;

    private static final long serialVersionUID = 1L;
}