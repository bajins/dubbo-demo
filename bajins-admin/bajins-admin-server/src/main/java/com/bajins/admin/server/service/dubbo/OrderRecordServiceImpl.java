package com.bajins.admin.server.service.dubbo;

import com.bajins.admin.api.dto.PushOrderDto;
import com.bajins.admin.api.dubbo.OrderRecordService;
import com.bajins.admin.api.enums.StatusCode;
import com.bajins.admin.api.response.BaseResponse;
import com.bajins.admin.model.entity.OrderRecord;
import com.bajins.admin.model.mapper.OrderRecordMapper;
import org.apache.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import java.util.Date;

@Service(version = "1.0", timeout = 30000)
public class OrderRecordServiceImpl implements OrderRecordService {

    private static final Logger log = LoggerFactory.getLogger(OrderRecordServiceImpl.class);

    @Autowired
    private OrderRecordMapper orderRecordMapper;

    @Override
    public BaseResponse<Object> pushOrder(PushOrderDto dto) {
        if (dto.getProductId() <= 0 || dto.getTotal() <= 0 || StringUtils.isEmpty(dto.getCustomerName())) {
            return new BaseResponse<>(StatusCode.INVALID_PARAMS);
        }
        BaseResponse response = new BaseResponse(StatusCode.SUCCESS);
        try {
            // TODO:实际的业务逻辑


            // TODO:校验商品是否存在
            OrderRecord orderRecord = orderRecordMapper.selectByPrimaryKey(dto.getProductId());
            if (orderRecord == null) {
                return new BaseResponse<>(3040, "商品不存在");
            }

            // TODO:库存服务-校验


            // TODO:客服中心服务-校验


            // TODO:创建订单
            OrderRecord or = new OrderRecord();
            or.setProductId(dto.getProductId());
            or.setCustomerName(dto.getCustomerName());
            or.setTotal(dto.getTotal());
            or.setCreateTime(new Date());

            orderRecordMapper.insertSelective(or);

            response.setData(or.getId());
        } catch (Exception e) {
            log.error("错误：", e);
            response = new BaseResponse(StatusCode.FAIL.getCode(), e.getMessage());
        }
        return response;
    }
}
