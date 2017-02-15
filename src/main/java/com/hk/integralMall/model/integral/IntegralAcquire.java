package com.hk.integralMall.model.integral;




/** 
* @ClassName: IntegralAcquire 
* @author bushuai
* @Description: 积分获取表
* @date 2016年10月18日 下午2:27:22 
*/
public class IntegralAcquire {
    /**
     * 自增主键
     */
    private Integer id;

    /**
     * 用户id
     */
    private String userid;

    /**
     * 获得类型id
     */
    private Integer acquireid;

    /**
     * 获得积分值
     */
    private Integer score;

    /**
     * 是否有效
     */
    private String iseffective;

    /**
     * 更新时间
     */
    private String ctime;

    /**
     * 获取自增主键
     *
     * @return id - 自增主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置自增主键
     *
     * @param id 自增主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户id
     *
     * @return userId - 用户id
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 设置用户id
     *
     * @param userid 用户id
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * 获取获得类型id
     *
     * @return acquireId - 获得类型id
     */
    public Integer getAcquireid() {
        return acquireid;
    }

    /**
     * 设置获得类型id
     *
     * @param acquireid 获得类型id
     */
    public void setAcquireid(Integer acquireid) {
        this.acquireid = acquireid;
    }

    /**
     * 获取获得积分值
     *
     * @return score - 获得积分值
     */
    public Integer getScore() {
        return score;
    }

    /**
     * 设置获得积分值
     *
     * @param score 获得积分值
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * 获取是否有效
     *
     * @return isEffective - 是否有效
     */
    public String getIseffective() {
        return iseffective;
    }

    /**
     * 设置是否有效
     *
     * @param iseffective 是否有效
     */
    public void setIseffective(String iseffective) {
        this.iseffective = iseffective == null ? null : iseffective.trim();
    }

    /**
     * 获取更新时间
     *
     * @return ctime - 更新时间
     */
    public String getCtime() {
        return ctime;
    }

    /**
     * 设置更新时间
     *
     * @param ctime 更新时间
     */
    public void setCtime(String ctime) {
        this.ctime = ctime;
    }
}