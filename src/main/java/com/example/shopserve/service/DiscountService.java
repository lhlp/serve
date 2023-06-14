package com.example.shopserve.service;

import com.example.shopserve.entity.Discount;
import org.springframework.stereotype.Service;


/**
 * (Discount)表服务接口
 *
 * @author makejava
 * @since 2023-06-14 14:19:26
 */
@Service
public interface DiscountService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Discount queryById(Integer id);



    /**
     * 新增数据
     *
     * @param discount 实例对象
     * @return 实例对象
     */
    Discount insert(Discount discount);

    /**
     * 修改数据
     *
     * @param discount 实例对象
     * @return 实例对象
     */
    Discount update(Discount discount);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
