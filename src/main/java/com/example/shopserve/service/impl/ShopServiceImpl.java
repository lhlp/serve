package com.example.shopserve.service.impl;

import com.example.shopserve.entity.Shop;
import com.example.shopserve.dao.ShopDao;
import com.example.shopserve.service.ShopService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

/**
 * (Shop)表服务实现类
 *
 * @author makejava
 * @since 2023-06-14 14:19:29
 */
@Service("shopService")
public class ShopServiceImpl implements ShopService {
    @Resource
    private ShopDao shopDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Shop queryById(Integer id) {
        return this.shopDao.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param shop 实例对象
     * @return 实例对象
     */
    @Override
    public Shop insert(Shop shop) {
        this.shopDao.insert(shop);
        return shop;
    }

    /**
     * 修改数据
     *
     * @param shop 实例对象
     * @return 实例对象
     */
    @Override
    public Shop update(Shop shop) {
        this.shopDao.update(shop);
        return this.queryById(shop.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.shopDao.deleteById(id) > 0;
    }

    /**
     * 查询首页所有店铺数据
     * @return
     */
    @Override
    public List<Shop> getIndexShowShops() {
        return shopDao.queryAllShop();
    }

    /**
     *排序展示首页店铺
     * @param condition
     * @return
     */
    @Override
    public List<Shop> sortShopByCondition(String condition) {
        return shopDao.sortedByCondition(condition);
    }
}
