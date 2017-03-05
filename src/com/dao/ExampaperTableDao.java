package com.dao;

import java.util.List;

import com.entity.ExampaperTable;

public interface ExampaperTableDao {

	public abstract void save(ExampaperTable transientInstance);

	public abstract void delete(ExampaperTable persistentInstance);

	public abstract ExampaperTable findById(java.lang.Integer id);

	public abstract List findByExample(ExampaperTable instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByExampaperName(Object exampaperName);

	public abstract List findByExampaperTime(Object exampaperTime);

	public abstract List findByFullgrade(Object fullgrade);

	public abstract List findByChooseNumb(Object chooseNumb);

	public abstract List findByPassgrade(Object passgrade);

	public abstract List findByChoosegrade(Object choosegrade);

	public abstract List findByBlankgrade(Object blankgrade);

	public abstract List findByReadinggrade(Object readinggrade);

	public abstract List findByJoinclass(Object joinclass);

	public abstract List findByBlankNumb(Object blankNumb);

	public abstract List findByReadingNumb(Object readingNumb);

	public abstract List findAll();

	public abstract ExampaperTable merge(ExampaperTable detachedInstance);

	public abstract void attachDirty(ExampaperTable instance);

	public abstract void attachClean(ExampaperTable instance);

	public void deletebyid(String id);

}