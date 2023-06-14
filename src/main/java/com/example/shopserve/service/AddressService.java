package com.example.shopserve.service;

import com.example.shopserve.entity.Address;
import org.springframework.stereotype.Service;


/**
 * (Address)表服务接口
 *
 * @author makejava
 * @since 2023-06-14 14:19:27
 */
@Service
public interface AddressService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Address queryById(Integer id);


    /**
     * 新增数据
     *
     * @param address 实例对象
     * @return 实例对象
     */
    Address insert(Address address);

    /**
     * 修改数据
     *
     * @param address 实例对象
     * @return 实例对象
     */
    Address update(Address address);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
