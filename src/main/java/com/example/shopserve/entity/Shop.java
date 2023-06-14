package com.example.shopserve.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Shop)实体类
 *
 * @author makejava
 * @since 2023-06-14 14:19:29
 */
@Data
public class Shop implements Serializable {
    private static final long serialVersionUID = 826735937078929890L;
    /**
     * 店铺表
     */
    private Integer id;
    /**
     * 店名
     */
    private String name;
    /**
     * 店铺描述（49分钟 4.9km）
     */
    private String desc;
    /**
     * 店铺评分
     */
    private Object score;
    /**
     * 店铺销量
     */
    private Integer sales;
    /**
     * 店铺优惠政策
     */
    private String disc;
    /**
     * 配送距离
     */
    private Object distance;
    /**
     * 配送时间
     */
    private Object time;
    /**
     * 店铺头像
     */
    private String url;

}

