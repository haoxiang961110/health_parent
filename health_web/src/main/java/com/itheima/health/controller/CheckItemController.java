package com.itheima.health.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itheima.health.entity.PageResult;
import com.itheima.health.pojo.CheckItem;
import com.itheima.health.service.CheckItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: phx
 * @date: 2020/6/26
 * @time: 20:56
 */
@RestController
@RequestMapping("/checkItem")
public class CheckItemController {

    @Reference
    private CheckItemService checkItemService;

    /**
     * 查询所有
     *
     * @return
     */
    @RequestMapping("/findAll")
    public List<CheckItem> findAll() {
        return checkItemService.findAll();
    }

    /**
     * 分页查询
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping("/findByPage")
    public PageResult findByPage(Integer pageNum, Integer pageSize) {
        return checkItemService.findByPage(pageNum, pageSize);
    }

    /**
     * 添加
     * @param checkItem
     */
    @RequestMapping("/add")
    public void add(@RequestBody CheckItem checkItem){
        checkItemService.add(checkItem);
    }

    /**
     * 更新
     * @param checkItem
     */
    @RequestMapping("/update")
    public void update(@RequestBody CheckItem checkItem){
        checkItemService.update(checkItem);
    }

    /**
     * 删除
     * @param checkItemId
     */
    @RequestMapping("/delete")
    public void delete(@RequestParam("checkItemId") Integer checkItemId){
        checkItemService.delete(checkItemId);
    }
}
