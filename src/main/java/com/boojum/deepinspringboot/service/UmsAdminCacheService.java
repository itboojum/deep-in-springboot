package com.boojum.deepinspringboot.service;

import com.boojum.deepinspringboot.entity.UmsAdmin;

import java.util.List;

/**
 * 后台用户缓存操作类
 * Created by boojum on 2020/4/6.
 */
public interface UmsAdminCacheService {
    /**
     * 删除后台用户缓存
     * @param adminId
     */
    void delAdmin(Long adminId);

    void delResourceList(Long adminId);

    void delResourceListByRole(Long roleId);

    void delResourceListByRoleIds(List<Long> roleIds);

    void delResourceListByResource(Long resourceId);

    UmsAdmin getAdmin(String username);

    void setAdmin(UmsAdmin admin);

}
