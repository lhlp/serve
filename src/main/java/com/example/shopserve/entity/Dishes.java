package com.example.shopserve.entity;

import java.io.Serializable;

/**
 * (Dishes)实体类
 *
 * @author makejava
 * @since 2023-06-14 14:19:28
 */
public class Dishes implements Serializable {
    private static final long serialVersionUID = 897573525126936454L;
    /**
     * 菜品表
     */
    private Integer id;
    /**
     * 菜名
     */
    private String name;
    /**
     * 图片
     */
    private String imag;
    /**
     * 菜品价格
     */
    private Object price;
    /**
     * 菜品描述
     */
    private String desc;
    /**
     * 菜品销量
     */
    private Integer sales;
    /**
     * 菜品类型id
     */
    private Integer typeid;
    /**
     * 菜品折扣
     */
    private String disc;
    /**
     * 所属店铺id
     */
    private Integer shopid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImag() {
        return imag;
    }

    public void setImag(String imag) {
        this.imag = imag;
    }

    public Object getPrice() {
        return price;
    }

    public void setPrice(Object price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getDisc() {
        return disc;
    }

    public void setDisc(String disc) {
        this.disc = disc;
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

}

