package com.qubaba.flyuserserver.entity.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_account")
public class SysAccount {
    @Id
    @Column(name = "account_id")
    @GeneratedValue(generator = "JDBC")
    private Long accountId;

    /**
     * 账号
     */
    private String account;

    /**
     * 密码
     */
    private String password;

    /**
     * 是否过期 1是 0否
     */
    @Column(name = "is_expired")
    private Byte expired;

    /**
     * 是否删除 1是 0否
     */
    @Column(name = "is_delete")
    private Byte delete;

    /**
     * 是否无效 1是 0否
     */
    @Column(name = "is_invalid")
    private Byte invalid;

    /**
     * 是否锁定 1是 0否
     */
    @Column(name = "is_locked")
    private Byte locked;

    /**
     * 创建时间
     */
    @Column(name = "gmt_create")
    private Date gmtCreate;

    /**
     * 最后修改时间
     */
    @Column(name = "gmt_modified")
    private Date gmtModified;

    /**
     * 创建用户
     */
    @Column(name = "create_user_id")
    private Long createUserId;

    /**
     * 最后修改用户
     */
    @Column(name = "modified_user_id")
    private Long modifiedUserId;

    /**
     * @return account_id
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * @param accountId
     */
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    /**
     * 获取账号
     *
     * @return account - 账号
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置账号
     *
     * @param account 账号
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取是否过期 1是 0否
     *
     * @return expired - 是否过期 1是 0否
     */
    public Byte getExpired() {
        return expired;
    }

    /**
     * 设置是否过期 1是 0否
     *
     * @param expired 是否过期 1是 0否
     */
    public void setExpired(Byte expired) {
        this.expired = expired;
    }

    /**
     * 获取是否删除 1是 0否
     *
     * @return delete - 是否删除 1是 0否
     */
    public Byte getDelete() {
        return delete;
    }

    /**
     * 设置是否删除 1是 0否
     *
     * @param delete 是否删除 1是 0否
     */
    public void setDelete(Byte delete) {
        this.delete = delete;
    }

    /**
     * 获取是否无效 1是 0否
     *
     * @return invalid - 是否无效 1是 0否
     */
    public Byte getInvalid() {
        return invalid;
    }

    /**
     * 设置是否无效 1是 0否
     *
     * @param invalid 是否无效 1是 0否
     */
    public void setInvalid(Byte invalid) {
        this.invalid = invalid;
    }

    /**
     * 获取是否锁定 1是 0否
     *
     * @return locked - 是否锁定 1是 0否
     */
    public Byte getLocked() {
        return locked;
    }

    /**
     * 设置是否锁定 1是 0否
     *
     * @param locked 是否锁定 1是 0否
     */
    public void setLocked(Byte locked) {
        this.locked = locked;
    }

    /**
     * 获取创建时间
     *
     * @return gmt_create - 创建时间
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * 设置创建时间
     *
     * @param gmtCreate 创建时间
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * 获取最后修改时间
     *
     * @return gmt_modified - 最后修改时间
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * 设置最后修改时间
     *
     * @param gmtModified 最后修改时间
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * 获取创建用户
     *
     * @return create_user_id - 创建用户
     */
    public Long getCreateUserId() {
        return createUserId;
    }

    /**
     * 设置创建用户
     *
     * @param createUserId 创建用户
     */
    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 获取最后修改用户
     *
     * @return modified_user_id - 最后修改用户
     */
    public Long getModifiedUserId() {
        return modifiedUserId;
    }

    /**
     * 设置最后修改用户
     *
     * @param modifiedUserId 最后修改用户
     */
    public void setModifiedUserId(Long modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }
}