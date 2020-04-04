package com.boojum.deepinspringboot.service.impl;

import com.boojum.deepinspringboot.entity.UmsAdminPermissionRelation;
import com.boojum.deepinspringboot.mapper.UmsAdminPermissionRelationMapper;
import com.boojum.deepinspringboot.service.UmsAdminPermissionRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限) 服务实现类
 * </p>
 *
 * @author boojum
 * @since 2020-04-05
 */
@Service
public class UmsAdminPermissionRelationServiceImpl extends ServiceImpl<UmsAdminPermissionRelationMapper, UmsAdminPermissionRelation> implements UmsAdminPermissionRelationService {

}
