package com.dao;

import java.util.List;

import com.entity.UserTable;

public interface UserTableDao {

	public abstract void save(UserTable transientInstance);

	public abstract void delete(UserTable persistentInstance);

	public abstract void updatePswd(UserTable userTable);
	
	public abstract UserTable findById(java.lang.String id);

	public abstract List findByExample(UserTable instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByPassword(Object password);

	public abstract List findByType(Object type);

	public abstract List findAll();

	public abstract UserTable merge(UserTable detachedInstance);

	public abstract void attachDirty(UserTable instance);

	public abstract void attachClean(UserTable instance);

}