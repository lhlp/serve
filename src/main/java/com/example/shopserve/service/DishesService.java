package com.example.shopserve.service;

import com.example.shopserve.entity.Dishes;
import org.springframework.stereotype.Service;


/**
 * (Dishes)表服务接口
 *
 * @author makejava
 * @since 2023-06-14 14:19:28
 */
@Service
public interface DishesService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Dishes queryById(Integer id);


    /**
     * 新增数据
     *
     * @param dishes 实例对象
     * @return 实例对象
     */
    Dishes insert(Dishes dishes);

    /**
     * 修改数据
     *
     * @param dishes 实例对象
     * @return 实例对象
     */
    Dishes update(Dishes dishes);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
