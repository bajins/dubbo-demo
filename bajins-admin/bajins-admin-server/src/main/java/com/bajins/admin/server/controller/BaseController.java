package com.bajins.admin.server.controller;

import com.bajins.admin.api.enums.StatusCode;
import com.bajins.admin.api.response.BaseResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin")
public class BaseController {

    private static final Logger logger = LoggerFactory.getLogger(BaseController.class);

    @GetMapping("one")
    public BaseResponse one(@RequestParam(required = false) String param) {
        return new BaseResponse(StatusCode.SUCCESS).msg(param);
    }
}
