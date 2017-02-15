package com.hk.integralMall.mapper.integral;

import java.util.Map;

import com.hk.integralMall.model.integral.IntegralInvite;

public interface IntegralInviteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(IntegralInvite record);

    int insertSelective(IntegralInvite record);

    IntegralInvite selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(IntegralInvite record);

    int updateByPrimaryKey(IntegralInvite record);
    
    IntegralInvite selectIsShareByUserId(String userId);
    

	/** 
	* @Title: updateShareTravelByConditions 
	* @Description: 更新用户分享次数
	* @param userId
	* @return  
	*/
	int updateShareTravelByConditions(IntegralInvite record);
	
	/** 
	* @Title: execFinishInvite 
	* @Description: 邀请好友注册后流程
	* @param inParams  
	*/
	void execFinishInvite(Map<String,Object> inParams);
}