package com.example.shopserve.service;

import com.example.shopserve.entity.Shop;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * (Shop)表服务接口
 *
 * @author makejava
 * @since 2023-06-14 14:19:29
 */
@Service
@Transactional
public interface ShopService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Shop queryById(Integer id);


    /**
     * 展示首页全部店铺
     * @return
     */
    List<Shop> getIndexShowShops();

    /**价格\配送时间、评分
     * 展示首页按条件排序的店铺
     * @param condition
     * @return
     */
    List<Shop> sortShopByCondition(String condition);


    /**
     * 新增数据
     *
     * @param shop 实例对象
     * @return 实例对象
     */
    Shop insert(Shop shop);

    /**
     * 修改数据
     *
     * @param shop 实例对象
     * @return 实例对象
     */
    Shop update(Shop shop);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
