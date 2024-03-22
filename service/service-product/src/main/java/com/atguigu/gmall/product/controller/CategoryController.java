package com.atguigu.gmall.product.controller;

import com.atguigu.gmall.common.result.Result;
import com.atguigu.gmall.model.product.BaseCategory1;
import com.atguigu.gmall.model.product.BaseCategory2;
import com.atguigu.gmall.model.product.BaseCategory3;
import com.atguigu.gmall.product.service.BaseCategory1Service;
import com.atguigu.gmall.product.service.BaseCategory2Service;
import com.atguigu.gmall.product.service.BaseCategory3Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author li_yang
 * @version 1.0
 * @description:
 * @date 2024/3/00021 18:21
 */
@RequestMapping("/admin/product") //抽取公共路径
@RestController
public class CategoryController {
    @Resource
    BaseCategory1Service baseCategory1Service;

    @Resource
    BaseCategory2Service baseCategory2Service;

    @Resource
    BaseCategory3Service baseCategory3Service;

    /**
     * 获取所有的一级分类
     * @GetMapping：GET请求
     * @PostMapping：POST请求
     */
    @GetMapping("/getCategory1")
    public Result getCategory1()  {
        // {code:2000,message:"ok",data: [{id:1},{id:2},{id:3}]}
        //利用MyBatisPlus提供好的CRUD方法，直接查出苏哟有一级分类
//        Thread.sleep(3000);
        List<BaseCategory1> list = baseCategory1Service.list();

        //
        return Result.ok(list);
    }

    @GetMapping("/getCategory2/{c1Id}")
    public Result getCategory2(@PathVariable("c1Id") Long c1Id) {
       List<BaseCategory2> list= baseCategory2Service.getCategory1Child(c1Id);
        return Result.ok(list);
    }


    @GetMapping("/getCategory3/{c2Id}")
    public Result getCategory3(@PathVariable("c2Id") Long c2Id){
       List<BaseCategory3> list = baseCategory3Service.getCategory2Child(c2Id);
       return Result.ok(list);
    }
}
