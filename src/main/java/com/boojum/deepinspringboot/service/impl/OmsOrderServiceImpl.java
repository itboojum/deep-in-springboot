package com.boojum.deepinspringboot.service.impl;

import com.boojum.deepinspringboot.entity.OmsOrder;
import com.boojum.deepinspringboot.mapper.OmsOrderMapper;
import com.boojum.deepinspringboot.service.OmsOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author boojum
 * @since 2020-04-05
 */
@Service
public class OmsOrderServiceImpl extends ServiceImpl<OmsOrderMapper, OmsOrder> implements OmsOrderService {

}
