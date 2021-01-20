package com.qubaba.flyuserserver.entity.domain;

import javax.persistence.*;

@Table(name = "sys_company")
public class SysCompany {
    @Id
    @Column(name = "company_id")
    @GeneratedValue(generator = "JDBC")
    private Long companyId;

    /**
     * 公司名称
     */
    @Column(name = "company_name")
    private String companyName;

    /**
     * @return company_id
     */
    public Long getCompanyId() {
        return companyId;
    }

    /**
     * @param companyId
     */
    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    /**
     * 获取公司名称
     *
     * @return company_name - 公司名称
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 设置公司名称
     *
     * @param companyName 公司名称
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}