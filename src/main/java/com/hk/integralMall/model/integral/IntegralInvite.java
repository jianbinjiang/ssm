package com.hk.integralMall.model.integral;

import java.util.Date;

/** 
* @ClassName: IntegralInvite 
* @author bushuai
* @Description: 分享邀请实体
* @date 2016年10月18日 下午2:26:57 
*/
public class IntegralInvite {
    /**
     * 主键自增ID
     */
    private Integer id;

    /**
     * 账户ID
     */
    private String userid;

    /**
     * 分享邀请码
     */
    private String invitecode;

    /**
     * 分享次数
     */
    private int sharetravel = 1;

    /**
     * 被邀请人微信标识
     */
    private String inviteUA;

    /**
     * 被邀请人ID
     */
    private String inviteid;

    /**
     * 是否已获得积分(0未获得，1已获得)
     */
    private Byte getstatus;

    /**
     * 创建时间
     */
    private Date ctime;

    /**
     * 获取主键自增ID
     *
     * @return id - 主键自增ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键自增ID
     *
     * @param id 主键自增ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取账户ID
     *
     * @return userId - 账户ID
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 设置账户ID
     *
     * @param userid 账户ID
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * 获取分享邀请码
     *
     * @return inviteCode - 分享邀请码
     */
    public String getInvitecode() {
        return invitecode;
    }

    /**
     * 设置分享邀请码
     *
     * @param invitecode 分享邀请码
     */
    public void setInvitecode(String invitecode) {
        this.invitecode = invitecode == null ? null : invitecode.trim();
    }

    /**
     * 获取分享次数
     *
     * @return shareTravel - 分享次数
     */
    public int getSharetravel() {
        return sharetravel;
    }

    /**
     * 设置分享次数
     *
     * @param sharetravel 分享次数
     */
    public void setSharetravel(Byte sharetravel) {
        this.sharetravel = sharetravel;
    }

    /**
     * 获取被邀请人微信标识
     *
     * @return inviteUA - 被邀请人微信标识
     */
    public String getInviteUA() {
        return inviteUA;
    }

    /**
     * 设置被邀请人微信标识
     *
     * @param inviteUA 被邀请人微信标识
     */
    public void setInviteUA(String inviteUA) {
        this.inviteUA = inviteUA;
    }

    /**
     * 获取被邀请人ID
     *
     * @return inviteId - 被邀请人ID
     */
    public String getInviteid() {
        return inviteid;
    }

    /**
     * 设置被邀请人ID
     *
     * @param inviteid 被邀请人ID
     */
    public void setInviteid(String inviteid) {
        this.inviteid = inviteid;
    }

    /**
     * 获取是否已获得积分(0未获得，1已获得)
     *
     * @return getStatus - 是否已获得积分(0未获得，1已获得)
     */
    public Byte getGetstatus() {
        return getstatus;
    }

    /**
     * 设置是否已获得积分(0未获得，1已获得)
     *
     * @param getstatus 是否已获得积分(0未获得，1已获得)
     */
    public void setGetstatus(Byte getstatus) {
        this.getstatus = getstatus;
    }

    /**
     * 获取创建时间
     *
     * @return ctime - 创建时间
     */
    public Date getCtime() {
        return ctime;
    }
    
    public void setSharetravel(int sharetravel) {
		this.sharetravel = sharetravel;
	}

	/**
     * 设置创建时间
     *
     * @param ctime 创建时间
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

	public IntegralInvite(String userid, String invitecode,String inviteUA) {
		super();
		this.userid = userid;
		this.invitecode = invitecode;
		this.inviteUA = inviteUA;
	}

	public IntegralInvite(String userid, String invitecode, String inviteUA, String inviteid) {
		super();
		this.userid = userid;
		this.invitecode = invitecode;
		this.inviteUA = inviteUA;
		this.inviteid = inviteid;
	}

	public IntegralInvite() {
		super();
	}
}