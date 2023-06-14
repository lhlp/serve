package com.example.shopserve.service.impl;

import com.example.shopserve.entity.Address;
import com.example.shopserve.dao.AddressDao;
import com.example.shopserve.service.AddressService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * (Address)表服务实现类
 *
 * @author makejava
 * @since 2023-06-14 14:19:27
 */
@Service("addressService")
public class AddressServiceImpl implements AddressService {
    @Resource
    private AddressDao addressDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Address queryById(Integer id) {
        return this.addressDao.queryById(id);
    }


    /**
     * 新增数据
     *
     * @param address 实例对象
     * @return 实例对象
     */
    @Override
    public Address insert(Address address) {
        this.addressDao.insert(address);
        return address;
    }

    /**
     * 修改数据
     *
     * @param address 实例对象
     * @return 实例对象
     */
    @Override
    public Address update(Address address) {
        this.addressDao.update(address);
        return this.queryById(address.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.addressDao.deleteById(id) > 0;
    }
}
