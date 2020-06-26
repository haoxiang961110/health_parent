package com.itheima.health.mapper;

import com.itheima.health.pojo.CheckItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: phx
 * @date: 2020/6/26
 * @time: 20:13
 */
@Mapper
public interface CheckItemMapper {
    /**
     * 查询所有检查项
     * @return
     */
    List<CheckItem> findAll();

    /**
     * 添加检查项
     * @param checkItem
     */
    void add(CheckItem checkItem);

    /**
     * 修改检查项
     * @param checkItem
     */
    void update(CheckItem checkItem);

    /**
     * 删除检查项
     * @param checkItemId
     */
    void delete(Integer checkItemId);

}
