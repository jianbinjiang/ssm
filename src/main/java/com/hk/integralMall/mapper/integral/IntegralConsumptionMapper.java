package com.hk.integralMall.mapper.integral;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hk.integralMall.model.integral.IntegralConsumption;
import com.hk.integralMall.vo.IntegralConsumptionVO;

public interface IntegralConsumptionMapper {
    int deleteByPrimaryKey(Integer id);

    /**
     * 添加积分消费
     * @param record
     * @return
     */
    int insert(IntegralConsumption record);

    int insertSelective(IntegralConsumption record);

    IntegralConsumption selectByOrderId(String orderId);

    int updateByPrimaryKeySelective(IntegralConsumption record);

    int updateByPrimaryKey(IntegralConsumption record);
    
    /** 
    * @Title: selectHisRecodesByUserId 
    * @Description: 查询积分记录合并数据(包括消耗和增加)
    * @param userId
    * @return  
    */
    List<IntegralConsumptionVO> selectHisRecodesByUserId(@Param("userId") String userId);
}