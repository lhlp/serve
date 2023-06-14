package com.example.shopserve.dao;

import com.example.shopserve.entity.Dishes;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Dishes)表数据库访问层
 *
 * @author makejava
 * @since 2023-06-14 14:19:28
 */
@Mapper
public interface DishesDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Dishes queryById(Integer id);


    /**
     * 统计总行数
     *
     * @param dishes 查询条件
     * @return 总行数
     */
    long count(Dishes dishes);

    /**
     * 新增数据
     *
     * @param dishes 实例对象
     * @return 影响行数
     */
    int insert(Dishes dishes);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Dishes> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Dishes> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Dishes> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Dishes> entities);

    /**
     * 修改数据
     *
     * @param dishes 实例对象
     * @return 影响行数
     */
    int update(Dishes dishes);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

