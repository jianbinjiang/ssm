package com.hk.integralMall.model.integral;


/** 
* @ClassName: IntegralUser 
* @author bushuai
* @Description: 用户积分表
* @date 2016年10月18日 下午2:26:36 
*/
public class IntegralUser {
    /**
     * 用户积分表主键Id
     */
    private Integer id;

    /**
     * 关联医生账户ID
     */
    private String userid;

    /**
     * 医生姓名
     */
    private String username;

    /**
     * 手机号码
     */
    private String telphone;
    
    /**
     * 医客号
     */
    private String yikecode;

    /**
     * 最新签到时间
     */
    private String pasttime = "1971-01-01 01:01:00";

    /**
     * 连续签到次数
     */
    private Byte pastcount;

    /**
     * 总积分
     */
    private int totalscore;

    /**
     * 创建时间
     */
    private String ctime;
    
    /**
     * 积分失效时间
     */
    private String failureTime;

    /**
     * 获取用户积分表主键Id
     *
     * @return id - 用户积分表主键Id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置用户积分表主键Id
     *
     * @param id 用户积分表主键Id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取关联医生账户ID
     *
     * @return userId - 关联医生账户ID
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 设置关联医生账户ID
     *
     * @param userid 关联医生账户ID
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * 获取医生姓名
     *
     * @return userName - 医生姓名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置医生姓名
     *
     * @param username 医生姓名
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 获取手机号码
     *
     * @return telPhone - 手机号码
     */
    public String getTelphone() {
        return telphone;
    }

    /**
     * 设置手机号码
     *
     * @param telphone 手机号码
     */
    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    /**
     * @return yikeCode
     */
    public String getYikecode() {
        return yikecode;
    }

    /**
     * @param yikecode
     */
    public void setYikecode(String yikecode) {
        this.yikecode = yikecode == null ? null : yikecode.trim();
    }

    /**
     * 获取最新签到时间
     *
     * @return pastTime - 最新签到时间
     */
    public String getPasttime() {
        return pasttime;
    }

    /**
     * 设置最新签到时间
     *
     * @param pasttime 最新签到时间
     */
    public void setPasttime(String pasttime) {
        this.pasttime = pasttime;
    }

    /**
     * 获取连续签到次数
     *
     * @return pastCount - 连续签到次数
     */
    public Byte getPastcount() {
        return pastcount;
    }

    /**
     * 设置连续签到次数
     *
     * @param pastcount 连续签到次数
     */
    public void setPastcount(Byte pastcount) {
        this.pastcount = pastcount;
    }

    /**
     * 获取总积分
     *
     * @return totalScore - 总积分
     */
    public int getTotalscore() {
        return totalscore;
    }

    /**
     * 设置总积分
     *
     * @param totalscore 总积分
     */
    public void setTotalscore(int totalscore) {
        this.totalscore = totalscore;
    }

    /**
     * 获取创建时间
     *
     * @return ctime - 创建时间
     */
    public String getCtime() {
        return ctime;
    }

    /**
     * 设置创建时间
     *
     * @param ctime 创建时间
     */
    public void setCtime(String ctime) {
        this.ctime = ctime;
    }

	public String getFailureTime() {
		return failureTime;
	}

	public void setFailureTime(String failureTime) {
		this.failureTime = failureTime;
	}

	public IntegralUser(String userid, String username, String telphone, String yikecode,String failureTime) {
		this.userid = userid;
		this.username = username;
		this.telphone = telphone;
		this.yikecode = yikecode;
		this.failureTime = failureTime;
	}
	
	public IntegralUser() {
	}
}