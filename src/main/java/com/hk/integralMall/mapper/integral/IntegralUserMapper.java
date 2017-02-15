package com.hk.integralMall.mapper.integral;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.hk.integralMall.model.integral.IntegralUser;

public interface IntegralUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(IntegralUser record);

    int insertSelective(IntegralUser record);

    IntegralUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(IntegralUser record);

    int updateByPrimaryKey(IntegralUser record);
    /**
     * 根据userId修改总积分值
     * @param record
     * @return
     */
    int updateByUserId(@Param("userId") String userId,@Param("totalScore") int totalScore);
    /** 
    * @Title: selectByUserId 
    * @Description: 根据userId查询记录
    * @param userId
    * @return  
    */
    IntegralUser selectByUserId(@Param("userId") String userId);
    
    /** 
    * @Title: execSingedProcess 
    * @Description: 执行签到流程
    * @param inOut  
    */
    void execSingedProcess(Map<String,Object> inOut);
    
	/** 
	* @Title: querySignInRelateData 
	* @Description: 查询签到关联数据
	* @param inOut  
	*/
	void querySignInRelateData(Map<String, Object> inOut);
	/**
	 * 查询是否签到0未签到1签到
	 * @param userId
	 * @return
	 */
	int selectByUserIdForSignIn(@Param("userId") String userId);
	
	
	/** 
	* @Title: updateIntegralReset 
	* @Description: 积分清零
	* @param userId
	* @return  
	*/
	int updateIntegralReset(@Param("userId") String userId);
}