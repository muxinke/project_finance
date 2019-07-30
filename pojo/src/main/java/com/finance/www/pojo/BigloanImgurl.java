package com.finance.www.pojo;

import java.util.Date;

public class BigloanImgurl {
    private Integer id;

    private Integer bigloanId;

    private String imgUrl;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBigloanId() {
        return bigloanId;
    }

    public void setBigloanId(Integer bigloanId) {
        this.bigloanId = bigloanId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}