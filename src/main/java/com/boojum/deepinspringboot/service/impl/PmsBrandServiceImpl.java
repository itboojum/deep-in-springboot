package com.boojum.deepinspringboot.service.impl;

import com.boojum.deepinspringboot.entity.PmsBrand;
import com.boojum.deepinspringboot.mapper.PmsBrandMapper;
import com.boojum.deepinspringboot.service.IPmsBrandService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 品牌表 服务实现类
 * </p>
 *
 * @author boojum
 * @since 2020-04-05
 */
@Service
public class PmsBrandServiceImpl extends ServiceImpl<PmsBrandMapper, PmsBrand> implements IPmsBrandService {

}
