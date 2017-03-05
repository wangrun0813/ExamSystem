package com.dao.impl;

import com.dao.ClassTableDao;
import com.entity.ClassTable;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.stereotype.Repository;

/**
 * A data access object (DAO) providing persistence and search support for
 * ClassTable entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.entity.ClassTable
 * @author MyEclipse Persistence Tools
 */
@Repository
public class ClassTableDAOimpl extends BaseHibernateDAOimpl implements ClassTableDao {
	private static final Log log = LogFactory.getLog(ClassTableDAOimpl.class);
	// property constants
	public static final String CLASS_NAME = "className";
	public static final String CLASS_SCHOOL = "classSchool";
	public static final String TEACHER_ID = "teacherId";

	/* (non-Javadoc)
	 * @see com.dao.impl.ClassTableDao#save(com.entity.ClassTable)
	 */
	@Override
	public void save(ClassTable transientInstance) {
		log.debug("saving ClassTable instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ClassTableDao#delete(com.entity.ClassTable)
	 */
	@Override
	public void delete(ClassTable persistentInstance) {
		log.debug("deleting ClassTable instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ClassTableDao#findById(java.lang.Integer)
	 */
	@Override
	public ClassTable findById(java.lang.Integer id) {
		log.debug("getting ClassTable instance with id: " + id);
		try {
			ClassTable instance = (ClassTable) getSession().get(
					"com.entity.ClassTable", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ClassTableDao#findByExample(com.entity.ClassTable)
	 */
	@Override
	public List findByExample(ClassTable instance) {
		log.debug("finding ClassTable instance by example");
		try {
			List results = getSession().createCriteria("com.entity.ClassTable")
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
	 * @see com.dao.impl.ClassTableDao#findByProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding ClassTable instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from ClassTable as model where model."
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
	 * @see com.dao.impl.ClassTableDao#findByClassName(java.lang.Object)
	 */
	@Override
	public List findByClassName(Object className) {
		return findByProperty(CLASS_NAME, className);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ClassTableDao#findByClassSchool(java.lang.Object)
	 */
	@Override
	public List findByClassSchool(Object classSchool) {
		return findByProperty(CLASS_SCHOOL, classSchool);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ClassTableDao#findByTeacherId(java.lang.Object)
	 */
	@Override
	public List findByTeacherId(Object teacherId) {
		return findByProperty(TEACHER_ID, teacherId);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ClassTableDao#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all ClassTable instances");
		try {
			String queryString = "from ClassTable";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ClassTableDao#merge(com.entity.ClassTable)
	 */
	@Override
	public ClassTable merge(ClassTable detachedInstance) {
		log.debug("merging ClassTable instance");
		try {
			ClassTable result = (ClassTable) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ClassTableDao#attachDirty(com.entity.ClassTable)
	 */
	@Override
	public void attachDirty(ClassTable instance) {
		log.debug("attaching dirty ClassTable instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ClassTableDao#attachClean(com.entity.ClassTable)
	 */
	@Override
	public void attachClean(ClassTable instance) {
		log.debug("attaching clean ClassTable instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}