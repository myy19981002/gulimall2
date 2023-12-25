package com.myy.test.gulimall_product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.myy.common.utils.PageUtils;
import com.myy.common.utils.Query;

import com.myy.test.gulimall_product.dao.PmsSpuInfoDescDao;
import com.myy.test.gulimall_product.entity.PmsSpuInfoDescEntity;
import com.myy.test.gulimall_product.service.PmsSpuInfoDescService;


@Service("pmsSpuInfoDescService")
public class PmsSpuInfoDescServiceImpl extends ServiceImpl<PmsSpuInfoDescDao, PmsSpuInfoDescEntity> implements PmsSpuInfoDescService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsSpuInfoDescEntity> page = this.page(
                new Query<PmsSpuInfoDescEntity>().getPage(params),
                new QueryWrapper<PmsSpuInfoDescEntity>()
        );

        return new PageUtils(page);
    }

}