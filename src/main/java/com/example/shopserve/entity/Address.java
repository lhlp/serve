package com.example.shopserve.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Address)实体类
 *
 * @author makejava
 * @since 2023-06-14 14:19:27
 */
@Data
public class Address implements Serializable {
    private static final long serialVersionUID = 204013141360697845L;
    /**
     * 地址表
     */
    private Integer id;
    /**
     * 用户昵称
     */
    private String name;
    /**
     * 用户电话
     */
    private String phone;
    /**
     * 地址
     */
    private String address;
    /**
     * 详细地址
     */
    private String addressdetail;
    /**
     * 用户id
     */
    private Integer userid;

}

