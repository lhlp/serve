package com.example.shopserve.service.impl;

import com.example.shopserve.entity.Type;
import com.example.shopserve.dao.TypeDao;
import com.example.shopserve.service.TypeService;
import org.springframework.stereotype.Service;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageImpl;
//import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Type)表服务实现类
 *
 * @author makejava
 * @since 2023-06-14 14:19:30
 */
@Service("typeService")
public class TypeServiceImpl implements TypeService {
    @Resource
    private TypeDao typeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Type queryById(Integer id) {
        return this.typeDao.queryById(id);
    }



//    /**
//     * 分页查询
//     *
//     * @param type        筛选条件
//     * @param pageRequest 分页对象
//     * @return 查询结果
//     */
//    @Override
//    public Page<Type> queryByPage(Type type, PageRequest pageRequest) {
//        long total = this.typeDao.count(type);
//        return new PageImpl<>(this.typeDao.queryAllByLimit(type, pageRequest), pageRequest, total);
//    }

    /**
     * 新增数据
     *
     * @param type 实例对象
     * @return 实例对象
     */
    @Override
    public Type insert(Type type) {
        this.typeDao.insert(type);
        return type;
    }

    /**
     * 修改数据
     *
     * @param type 实例对象
     * @return 实例对象
     */
    @Override
    public Type update(Type type) {
        this.typeDao.update(type);
        return this.queryById(type.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.typeDao.deleteById(id) > 0;
    }
}
