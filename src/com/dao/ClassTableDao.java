package com.dao;

import java.util.List;

import com.entity.ClassTable;

public interface ClassTableDao {

	public abstract void save(ClassTable transientInstance);

	public abstract void delete(ClassTable persistentInstance);

	public abstract ClassTable findById(java.lang.Integer id);

	public abstract List findByExample(ClassTable instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByClassName(Object className);

	public abstract List findByClassSchool(Object classSchool);

	public abstract List findByTeacherId(Object teacherId);

	public abstract List findAll();

	public abstract ClassTable merge(ClassTable detachedInstance);

	public abstract void attachDirty(ClassTable instance);

	public abstract void attachClean(ClassTable instance);

}