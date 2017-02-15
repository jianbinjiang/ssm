package com.hk.integralMall.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hk.integralMall.mapper.integral.IntegralAcquireMapper;
import com.hk.integralMall.mapper.integral.IntegralConsumptionMapper;
import com.hk.integralMall.mapper.integral.IntegralInviteMapper;
import com.hk.integralMall.mapper.integral.IntegralUserMapper;
import com.hk.integralMall.utils.ServiceProxy;
import com.hk.integralMall.vo.RegisteVo;
import com.hk.integralMall.vo.SimpleWrap;

/**
 * 
 * @author s-na
 *
 */
@Service
public class IntegralServiceImpl {
	
	/** 
	* @Fields integralAcquire : 积分获取
	*/
	@Autowired
	private IntegralAcquireMapper integralAcquire;
	
	/** 
	* @Fields integralUser : 用户积分
	*/
	@Autowired
	private IntegralUserMapper integralUser;
	
	/** 
	* @Fields integralInvite : 分享邀请
	*/
	@Autowired
	private IntegralInviteMapper integralInvite;
	
	/** 
	* @Fields integralConsumption : 积分消耗表
	*/
	@Autowired
	private IntegralConsumptionMapper integralConsumption;
	
	/** 
	* @Fields serviceProxy : 请求代理
	*/
	@Autowired
	private ServiceProxy serviceProxy;
	/** 
	* @Title: queryPastCalendar 
	* @Description: 查询签到日历
	* @param userId
	* @return  
	*/
	public SimpleWrap queryPastCalendar(String userId,String month){
		SimpleWrap wraps = new SimpleWrap();
		return wraps;
	}
	

	
	/** 
	* @Title: queryIntegralRecords 
	* @Description: 查询积分记录
	* @param userId
	* @param page
	* @param rows
	* @return  
	*/
	public SimpleWrap queryIntegralRecords(String userId, int page,
			int rows) {
		SimpleWrap wraps = new SimpleWrap();
		return wraps;
	}
	
	
	/** 
	* @Title: userPastOperation 
	* @Description: 用户签到操作
	* @param userId
	* @return  
	*/
	@Transactional(rollbackFor=Exception.class)
	public Map<String,Object> userPastOperation(String userId,String token){
		/*输入输出参数源*/
		Map<String,Object> inOut = new HashMap<String,Object>();
		return inOut;
	} 
	
	
	/** 
	* @Title: shareInviteFirend 
	* @Description: 分享邀请好友
	* @param userId
	* @return  
	*/
	@Transactional(rollbackFor=Exception.class)
	public SimpleWrap shareInviteFirend(String userId,String inviteUA){
		SimpleWrap wraps = new SimpleWrap();
		return wraps;
	}

	
	/** 
	* @Title: finishRegistered 
	* @Description: 通过邀请完成注册
	* @param invitecode
	* @param inviteid
	* @return  
	*/
	@Transactional(rollbackFor=Exception.class)
	public SimpleWrap finishRegistered(String inviteUId) {
		SimpleWrap wraps = new SimpleWrap();
		return wraps;
	}
	
	/** 
	* @Title: queryUserIntegralInfo 
	* @Description: 查询用户积分基础信息
	* @param userId
	* @return  
	*/
	public SimpleWrap queryUserIntegralInfo(String userId){
		SimpleWrap wraps = new SimpleWrap();
		return wraps;
	}



	/** 
	* @Title: queryUserSignInData 
	* @Description: 查询用户签到关联数据
	* @param userId
	* @return  
	*/
	public SimpleWrap queryUserSignInData(String userId) {
		SimpleWrap wraps = new SimpleWrap();
		return wraps;
	}
	
	
	
	/**
	 * 用户注册
	 * @param registeVo
	 * @return
	 */
	@Transactional(rollbackFor=Exception.class)
	public SimpleWrap addUserLoginRegiste(RegisteVo registeVo){
		SimpleWrap wraps = new SimpleWrap();
		return wraps;
	}
	
	
	/**
	 * 获取注册手机验证码
	 * @param MobilePhone
	 * @return
	 */
	public SimpleWrap getMobilePhoneCaptcha(String mobilePhone) {
		SimpleWrap wraps = new SimpleWrap();
		return wraps;
	}
}
