package com.example.shopserve.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Order)实体类
 *
 * @author makejava
 * @since 2023-06-14 14:19:28
 */
@Data
public class Order implements Serializable {
    private static final long serialVersionUID = -30323480584256707L;
    /**
     * 订单表
     */
    private Integer id;
    /**
     * 地址id
     */
    private Integer addressid;
    /**
     * 详细地址
     */
    private String address;
    /**
     * 优惠金额
     */
    private Object disc;
    /**
     * 配送时间
     */
    private Object time;
    /**
     * 评分
     */
    private Object score;
    /**
     * 订单状态 1已完成 2未评分 0未完成
     */
    private Integer type;


}

