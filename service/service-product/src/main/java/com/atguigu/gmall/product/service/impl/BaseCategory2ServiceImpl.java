package com.atguigu.gmall.product.service.impl;

import com.atguigu.gmall.model.product.BaseCategory2;
import com.atguigu.gmall.product.mapper.BaseCategory2Mapper;
import com.atguigu.gmall.product.service.BaseCategory2Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author li_yang
 * @version 1.0
 * @description:
 * @date 2024/3/00021 18:22
 */
@Service
@Slf4j
public class BaseCategory2ServiceImpl extends ServiceImpl<BaseCategory2Mapper, BaseCategory2> implements BaseCategory2Service {

    @Resource
    BaseCategory2Mapper baseCategory2Mapper;
    @Override
    public List<BaseCategory2> getCategory1Child(Long c1Id) {
        QueryWrapper<BaseCategory2> wrapper = new QueryWrapper<>();
        wrapper.eq("category1_id",c1Id);
        return baseCategory2Mapper.selectList(wrapper);
    }
}
