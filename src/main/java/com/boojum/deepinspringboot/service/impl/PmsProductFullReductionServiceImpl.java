package com.boojum.deepinspringboot.service.impl;

import com.boojum.deepinspringboot.entity.PmsProductFullReduction;
import com.boojum.deepinspringboot.mapper.PmsProductFullReductionMapper;
import com.boojum.deepinspringboot.service.PmsProductFullReductionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品满减表(只针对同商品) 服务实现类
 * </p>
 *
 * @author boojum
 * @since 2020-04-05
 */
@Service
public class PmsProductFullReductionServiceImpl extends ServiceImpl<PmsProductFullReductionMapper, PmsProductFullReduction> implements PmsProductFullReductionService {

}
