package com.boojum.deepinspringboot.mapper;

import com.boojum.deepinspringboot.entity.UmsAdminRoleRelation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.boojum.deepinspringboot.entity.UmsPermission;

import java.util.List;

/**
 * <p>
 * 后台用户和角色关系表 Mapper 接口
 * </p>
 *
 * @author boojum
 * @since 2020-04-05
 */
public interface UmsAdminRoleRelationMapper extends BaseMapper<UmsAdminRoleRelation> {

    List<UmsPermission> getPermissionList(Long adminId);
}
