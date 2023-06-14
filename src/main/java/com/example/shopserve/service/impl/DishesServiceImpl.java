package com.example.shopserve.service.impl;

import com.example.shopserve.entity.Dishes;
import com.example.shopserve.dao.DishesDao;
import com.example.shopserve.service.DishesService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * (Dishes)表服务实现类
 *
 * @author makejava
 * @since 2023-06-14 14:19:28
 */
@Service("dishesService")
public class DishesServiceImpl implements DishesService {
    @Resource
    private DishesDao dishesDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Dishes queryById(Integer id) {
        return this.dishesDao.queryById(id);
    }



    /**
     * 新增数据
     *
     * @param dishes 实例对象
     * @return 实例对象
     */
    @Override
    public Dishes insert(Dishes dishes) {
        this.dishesDao.insert(dishes);
        return dishes;
    }

    /**
     * 修改数据
     *
     * @param dishes 实例对象
     * @return 实例对象
     */
    @Override
    public Dishes update(Dishes dishes) {
        this.dishesDao.update(dishes);
        return this.queryById(dishes.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.dishesDao.deleteById(id) > 0;
    }
}
