package com.boojum.deepinspringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.boojum.deepinspringboot.mapper")
public class DeepInSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeepInSpringbootApplication.class, args);
    }

}
