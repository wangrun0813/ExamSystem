package com.dao.impl;

import com.dao.ChaptertypeTableDao;
import com.entity.ChaptertypeTable;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.stereotype.Repository;

/**
 * A data access object (DAO) providing persistence and search support for
 * ChaptertypeTable entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.entity.ChaptertypeTable
 * @author MyEclipse Persistence Tools
 */
@Repository
public class ChaptertypeTableDAOimpl extends BaseHibernateDAOimpl implements ChaptertypeTableDao {
	private static final Log log = LogFactory.getLog(ChaptertypeTableDAOimpl.class);
	// property constants
	public static final String CHAPTERTYPE_NAME = "chaptertypeName";
	public static final String CHAPTERTYPE_GRADE = "chaptertypeGrade";
	public static final String CHAPTER_NAME = "chapterName";

	/* (non-Javadoc)
	 * @see com.dao.impl.ChaptertypeTableDao#save(com.entity.ChaptertypeTable)
	 */
	@Override
	public void save(ChaptertypeTable transientInstance) {
		log.debug("saving ChaptertypeTable instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ChaptertypeTableDao#delete(com.entity.ChaptertypeTable)
	 */
	@Override
	public void delete(ChaptertypeTable persistentInstance) {
		log.debug("deleting ChaptertypeTable instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ChaptertypeTableDao#findById(java.lang.Integer)
	 */
	@Override
	public ChaptertypeTable findById(java.lang.Integer id) {
		log.debug("getting ChaptertypeTable instance with id: " + id);
		try {
			ChaptertypeTable instance = (ChaptertypeTable) getSession().get(
					"com.entity.ChaptertypeTable", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ChaptertypeTableDao#findByExample(com.entity.ChaptertypeTable)
	 */
	@Override
	public List findByExample(ChaptertypeTable instance) {
		log.debug("finding ChaptertypeTable instance by example");
		try {
			List results = getSession()
					.createCriteria("com.entity.ChaptertypeTable")
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
	 * @see com.dao.impl.ChaptertypeTableDao#findByProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding ChaptertypeTable instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from ChaptertypeTable as model where model."
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
	 * @see com.dao.impl.ChaptertypeTableDao#findByChaptertypeName(java.lang.Object)
	 */
	@Override
	public List findByChaptertypeName(Object chaptertypeName) {
		return findByProperty(CHAPTERTYPE_NAME, chaptertypeName);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ChaptertypeTableDao#findByChaptertypeGrade(java.lang.Object)
	 */
	@Override
	public List findByChaptertypeGrade(Object chaptertypeGrade) {
		return findByProperty(CHAPTERTYPE_GRADE, chaptertypeGrade);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ChaptertypeTableDao#findByChapterName(java.lang.Object)
	 */
	@Override
	public List findByChapterName(Object chapterName) {
		return findByProperty(CHAPTER_NAME, chapterName);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ChaptertypeTableDao#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all ChaptertypeTable instances");
		try {
			String queryString = "from ChaptertypeTable";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ChaptertypeTableDao#merge(com.entity.ChaptertypeTable)
	 */
	@Override
	public ChaptertypeTable merge(ChaptertypeTable detachedInstance) {
		log.debug("merging ChaptertypeTable instance");
		try {
			ChaptertypeTable result = (ChaptertypeTable) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ChaptertypeTableDao#attachDirty(com.entity.ChaptertypeTable)
	 */
	@Override
	public void attachDirty(ChaptertypeTable instance) {
		log.debug("attaching dirty ChaptertypeTable instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ChaptertypeTableDao#attachClean(com.entity.ChaptertypeTable)
	 */
	@Override
	public void attachClean(ChaptertypeTable instance) {
		log.debug("attaching clean ChaptertypeTable instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}