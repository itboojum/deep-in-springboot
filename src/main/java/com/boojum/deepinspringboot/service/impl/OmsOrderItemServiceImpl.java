package com.boojum.deepinspringboot.service.impl;

import com.boojum.deepinspringboot.entity.OmsOrderItem;
import com.boojum.deepinspringboot.mapper.OmsOrderItemMapper;
import com.boojum.deepinspringboot.service.OmsOrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单中所包含的商品 服务实现类
 * </p>
 *
 * @author boojum
 * @since 2020-04-05
 */
@Service
public class OmsOrderItemServiceImpl extends ServiceImpl<OmsOrderItemMapper, OmsOrderItem> implements OmsOrderItemService {

}
