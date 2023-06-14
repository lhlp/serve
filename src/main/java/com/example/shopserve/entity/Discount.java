package com.example.shopserve.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Discount)实体类
 *
 * @author makejava
 * @since 2023-06-14 14:19:26
 */
@Data
public class Discount implements Serializable {
    private static final long serialVersionUID = 215752761577483586L;
    /**
     * 优惠券表
     */
    private Integer id;
    /**
     * 优惠券名称
     */
    private String name;
    /**
     * 优惠金额
     */
    private String disc;
    /**
     * 所属店铺id
     */
    private Integer shopid;

}

