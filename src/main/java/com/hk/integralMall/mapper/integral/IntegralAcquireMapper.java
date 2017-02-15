package com.hk.integralMall.mapper.integral;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hk.integralMall.model.integral.IntegralAcquire;

public interface IntegralAcquireMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(IntegralAcquire record);

    int insertSelective(IntegralAcquire record);

    IntegralAcquire selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(IntegralAcquire record);

    int updateByPrimaryKey(IntegralAcquire record);
    
    /** 
    * @Title: selectByAcquireType 
    * @Description: 查询用户签到记录
    * @param userId
    * @param acquireType
    * @return  
    */
    String selectByAcquireType(@Param("userId")String userId,@Param("month") String month);
    
    /** 
    * @Title: selectByUserId 
    * @Description: 查询积分记录
    * @param userId
    * @return  
    */
    List<String> selectByUserId(@Param("userId") String userId);

	

}