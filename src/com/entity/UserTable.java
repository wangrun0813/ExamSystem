package com.entity;

/**
 * UserTable entity. @author MyEclipse Persistence Tools
 */

public class UserTable implements java.io.Serializable {

	// Fields

	private String id;
	private String password;
	private String type;

	// Constructors

	/** default constructor */
	public UserTable() {
	}

	/** minimal constructor */
	public UserTable(String id) {
		this.id = id;
	}

	/** full constructor */
	public UserTable(String id, String password, String type) {
		this.id = id;
		this.password = password;
		this.type = type;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}