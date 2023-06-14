package com.example.shopserve.service;

import com.example.shopserve.entity.Type;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * (Type)表服务接口
 *
 * @author makejava
 * @since 2023-06-14 14:19:30
 */
@Service
@Transactional
public interface TypeService {

    /**
     * 通过ID查询单条数据
     *
     *  @param id 主键
     * @return 实例对象
     */
    Type queryById(Integer id);


    /**
     * 新增数据
     *
     * @param type 实例对象
     * @return 实例对象
     */
    Type insert(Type type);

    /**
     * 修改数据
     *
     * @param type 实例对象
     * @return 实例对象
     */
    Type update(Type type);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
