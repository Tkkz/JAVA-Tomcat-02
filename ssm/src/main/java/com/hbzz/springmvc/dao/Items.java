package com.hbzz.springmvc.dao;

import java.util.Date;

/**
 * Created by sssss on 2017/9/16.
 */
public class Items {
    // 商品id
    private int id;
    // 商品名称
    private String name;
    // 商品价格
    private float price;
    // 商品创建时间
    private Date createtime;
    // 商品描述
    private String detail;

    public Items(int id, String name, Float price, Date createtime, String detail) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.createtime = createtime;
        this.detail = detail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
