package com.myy.test.gulimall_product;

import com.myy.test.gulimall_product.entity.PmsBrandEntity;
import com.myy.test.gulimall_product.service.PmsBrandService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    PmsBrandService pmsBrandService;

    @Test
    void contextLoads() {

        PmsBrandEntity pmsBrandEntity = new PmsBrandEntity();

        pmsBrandEntity.setName("华为");
        pmsBrandService.save(pmsBrandEntity);
        System.out.println("成功");
    }

}
