package com.bajins.admin.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//@EnableDubboConfig
//@EnableDubbo
//@EnableAutoConfiguration(exclude={DruidDataSourceAutoConfigure.class})
@MapperScan(basePackages = "com.bajins.admin.model.mapper")
@SpringBootApplication
public class BajinsAdminApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(BajinsAdminApplication.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(BajinsAdminApplication.class, args);
    }
}
