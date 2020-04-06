package com.boojum.deepinspringboot.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RestController;

/**
* @author boojum
* @since 2020-04-06
*/
@Api(tags = {"后台用户和权限关系表(除角色中定义的权限以外的加减权限)"})
@RestController
@RequestMapping("/umsAdminPermissionRelation")
public class UmsAdminPermissionRelationController {

}

