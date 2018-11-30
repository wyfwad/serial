package com.wyf.serial.dao;

import java.util.List;

/**
 * Dao层级基类.
 * 
 * @className BaseDao
 * @author zl
 * @version V1.0 2018年9月7日 下午2:38:45
 */
public interface BaseDao<E> {
    /**
     * 查询所有.
     * 
     * @return List 对象列表
     */
    List<E> findAll();

    /**
     * 通过id查询.
     * 
     * @param id 主键id.
     * @return E 对象
     */
    E findById(Long id);

    /**
     * 保存.
     * 
     * @param e 对象
     */
    void save(E e);

    /**
     * 修改.
     * 
     * @param e 对象
     */
    void update(E e);

    /**
     * 删除.
     * 
     * @param id 主键id
     */
    void delete(Long id);

    /**
     * 条件查询.
     * 
     * @param e 对象
     * @return
     */
    List<E> queryByCondition(E e);

}
