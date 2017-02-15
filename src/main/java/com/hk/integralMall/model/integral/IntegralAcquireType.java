package com.hk.integralMall.model.integral;

import java.util.Date;

/** 
* @ClassName: IntegralAcquireTpye 
* @author bushuai
* @Description: 积分获取类型表
* @date 2016年10月18日 下午2:27:14 
*/
public class IntegralAcquireType {
    /**
     * 自增主键
     */
    private Integer id;

    /**
     * 类型名称
     */
    private String typename;

    /**
     * 积分值
     */
    private Byte score;

    /**
     * 积分获得类型说明
     */
    private String description;

    /**
     * 是否有效
     */
    private String iseffective;

    /**
     * 创建时间
     */
    private Date ctime;

    /**
     * 更新时间
     */
    private Date utime;

    /**
     * 创建人
     */
    private String cuser;

    /**
     * 更新人
     */
    private String uuser;

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
     * 获取类型名称
     *
     * @return typeName - 类型名称
     */
    public String getTypename() {
        return typename;
    }

    /**
     * 设置类型名称
     *
     * @param typename 类型名称
     */
    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    /**
     * 获取积分值
     *
     * @return socre - 积分值
     */
    public Byte getScore() {
        return score;
    }

    /**
     * 设置积分值
     *
     * @param socre 积分值
     */
    public void setScore(Byte score) {
        this.score = score;
    }

    /**
     * 获取积分获得类型说明
     *
     * @return description - 积分获得类型说明
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置积分获得类型说明
     *
     * @param description 积分获得类型说明
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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
     * 获取创建时间
     *
     * @return ctime - 创建时间
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * 设置创建时间
     *
     * @param ctime 创建时间
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    /**
     * 获取更新时间
     *
     * @return utime - 更新时间
     */
    public Date getUtime() {
        return utime;
    }

    /**
     * 设置更新时间
     *
     * @param utime 更新时间
     */
    public void setUtime(Date utime) {
        this.utime = utime;
    }

    /**
     * 获取创建人
     *
     * @return cuser - 创建人
     */
    public String getCuser() {
        return cuser;
    }

    /**
     * 设置创建人
     *
     * @param cuser 创建人
     */
    public void setCuser(String cuser) {
        this.cuser = cuser == null ? null : cuser.trim();
    }

    /**
     * 获取更新人
     *
     * @return uuser - 更新人
     */
    public String getUuser() {
        return uuser;
    }

    /**
     * 设置更新人
     *
     * @param uuser 更新人
     */
    public void setUuser(String uuser) {
        this.uuser = uuser == null ? null : uuser.trim();
    }
}