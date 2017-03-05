package com.dao;

import java.util.List;

import com.entity.TeacherTable;

public interface TeacherTableDao {

	public abstract void save(TeacherTable transientInstance);

	public abstract void delete(TeacherTable persistentInstance);
	
	public abstract void updateTeacherAccount(TeacherTable teacherTable);

	public abstract TeacherTable findById(java.lang.String id);

	public abstract List findByExample(TeacherTable instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByTeacherAccount(Object teacherAccount);

	public abstract List findByTeacherName(Object teacherName);

	public abstract List findByTeacherTele(Object teacherTele);

	public abstract List findByTeacherSchool(Object teacherSchool);

	public abstract List findAll();

	public abstract TeacherTable merge(TeacherTable detachedInstance);

	public abstract void attachDirty(TeacherTable instance);

	public abstract void attachClean(TeacherTable instance);

}