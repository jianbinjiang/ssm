package com.hk.integralMall.controller.integral;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hk.integralMall.service.IntegralService2DuibaImpl;
import com.hk.integralMall.service.IntegralServiceImpl;
import com.hk.integralMall.vo.RegisteVo;
import com.hk.integralMall.vo.SimpleWrap;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/** 
* @ClassName: IntegralControl 
* @author bushuai
* @Description: 积分操作请求层
* @date 2016年10月15日 下午1:43:30 
*/
@RestController
@RequestMapping("/integral")
@Api(value = "医客-积分商城页面调用服务API", description = "积分商城服务API入口")
public class IntegralControl {
	
	@Autowired
	private IntegralServiceImpl integralService;
	
	@Autowired
    private IntegralService2DuibaImpl integralService2DuibaImpl;
	
	
	@ApiOperation(value = "查询签到日历", httpMethod  = "GET")
	@RequestMapping(value = "/pastCalendar/{userId}/{month}", method = RequestMethod.GET)
	public SimpleWrap queryPastCalendar(
			@ApiParam(value = "用户ID", required = true) @PathVariable String userId,
			@ApiParam(value = "月份 例如:201610", required = true)@PathVariable String month){
		return integralService.queryPastCalendar(userId,month);
	}
	
	
	@ApiOperation(value = "查询用户积分信息", httpMethod  = "GET")
	@RequestMapping(value = "/userInfo/{userId}", method = RequestMethod.GET)
	public SimpleWrap queryUserIntegralInfo(@ApiParam(value = "用户ID", required = true) @PathVariable String userId){
		return integralService.queryUserIntegralInfo(userId);
	}
	
	
	@ApiOperation(value = "查询积分记录", httpMethod  = "GET")
	@RequestMapping(value = "/history/{userId}/{page}/{rows}",method = RequestMethod.GET)
	public SimpleWrap queryIntegralHistoryRecords(
			@ApiParam(value = "用户ID", required = true)@PathVariable String userId,
			@ApiParam(value = "页码", required = true)@PathVariable int page,
			@ApiParam(value = "页面大小", required = true)@PathVariable int rows){
		return integralService.queryIntegralRecords(userId,page,rows);
	}
	
	
	@ApiOperation(value = "查询用户签到关联数据", httpMethod  = "GET")
	@RequestMapping(value = "/signInData/{userId}", method = RequestMethod.GET)
	public SimpleWrap getUserSignInReleaseData(@ApiParam(value = "用户ID", required = true)@PathVariable String userId){
		return integralService.queryUserSignInData(userId);
	}
	
	
	@ApiOperation(value = "分享邀请", httpMethod  = "POST",produces= MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	@RequestMapping(value = "/share", method = RequestMethod.POST)
	public SimpleWrap shareInviteFirend(
			@ApiParam(value = "邀请人ID", required = true)@RequestParam String userId,
			@ApiParam(value = "邀请方UA", required = false)@RequestParam String inviteUA){
		return integralService.shareInviteFirend(userId,inviteUA);
	}
	
	
	@ApiOperation(value = "分享完成注册", httpMethod  = "POST")
	@RequestMapping(value = "/completeReg", method = RequestMethod.POST)
	public SimpleWrap completeRegistered(@ApiParam(value = "被邀请人ID", required = true)@RequestParam String inviteUId){
		return integralService.finishRegistered(inviteUId);
	}
	
	@ApiOperation(value = "生成免登陆url",httpMethod="POST")
	@RequestMapping(value = "/buildUrl", method = RequestMethod.POST)
	public String buildLoginUrl(
			@ApiParam(value = "用户ID", required = true)@RequestParam String uId,
			@ApiParam(value = "医生名称", required = false)@RequestParam(required=false) String userName,
			@ApiParam(value = "手机号", required = false)@RequestParam(required=false) String telPhone,
			@ApiParam(value = "医客号", required = false)@RequestParam(required=false) String yikeCode,
			@ApiParam(value = "指定跳转页面", required = false)@RequestParam(required=false) String redirect){  
		return integralService2DuibaImpl.buildLoginUrl(uId,userName,telPhone,yikeCode,redirect);
	}
	
	
	@ApiOperation(value = "用户注册",httpMethod="POST")
	@RequestMapping(value = "/userRegiste", method = RequestMethod.POST)
	public SimpleWrap addUserLoginRegiste(@ApiParam(value="入参实体",required=true)@RequestBody RegisteVo registeVo){
		return integralService.addUserLoginRegiste(registeVo);
	}
	
	
	@ApiOperation(value = "获取注册手机验证码",httpMethod="POST")
	@RequestMapping(value = "/getMobilePhoneCaptcha", method = RequestMethod.POST)
	public SimpleWrap getMobilePhoneCaptcha(@ApiParam(value = "手机号码", required = true)@RequestParam String MobilePhone){
		return integralService.getMobilePhoneCaptcha(MobilePhone);
	}
}
