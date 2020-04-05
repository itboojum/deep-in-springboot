package com.boojum.deepinspringboot.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by boojum on 2020/4/5.
 */
@Configuration
@MapperScan("com.boojum.deepinspringboot.mapper")
public class MybatisPlusConfig {
}
