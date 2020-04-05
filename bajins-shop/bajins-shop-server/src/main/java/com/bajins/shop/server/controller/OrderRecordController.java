package com.bajins.shop.server.controller;


import com.bajins.admin.api.dto.PushOrderDto;
import com.bajins.admin.api.dubbo.OrderRecordService;
import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.core.MediaType;


@RequestMapping("order")
@RestController
public class OrderRecordController {

    private static final Logger log= LoggerFactory.getLogger(OrderRecordController.class);

    @Reference(version = "1.0")
    private OrderRecordService orderRecordService;

    @PostMapping(value = "record/push", consumes = MediaType.APPLICATION_JSON)
    public void pushRecord(PushOrderDto dto) {
        orderRecordService.pushOrder(dto);
    }


}
