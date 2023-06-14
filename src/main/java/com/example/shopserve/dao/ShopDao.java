package com.example.shopserve.dao;

import com.example.shopserve.entity.Shop;
import org.apache.ibatis.annotations.Param;


import java.util.List;

/**
 * (Shop)表数据库访问层
 *
 * @author makejava
 * @since 2023-06-14 14:19:29
 */
public interface ShopDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Shop queryById(Integer id);

    /**
     * 统计总行数
     *
     * @param shop 查询条件
     * @return 总行数
     */
    long count(Shop shop);

    /**
     * 新增数据
     *
     * @param shop 实例对象
     * @return 影响行数
     */
    int insert(Shop shop);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Shop> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Shop> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Shop> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Shop> entities);

    /**
     * 修改数据
     *
     * @param shop 实例对象
     * @return 影响行数
     */
    int update(Shop shop);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

    /**
     * 查询首页所有店铺
     * @return
     */
    List<Shop> queryAllShop();

    /**
     * 查询根据条件排序后的所有店铺
     * @param condition
     * @return
     */
    List<Shop>  sortedByCondition(@Param("condition") String condition);


}

