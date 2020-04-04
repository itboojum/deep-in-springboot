package com.boojum.deepinspringboot.service.impl;

import com.boojum.deepinspringboot.entity.PmsProductLadder;
import com.boojum.deepinspringboot.mapper.PmsProductLadderMapper;
import com.boojum.deepinspringboot.service.PmsProductLadderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品阶梯价格表(只针对同商品) 服务实现类
 * </p>
 *
 * @author boojum
 * @since 2020-04-05
 */
@Service
public class PmsProductLadderServiceImpl extends ServiceImpl<PmsProductLadderMapper, PmsProductLadder> implements PmsProductLadderService {

}
