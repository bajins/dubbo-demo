package com.bajins.admin.model.mapper;

import com.bajins.admin.model.entity.OrderRecord;

public interface OrderRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderRecord record);

    int insertSelective(OrderRecord record);

    OrderRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderRecord record);

    int updateByPrimaryKey(OrderRecord record);
}