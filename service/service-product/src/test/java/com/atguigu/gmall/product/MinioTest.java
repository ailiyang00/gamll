package com.atguigu.gmall.product;

import com.atguigu.gmall.product.service.BaseAttrValueService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author li_yang
 * @version 1.0
 * @description:
 * @date 2024/3/00022 15:48
 */
@SpringBootTest
public class MinioTest {

    @Autowired
    BaseAttrValueService baseAttrValueService;
    @Test
    void test1(){
        System.out.println(baseAttrValueService.count());
    }
}
