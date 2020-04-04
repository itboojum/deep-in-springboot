package com.boojum.deepinspringboot.service.impl;

import com.boojum.deepinspringboot.entity.SmsCouponHistory;
import com.boojum.deepinspringboot.mapper.SmsCouponHistoryMapper;
import com.boojum.deepinspringboot.service.SmsCouponHistoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 优惠券使用、领取历史表 服务实现类
 * </p>
 *
 * @author boojum
 * @since 2020-04-05
 */
@Service
public class SmsCouponHistoryServiceImpl extends ServiceImpl<SmsCouponHistoryMapper, SmsCouponHistory> implements SmsCouponHistoryService {

}
