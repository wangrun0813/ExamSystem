package com.dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.dao.ChapteranswerTableDao;
import com.entity.ChapteranswerTable;

/**
 * A data access object (DAO) providing persistence and search support for
 * ChapteranswerTable entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.entity.ChapteranswerTable
 * @author MyEclipse Persistence Tools
 */
public class ChapteranswerTableDAOimpl extends BaseHibernateDAOimpl implements ChapteranswerTableDao {
	private static final Log log = LogFactory
			.getLog(ChapteranswerTableDAOimpl.class);
	// property constants
	public static final String STUDENT_ID = "studentId";
	public static final String CHAPTER_ID = "chapterId";
	public static final String STUDENT_ANSWER = "studentAnswer";
	public static final String SUBJECT_GRADE = "subjectGrade";
	public static final String OBJECT_GRAGE = "objectGrage";
	public static final String GRADE = "grade";
	public static final String WRONG_NUMBER = "wrongNumber";

	/* (non-Javadoc)
	 * @see com.dao.impl.ChapteranswerTableDao#save(com.entity.ChapteranswerTable)
	 */
	@Override
	public void save(ChapteranswerTable transientInstance) {
		log.debug("saving ChapteranswerTable instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ChapteranswerTableDao#delete(com.entity.ChapteranswerTable)
	 */
	@Override
	public void delete(ChapteranswerTable persistentInstance) {
		log.debug("deleting ChapteranswerTable instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ChapteranswerTableDao#findById(java.lang.Integer)
	 */
	@Override
	public ChapteranswerTable findById(java.lang.Integer id) {
		log.debug("getting ChapteranswerTable instance with id: " + id);
		try {
			ChapteranswerTable instance = (ChapteranswerTable) getSession()
					.get("com.entity.ChapteranswerTable", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ChapteranswerTableDao#findByExample(com.entity.ChapteranswerTable)
	 */
	@Override
	public List findByExample(ChapteranswerTable instance) {
		log.debug("finding ChapteranswerTable instance by example");
		try {
			List results = getSession()
					.createCriteria("com.entity.ChapteranswerTable")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ChapteranswerTableDao#findByProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding ChapteranswerTable instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from ChapteranswerTable as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ChapteranswerTableDao#findByStudentId(java.lang.Object)
	 */
	@Override
	public List findByStudentId(Object studentId) {
		return findByProperty(STUDENT_ID, studentId);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ChapteranswerTableDao#findByChapterId(java.lang.Object)
	 */
	@Override
	public List findByChapterId(Object chapterId) {
		return findByProperty(CHAPTER_ID, chapterId);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ChapteranswerTableDao#findByStudentAnswer(java.lang.Object)
	 */
	@Override
	public List findByStudentAnswer(Object studentAnswer) {
		return findByProperty(STUDENT_ANSWER, studentAnswer);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ChapteranswerTableDao#findBySubjectGrade(java.lang.Object)
	 */
	@Override
	public List findBySubjectGrade(Object subjectGrade) {
		return findByProperty(SUBJECT_GRADE, subjectGrade);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ChapteranswerTableDao#findByObjectGrage(java.lang.Object)
	 */
	@Override
	public List findByObjectGrage(Object objectGrage) {
		return findByProperty(OBJECT_GRAGE, objectGrage);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ChapteranswerTableDao#findByGrade(java.lang.Object)
	 */
	@Override
	public List findByGrade(Object grade) {
		return findByProperty(GRADE, grade);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ChapteranswerTableDao#findByWrongNumber(java.lang.Object)
	 */
	@Override
	public List findByWrongNumber(Object wrongNumber) {
		return findByProperty(WRONG_NUMBER, wrongNumber);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ChapteranswerTableDao#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all ChapteranswerTable instances");
		try {
			String queryString = "from ChapteranswerTable";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ChapteranswerTableDao#merge(com.entity.ChapteranswerTable)
	 */
	@Override
	public ChapteranswerTable merge(ChapteranswerTable detachedInstance) {
		log.debug("merging ChapteranswerTable instance");
		try {
			ChapteranswerTable result = (ChapteranswerTable) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ChapteranswerTableDao#attachDirty(com.entity.ChapteranswerTable)
	 */
	@Override
	public void attachDirty(ChapteranswerTable instance) {
		log.debug("attaching dirty ChapteranswerTable instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ChapteranswerTableDao#attachClean(com.entity.ChapteranswerTable)
	 */
	@Override
	public void attachClean(ChapteranswerTable instance) {
		log.debug("attaching clean ChapteranswerTable instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}