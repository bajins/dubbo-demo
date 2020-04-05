package com.bajins.shop.server.controller;

import com.bajins.admin.api.dubbo.ProductInfoService;
import com.bajins.admin.api.response.BaseResponse;
import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("prod")
public class ProductController {
    private static final Logger log = LoggerFactory.getLogger(ProductController.class);

    // 该注解在dubbo2.7.x中提供替代在XML中的服务提供者接口配置
    @Reference(version = "1.0")
    private ProductInfoService productInfoService;

    @RequestMapping(value = "list")
    public BaseResponse list() {
        return productInfoService.ListProductInfo();
    }

    @RequestMapping(value = "list/page")
    public BaseResponse listPage(Integer pageNo, Integer pageSize) {
        return productInfoService.ListPageProductInfo(pageNo, pageSize);
    }
}
