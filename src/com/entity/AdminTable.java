package com.entity;

/**
 * AdminTable entity. @author MyEclipse Persistence Tools
 */

public class AdminTable implements java.io.Serializable {

	// Fields

	private Integer adminId;
	private String adminAccount;
	private String adminName;
	private String adminTel;

	// Constructors

	/** default constructor */
	public AdminTable() {
	}

	/** full constructor */
	public AdminTable(String adminAccount, String adminName, String adminTel) {
		this.adminAccount = adminAccount;
		this.adminName = adminName;
		this.adminTel = adminTel;
	}

	// Property accessors

	public Integer getAdminId() {
		return this.adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public String getAdminAccount() {
		return this.adminAccount;
	}

	public void setAdminAccount(String adminAccount) {
		this.adminAccount = adminAccount;
	}

	public String getAdminName() {
		return this.adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminTel() {
		return this.adminTel;
	}

	public void setAdminTel(String adminTel) {
		this.adminTel = adminTel;
	}

}