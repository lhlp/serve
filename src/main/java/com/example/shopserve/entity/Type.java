package com.example.shopserve.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Type)实体类
 *
 * @author makejava
 * @since 2023-06-14 14:19:29
 */
@Data
public class Type implements Serializable {
    private static final long serialVersionUID = -52696789207431898L;
    /**
     * 菜品类型表
     */
    private Integer id;
    /**
     * 菜品类型名
     */
    private String name;
    /**
     * 所属店铺id
     */
    private Integer shopid;


}

