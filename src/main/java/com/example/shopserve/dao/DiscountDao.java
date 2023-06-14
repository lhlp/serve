package com.example.shopserve.dao;

import com.example.shopserve.entity.Discount;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Discount)表数据库访问层
 *
 * @author makejava
 * @since 2023-06-14 14:19:26
 */
public interface DiscountDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Discount queryById(Integer id);


    /**
     * 统计总行数
     *
     * @param discount 查询条件
     * @return 总行数
     */
    long count(Discount discount);

    /**
     * 新增数据
     *
     * @param discount 实例对象
     * @return 影响行数
     */
    int insert(Discount discount);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Discount> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Discount> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Discount> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Discount> entities);

    /**
     * 修改数据
     *
     * @param discount 实例对象
     * @return 影响行数
     */
    int update(Discount discount);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

