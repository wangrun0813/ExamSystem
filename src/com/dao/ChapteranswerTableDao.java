package com.dao;

import java.util.List;

import com.entity.ChapteranswerTable;

public interface ChapteranswerTableDao {

	public abstract void save(ChapteranswerTable transientInstance);

	public abstract void delete(ChapteranswerTable persistentInstance);

	public abstract ChapteranswerTable findById(java.lang.Integer id);

	public abstract List findByExample(ChapteranswerTable instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByStudentId(Object studentId);

	public abstract List findByChapterId(Object chapterId);

	public abstract List findByStudentAnswer(Object studentAnswer);

	public abstract List findBySubjectGrade(Object subjectGrade);

	public abstract List findByObjectGrage(Object objectGrage);

	public abstract List findByGrade(Object grade);

	public abstract List findByWrongNumber(Object wrongNumber);

	public abstract List findAll();

	public abstract ChapteranswerTable merge(ChapteranswerTable detachedInstance);

	public abstract void attachDirty(ChapteranswerTable instance);

	public abstract void attachClean(ChapteranswerTable instance);

}