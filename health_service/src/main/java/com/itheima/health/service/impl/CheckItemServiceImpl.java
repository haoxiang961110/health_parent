package com.itheima.health.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itheima.health.entity.PageResult;
import com.itheima.health.mapper.CheckItemMapper;
import com.itheima.health.pojo.CheckItem;
import com.itheima.health.service.CheckItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: phx
 * @date: 2020/6/26
 * @time: 20:53
 */
@Service(interfaceClass = CheckItemService.class)
@Transactional
public class CheckItemServiceImpl implements CheckItemService {
    @Autowired
    private CheckItemMapper checkItemMapper;

    /**
     * 查询所有
     *
     * @return
     */
    @Override
    public List<CheckItem> findAll() {
        return checkItemMapper.findAll();
    }

    /**
     * 分页查询
     *
     * @param pageSize
     * @param pageNum
     * @return
     */
    @Override
    public PageResult findByPage(Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        Page<CheckItem> page = (Page<CheckItem>) checkItemMapper.findAll();

        return new PageResult(page.getTotal(), page.getResult());
    }

    /**
     * 添加
     *
     * @param checkItem
     */
    @Override
    public void add(CheckItem checkItem) {
        checkItemMapper.add(checkItem);
    }

    /**
     * 更新
     *
     * @param checkItem
     */
    @Override
    public void update(CheckItem checkItem) {

        checkItemMapper.update(checkItem);

    }

    /**
     * 删除
     *
     * @param
     */
    @Override
    public void delete(Integer checkItemId) {

        checkItemMapper.delete(checkItemId);
    }
}
