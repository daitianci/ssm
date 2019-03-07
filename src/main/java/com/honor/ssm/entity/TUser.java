package com.honor.ssm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author daitianci
 * @since 2019-03-07
 */
public class TUser extends Model<TUser> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "USER_ID", type = IdType.AUTO)
    private Integer userId;

    @TableField("USER_NAME")
    private String userName;

    @TableField("USER_PWD")
    private String userPwd;

    @TableField("REG_DATE")
    private LocalDate regDate;

    @TableField("GROUP_ID")
    private Integer groupId;

    @TableField("LOCKED")
    private Integer locked;

    @TableField("USER_SALT")
    private String userSalt;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }
    public LocalDate getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }
    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }
    public Integer getLocked() {
        return locked;
    }

    public void setLocked(Integer locked) {
        this.locked = locked;
    }
    public String getUserSalt() {
        return userSalt;
    }

    public void setUserSalt(String userSalt) {
        this.userSalt = userSalt;
    }

    @Override
    protected Serializable pkVal() {
        return this.userId;
    }

    @Override
    public String toString() {
        return "TUser{" +
        "userId=" + userId +
        ", userName=" + userName +
        ", userPwd=" + userPwd +
        ", regDate=" + regDate +
        ", groupId=" + groupId +
        ", locked=" + locked +
        ", userSalt=" + userSalt +
        "}";
    }
}
