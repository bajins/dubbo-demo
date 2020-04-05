package com.bajins.admin.server.service.dubbo;

import com.bajins.admin.api.dubbo.ProductInfoService;
import com.bajins.admin.api.enums.StatusCode;
import com.bajins.admin.api.response.BaseResponse;
import com.bajins.admin.model.entity.ProductInfo;
import com.bajins.admin.model.mapper.ProductInfoMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(validation = "true", version = "1.0", timeout = 3000)
//@Component
public class ProductInfoServiceImpl implements ProductInfoService {

    private static final Logger log = LoggerFactory.getLogger(ProductInfoServiceImpl.class);

    @Autowired
    private ProductInfoMapper productInfoMapper;

    @Override
    public BaseResponse ListProductInfo() {
        BaseResponse baseResponse = new BaseResponse(StatusCode.SUCCESS);
        try {
            List<ProductInfo> productInfos = productInfoMapper.selectAll();
            log.info("查询到的商品信息列表：{}", productInfos);
            baseResponse.setData(productInfos);
        } catch (Exception e) {
            log.error("查询商品列表逻辑异常：", e.fillInStackTrace());
            baseResponse = new BaseResponse(StatusCode.FAIL);
        }
        return baseResponse;
    }

    @Override
    public BaseResponse ListPageProductInfo(Integer pageNo, Integer pageSize) {
        BaseResponse baseResponse = new BaseResponse(StatusCode.SUCCESS);
        try {
            PageHelper.startPage(pageNo, pageSize);
            PageInfo<ProductInfo> pageInfo = new PageInfo<>(productInfoMapper.selectAll());
            log.info("分页查询到的商品信息列表：{}", pageInfo);
            baseResponse.setData(pageInfo);
        } catch (Exception e) {
            log.error("分页查询商品列表逻辑异常：", e.fillInStackTrace());
            baseResponse = new BaseResponse(StatusCode.FAIL);
        }
        return baseResponse;
    }
}
