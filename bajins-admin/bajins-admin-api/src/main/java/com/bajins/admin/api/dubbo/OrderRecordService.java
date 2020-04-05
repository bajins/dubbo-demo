package com.bajins.admin.api.dubbo;

import com.bajins.admin.api.dto.PushOrderDto;
import com.bajins.admin.api.response.BaseResponse;

public interface OrderRecordService {

    BaseResponse<Object> pushOrder(PushOrderDto dto);
}
