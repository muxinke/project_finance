package com.finance.www.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class ProduitImg implements Serializable {
    /**
    * id
    */
    private Integer id;

    /**
    * 投资列表id
    */
    private Integer produitId;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 最后修改时间
    */
    private Date updateTime;

    /**
    * 项目相关资料图片地址
    */
    private String imgUrl;

    private static final long serialVersionUID = 1L;
}