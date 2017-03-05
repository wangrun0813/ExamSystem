package com.dao;

import java.util.List;

import com.entity.AdminTable;

public interface AdminTableDao {

	// property constants
	public static final String ADMIN_ACCOUNT = "adminAccount";

	public abstract void save(AdminTable transientInstance);

	public abstract void delete(AdminTable persistentInstance);

	public abstract AdminTable findById(java.lang.Integer id);

	public abstract List findByExample(AdminTable instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByAdminAccount(Object adminAccount);

	public abstract List findByAdminName(Object adminName);

	public abstract List findByAdminTel(Object adminTel);

	public abstract List findAll();

	public abstract AdminTable merge(AdminTable detachedInstance);

	public abstract void attachDirty(AdminTable instance);

	public abstract void attachClean(AdminTable instance);

}