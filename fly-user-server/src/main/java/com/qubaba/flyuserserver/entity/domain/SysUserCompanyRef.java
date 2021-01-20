package com.qubaba.flyuserserver.entity.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_user_company_ref")
public class SysUserCompanyRef {
    /**
     * 用户id
     */
    @Id
    @Column(name = "user_id")
    private Long userId;

    /**
     * 组织id
     */
    @Id
    @Column(name = "company_id")
    private Long companyId;

    /**
     * 部门id
     */
    @Id
    @Column(name = "dept_id")
    private Long deptId;

    /**
     * 职务id
     */
    @Id
    @Column(name = "job_id")
    private Long jobId;

    /**
     * 创建时间
     */
    @Column(name = "gmt_create")
    private Date gmtCreate;

    /**
     * 创建用户
     */
    @Column(name = "create_user_id")
    private Long createUserId;

    /**
     * 最后修改时间
     */
    @Column(name = "gmt_modified")
    private Date gmtModified;

    /**
     * 最后修改用户
     */
    @Column(name = "modified_user_id")
    private Long modifiedUserId;

    /**
     * 是否删除
     */
    @Column(name = "is_delete")
    private Byte isDelete;

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取组织id
     *
     * @return company_id - 组织id
     */
    public Long getCompanyId() {
        return companyId;
    }

    /**
     * 设置组织id
     *
     * @param companyId 组织id
     */
    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    /**
     * 获取部门id
     *
     * @return dept_id - 部门id
     */
    public Long getDeptId() {
        return deptId;
    }

    /**
     * 设置部门id
     *
     * @param deptId 部门id
     */
    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    /**
     * 获取职务id
     *
     * @return job_id - 职务id
     */
    public Long getJobId() {
        return jobId;
    }

    /**
     * 设置职务id
     *
     * @param jobId 职务id
     */
    public void setJobId(Long jobId) {
        this.jobId = jobId;
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

    /**
     * 获取是否删除
     *
     * @return is_delete - 是否删除
     */
    public Byte getIsDelete() {
        return isDelete;
    }

    /**
     * 设置是否删除
     *
     * @param isDelete 是否删除
     */
    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }
}