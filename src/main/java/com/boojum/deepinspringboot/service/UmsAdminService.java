package com.boojum.deepinspringboot.service;

import com.boojum.deepinspringboot.entity.UmsAdmin;
import com.baomidou.mybatisplus.extension.service.IService;
import com.boojum.deepinspringboot.entity.UmsPermission;

import java.util.List;

/**
 * <p>
 * 后台用户表 服务类
 * </p>
 *
 * @author boojum
 * @since 2020-04-06
 */
public interface UmsAdminService extends IService<UmsAdmin> {

    UmsAdmin getAdminByUsername(String username);

    List<UmsPermission> getPermissionList(Long id);

    UmsAdmin register(UmsAdmin umsAdminParam);

    String login(String username, String password);
}
