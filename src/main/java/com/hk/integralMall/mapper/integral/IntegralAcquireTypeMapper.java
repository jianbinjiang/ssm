package com.hk.integralMall.mapper.integral;

import com.hk.integralMall.model.integral.IntegralAcquireType;

public interface IntegralAcquireTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(IntegralAcquireType record);

    int insertSelective(IntegralAcquireType record);

    IntegralAcquireType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(IntegralAcquireType record);

    int updateByPrimaryKey(IntegralAcquireType record);
}