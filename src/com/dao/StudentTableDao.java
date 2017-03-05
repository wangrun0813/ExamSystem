package com.dao;

import java.util.List;

import com.entity.StudentTable;

public interface StudentTableDao {

	public abstract void save(StudentTable transientInstance);

	public abstract void delete(StudentTable persistentInstance);

	public abstract StudentTable findById(java.lang.Integer id);

	public abstract List findByExample(StudentTable instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByStudentAccount(Object studentAccount);

	public abstract List findByStudentName(Object studentName);

	public abstract List findByStudentTele(Object studentTele);

	public abstract List findByExamLimit(Object examLimit);

	public abstract List findByClassName(Object className);

	public abstract List findByWrongNumber(Object wrongNumber);

	public abstract List findAll();

	public abstract StudentTable merge(StudentTable detachedInstance);

	public abstract void attachDirty(StudentTable instance);

	public abstract void attachClean(StudentTable instance);

}