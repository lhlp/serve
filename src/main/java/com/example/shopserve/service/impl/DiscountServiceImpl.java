package com.example.shopserve.service.impl;

import com.example.shopserve.entity.Discount;
import com.example.shopserve.dao.DiscountDao;
import com.example.shopserve.service.DiscountService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * (Discount)表服务实现类
 *
 * @author makejava
 * @since 2023-06-14 14:19:27
 */
@Service("discountService")
public class DiscountServiceImpl implements DiscountService {
    @Resource
    private DiscountDao discountDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Discount queryById(Integer id) {
        return this.discountDao.queryById(id);
    }


    /**
     * 新增数据
     *
     * @param discount 实例对象
     * @return 实例对象
     */
    @Override
    public Discount insert(Discount discount) {
        this.discountDao.insert(discount);
        return discount;
    }

    /**
     * 修改数据
     *
     * @param discount 实例对象
     * @return 实例对象
     */
    @Override
    public Discount update(Discount discount) {
        this.discountDao.update(discount);
        return this.queryById(discount.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.discountDao.deleteById(id) > 0;
    }
}
