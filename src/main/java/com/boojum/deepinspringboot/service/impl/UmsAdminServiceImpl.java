package com.boojum.deepinspringboot.service.impl;

import cn.hutool.core.collection.CollectionUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.boojum.deepinspringboot.entity.UmsAdmin;
import com.boojum.deepinspringboot.entity.UmsPermission;
import com.boojum.deepinspringboot.mapper.UmsAdminMapper;
import com.boojum.deepinspringboot.mapper.UmsAdminRoleRelationMapper;
import com.boojum.deepinspringboot.mapper.UmsRolePermissionRelationMapper;
import com.boojum.deepinspringboot.service.UmsAdminCacheService;
import com.boojum.deepinspringboot.service.UmsAdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Autowired
    private UmsAdminCacheService adminCacheService;

    @Autowired
    private UmsAdminRoleRelationMapper adminRoleRelationMapper;

    @Override
    public UmsAdmin getAdminByUsername(String username) {
        UmsAdmin admin = adminCacheService.getAdmin(username);
        if (admin != null){
            return admin;
        }
        List<UmsAdmin> adminList = this.list(new LambdaQueryWrapper<UmsAdmin>().eq(UmsAdmin::getUsername, username));
        if (CollectionUtil.isNotEmpty(adminList)){
            admin = adminList.get(0);
            adminCacheService.setAdmin(admin);
            return admin;
        }
        return null;
    }

    @Override
    public List<UmsPermission> getPermissionList(Long adminId) {
        return adminRoleRelationMapper.getPermissionList(adminId);
    }
}
