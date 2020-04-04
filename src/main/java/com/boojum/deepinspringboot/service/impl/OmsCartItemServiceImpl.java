package com.boojum.deepinspringboot.service.impl;

import com.boojum.deepinspringboot.entity.OmsCartItem;
import com.boojum.deepinspringboot.mapper.OmsCartItemMapper;
import com.boojum.deepinspringboot.service.OmsCartItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 购物车表 服务实现类
 * </p>
 *
 * @author boojum
 * @since 2020-04-05
 */
@Service
public class OmsCartItemServiceImpl extends ServiceImpl<OmsCartItemMapper, OmsCartItem> implements OmsCartItemService {

}
