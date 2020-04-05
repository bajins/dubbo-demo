package com.bajins.shop.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.bajins.shop.model.mapper")
@SpringBootApplication
//@EnableDubboConfig
public class BajinsShopApplication {
    public static void main(String[] args) {
        SpringApplication.run(BajinsShopApplication.class, args);
    }
}
