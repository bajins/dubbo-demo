package com.bajins.admin.api.dubbo;

import com.bajins.admin.api.response.BaseResponse;

public interface ProductInfoService {

    BaseResponse ListProductInfo();

    BaseResponse ListPageProductInfo(Integer pageNo, Integer pageSize);
}
