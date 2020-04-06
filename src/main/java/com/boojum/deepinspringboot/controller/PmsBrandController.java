package com.boojum.deepinspringboot.controller;


import com.boojum.deepinspringboot.common.CommonResult;
import com.boojum.deepinspringboot.entity.PmsBrand;
import com.boojum.deepinspringboot.service.IPmsBrandService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;

import java.util.List;

/**
* @author boojum
* @since 2020-04-05
*/
@Api(tags = {"品牌表"})
@RestController
@RequestMapping("/pmsBrand")
public class PmsBrandController {

    @Autowired
    private IPmsBrandService pmsBrandService;

    @ApiOperation("获取所有品牌列表")
    @GetMapping("/listAll")
    @PreAuthorize("hasAuthority('pms:brand:read')")
    public CommonResult<List<PmsBrand>> getBrandList() {
        return CommonResult.success(pmsBrandService.list());
    }

}

