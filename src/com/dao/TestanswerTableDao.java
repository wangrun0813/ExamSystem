package com.dao;

import java.util.List;

import com.entity.TestanswerTable;

public interface TestanswerTableDao {

	public abstract void save(TestanswerTable transientInstance);

	public abstract void delete(TestanswerTable persistentInstance);

	public abstract TestanswerTable findById(java.lang.Integer id);

	public abstract List findByExample(TestanswerTable instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByStudentChooseanswer(Object studentChooseanswer);

	public abstract List findBySubjectGrade(Object subjectGrade);

	public abstract List findByObjectGrage(Object objectGrage);

	public abstract List findByGrade(Object grade);

	public abstract List findByWrongNumber(Object wrongNumber);

	public abstract List findByStudentBlankanswer(Object studentBlankanswer);

	public abstract List findByStudentReadinganswer(Object studentReadinganswer);

	public abstract List findByCorrectpaper(Object correctpaper);

	public abstract List findAll();

	public abstract TestanswerTable merge(TestanswerTable detachedInstance);

	public abstract void attachDirty(TestanswerTable instance);

	public abstract void attachClean(TestanswerTable instance);

	public void insertblankgrade(String grade, String id);

	public List findBypaperid(String id);

	public List findBypaperidandClass(String id, String sclass);


	

}