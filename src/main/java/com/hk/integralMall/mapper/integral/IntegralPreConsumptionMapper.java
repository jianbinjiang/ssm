package com.hk.integralMall.mapper.integral;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.hk.integralMall.model.integral.IntegralPreConsumption;

public interface IntegralPreConsumptionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(IntegralPreConsumption record);
   /**
    * 欲扣积分表中插入一条数据
    * @param preConsumption
    * @return
    */
    int insertPreConsumIntegral(IntegralPreConsumption preConsumption);

    int insertSelective(IntegralPreConsumption record);
    /**
     * 查询
     * @param orderId
     * @return
     */
    IntegralPreConsumption selectByOrderId(@Param("orderId") String orderId);

    int updateByPrimaryKeySelective(IntegralPreConsumption record);

    int updateByPrimaryKey(IntegralPreConsumption record);
    
    /**
     * 更新欲扣积分表中记录
     * @param params
     * @return
     */
    int updateByOrderId(Map<String,Object> params);
}