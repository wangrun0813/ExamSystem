package com.dao;

import java.util.List;

import com.entity.ChaptertypeTable;

public interface ChaptertypeTableDao {

	public abstract void save(ChaptertypeTable transientInstance);

	public abstract void delete(ChaptertypeTable persistentInstance);

	public abstract ChaptertypeTable findById(java.lang.Integer id);

	public abstract List findByExample(ChaptertypeTable instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByChaptertypeName(Object chaptertypeName);

	public abstract List findByChaptertypeGrade(Object chaptertypeGrade);

	public abstract List findByChapterName(Object chapterName);

	public abstract List findAll();

	public abstract ChaptertypeTable merge(ChaptertypeTable detachedInstance);

	public abstract void attachDirty(ChaptertypeTable instance);

	public abstract void attachClean(ChaptertypeTable instance);

}