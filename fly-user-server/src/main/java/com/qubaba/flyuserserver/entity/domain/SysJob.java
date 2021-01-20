package com.qubaba.flyuserserver.entity.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_job")
public class SysJob {
    /**
     * 职务id
     */
    @Id
    @Column(name = "job_id")
    @GeneratedValue(generator = "JDBC")
    private Long jobId;

    /**
     * 职务名称
     */
    @Id
    @Column(name = "job_name")
    private String jobName;

    /**
     * 所属公司
     */
    @Column(name = "company_id")
    private Long companyId;

    /**
     * 创建时间
     */
    @Column(name = "gmt_create")
    private Date gmtCreate;

    /**
     * 创建用户
     */
    @Column(name = "create_user")
    private Long createUser;

    /**
     * 修改时间
     */
    @Column(name = "gmt_modified")
    private Date gmtModified;

    /**
     * 最后修改用户
     */
    @Column(name = "modified_user")
    private Long modifiedUser;

    /**
     * 是否可用 0 不可用 1 可用
     */
    @Column(name = "is_available")
    private Byte isAvailable;

    /**
     * 是否删除
     */
    @Column(name = "is_delete")
    private Byte isDelete;

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
     * 获取职务名称
     *
     * @return job_name - 职务名称
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * 设置职务名称
     *
     * @param jobName 职务名称
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * 获取所属公司
     *
     * @return company_id - 所属公司
     */
    public Long getCompanyId() {
        return companyId;
    }

    /**
     * 设置所属公司
     *
     * @param companyId 所属公司
     */
    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
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
     * @return create_user - 创建用户
     */
    public Long getCreateUser() {
        return createUser;
    }

    /**
     * 设置创建用户
     *
     * @param createUser 创建用户
     */
    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    /**
     * 获取修改时间
     *
     * @return gmt_modified - 修改时间
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * 设置修改时间
     *
     * @param gmtModified 修改时间
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * 获取最后修改用户
     *
     * @return modified_user - 最后修改用户
     */
    public Long getModifiedUser() {
        return modifiedUser;
    }

    /**
     * 设置最后修改用户
     *
     * @param modifiedUser 最后修改用户
     */
    public void setModifiedUser(Long modifiedUser) {
        this.modifiedUser = modifiedUser;
    }

    /**
     * 获取是否可用 0 不可用 1 可用
     *
     * @return is_available - 是否可用 0 不可用 1 可用
     */
    public Byte getIsAvailable() {
        return isAvailable;
    }

    /**
     * 设置是否可用 0 不可用 1 可用
     *
     * @param isAvailable 是否可用 0 不可用 1 可用
     */
    public void setIsAvailable(Byte isAvailable) {
        this.isAvailable = isAvailable;
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