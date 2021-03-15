package com.qubaba.flyuserserver.entity.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "sys_user")
public class SysUser {
    /**
     * 主键
     */
    @Id
    @Column(name = "user_id")
    @GeneratedValue(generator = "JDBC")
    private Long userId;

    /**
     * 账户id
     */
    private Long account;

    /**
     * 姓名
     */
    private String username;

    /**
     * 性别 0女 1男
     */
    private Byte sex;

    /**
     * 工号
     */
    @Column(name = "job_number")
    private String jobNumber;

    /**
     * 年龄
     */
    private Byte age;

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
     * 创建用户id
     */
    @Column(name = "create_user_id")
    private Long createUserId;

    /**
     * 最后修改时间
     */
    @Column(name = "gmt_modified")
    private Date gmtModified;

    /**
     * 最后修改用户id
     */
    @Column(name = "modified_user_id")
    private Long modifiedUserId;

    /**
     * 是否删除
     */
    @Column(name = "is_delete")
    private Byte delete;

}