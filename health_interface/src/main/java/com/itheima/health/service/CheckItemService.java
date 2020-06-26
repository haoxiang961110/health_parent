package com.itheima.health.service;

import com.itheima.health.entity.PageResult;
import com.itheima.health.pojo.CheckItem;

import java.util.List;

/**
 * @author: phx
 * @date: 2020/6/26
 * @time: 20:52
 */
public interface CheckItemService {
    /**
     * 查询所有
     * @return
     */
    List<CheckItem> findAll();

    /**
     * 分页查询
     * @param pageSize
     * @param pageNum
     * @return
     */
    PageResult findByPage(Integer pageSize,Integer pageNum);

    /**
     * 添加
     * @param checkItem
     */
    void add(CheckItem checkItem);

    /**
     * 更新
     * @param checkItem
     */
    void update(CheckItem checkItem);

    /**
     * 删除
     * @param checkItemId
     */
    void delete(Integer checkItemId);
}
