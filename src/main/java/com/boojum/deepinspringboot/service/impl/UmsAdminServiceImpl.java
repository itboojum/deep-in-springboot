package com.boojum.deepinspringboot.service.impl;

import com.boojum.deepinspringboot.entity.UmsAdmin;
import com.boojum.deepinspringboot.mapper.UmsAdminMapper;
import com.boojum.deepinspringboot.service.UmsAdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author boojum
 * @since 2020-04-05
 */
@Service
public class UmsAdminServiceImpl extends ServiceImpl<UmsAdminMapper, UmsAdmin> implements UmsAdminService {

}
