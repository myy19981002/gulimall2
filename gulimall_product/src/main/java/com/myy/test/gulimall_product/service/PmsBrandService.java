package com.myy.test.gulimall_product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.myy.common.utils.PageUtils;
import com.myy.test.gulimall_product.entity.PmsBrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2023-12-25 21:50:38
 */
public interface PmsBrandService extends IService<PmsBrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

