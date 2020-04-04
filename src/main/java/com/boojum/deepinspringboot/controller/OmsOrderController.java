package com.boojum.deepinspringboot.controller;


import com.boojum.deepinspringboot.entity.OmsOrder;
import com.boojum.deepinspringboot.service.OmsOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 订单表 前端控制器
 * </p>
 *
 * @author boojum
 * @since 2020-04-05
 */
@RestController
@RequestMapping("/oms-order")
public class OmsOrderController {

    @Autowired
    private OmsOrderService omsOrderService;

    @GetMapping("/list")
    public List<OmsOrder> list(){
        return omsOrderService.list();
    }

}

