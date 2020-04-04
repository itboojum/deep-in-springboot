package com.boojum.deepinspringboot.service.impl;

import com.boojum.deepinspringboot.entity.PmsProduct;
import com.boojum.deepinspringboot.mapper.PmsProductMapper;
import com.boojum.deepinspringboot.service.PmsProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author boojum
 * @since 2020-04-05
 */
@Service
public class PmsProductServiceImpl extends ServiceImpl<PmsProductMapper, PmsProduct> implements PmsProductService {

}
