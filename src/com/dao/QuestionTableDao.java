package com.dao;

import java.util.List;

import com.entity.QuestionTable;

public interface QuestionTableDao {

	public abstract void save(QuestionTable transientInstance);

	public abstract void delete(QuestionTable persistentInstance);

	public abstract QuestionTable findById(java.lang.Integer id);

	public abstract List findByExample(QuestionTable instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByChapterName(Object chapterName);

	public abstract List findByChapterTypeName(Object chapterTypeName);

	public abstract List findByQuestion(Object question);

	public abstract List findByMykey(Object mykey);

	public abstract List findByAchoose(Object achoose);

	public abstract List findByBcchoose(Object bcchoose);

	public abstract List findByCcchoose(Object ccchoose);

	public abstract List findByDchoose(Object dchoose);

	public abstract List findByTrueexplain(Object trueexplain);

	public abstract List findByTimekey(Object timekey);

	public abstract List findByReadingtext(Object readingtext);

	public abstract List findAll();

	public abstract QuestionTable merge(QuestionTable detachedInstance);

	public abstract void attachDirty(QuestionTable instance);

	public abstract void attachClean(QuestionTable instance);

	public List findBychapterNameAndchapterTypeName(String chapterName,
			String chapterTypeName);

	public void deletechoosebyid(String id);

}