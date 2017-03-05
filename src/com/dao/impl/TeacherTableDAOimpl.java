package com.dao.impl;

import com.dao.TeacherTableDao;
import com.entity.TeacherTable;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.stereotype.Repository;

/**
 * A data access object (DAO) providing persistence and search support for
 * TeacherTable entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.entity.TeacherTable
 * @author MyEclipse Persistence Tools
 */
@Repository
public class TeacherTableDAOimpl extends BaseHibernateDAOimpl implements TeacherTableDao {
	private static final Log log = LogFactory.getLog(TeacherTableDAOimpl.class);
	// property constants
	public static final String TEACHER_ACCOUNT = "teacherAccount";
	public static final String TEACHER_NAME = "teacherName";
	public static final String TEACHER_TELE = "teacherTele";
	public static final String TEACHER_SCHOOL = "teacherSchool";

	/* (non-Javadoc)
	 * @see com.dao.impl.TeacherTableDao#save(com.entity.TeacherTable)
	 */
	@Override
	public void save(TeacherTable transientInstance) {
		log.debug("saving TeacherTable instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.TeacherTableDao#delete(com.entity.TeacherTable)
	 */
	@Override
	public void delete(TeacherTable persistentInstance) {
		log.debug("deleting TeacherTable instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.TeacherTableDao#findById(java.lang.String)
	 */
	@Override
	public TeacherTable findById(java.lang.String id) {
		log.debug("getting TeacherTable instance with id: " + id);
		try {
			TeacherTable instance = (TeacherTable) getSession().get(
					"com.entity.TeacherTable", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.TeacherTableDao#findByExample(com.entity.TeacherTable)
	 */
	@Override
	public List findByExample(TeacherTable instance) {
		log.debug("finding TeacherTable instance by example");
		try {
			List results = getSession()
					.createCriteria("com.entity.TeacherTable")
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
	 * @see com.dao.impl.TeacherTableDao#findByProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TeacherTable instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TeacherTable as model where model."
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
	 * @see com.dao.impl.TeacherTableDao#findByTeacherAccount(java.lang.Object)
	 */
	@Override
	public List findByTeacherAccount(Object teacherAccount) {
		return findByProperty(TEACHER_ACCOUNT, teacherAccount);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.TeacherTableDao#findByTeacherName(java.lang.Object)
	 */
	@Override
	public List findByTeacherName(Object teacherName) {
		return findByProperty(TEACHER_NAME, teacherName);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.TeacherTableDao#findByTeacherTele(java.lang.Object)
	 */
	@Override
	public List findByTeacherTele(Object teacherTele) {
		return findByProperty(TEACHER_TELE, teacherTele);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.TeacherTableDao#findByTeacherSchool(java.lang.Object)
	 */
	@Override
	public List findByTeacherSchool(Object teacherSchool) {
		return findByProperty(TEACHER_SCHOOL, teacherSchool);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.TeacherTableDao#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all TeacherTable instances");
		try {
			String queryString = "from TeacherTable";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.TeacherTableDao#merge(com.entity.TeacherTable)
	 */
	@Override
	public TeacherTable merge(TeacherTable detachedInstance) {
		log.debug("merging TeacherTable instance");
		try {
			TeacherTable result = (TeacherTable) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.TeacherTableDao#attachDirty(com.entity.TeacherTable)
	 */
	@Override
	public void attachDirty(TeacherTable instance) {
		log.debug("attaching dirty TeacherTable instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.TeacherTableDao#attachClean(com.entity.TeacherTable)
	 */
	@Override
	public void attachClean(TeacherTable instance) {
		log.debug("attaching clean TeacherTable instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	@Override
	public void updateTeacherAccount(TeacherTable teacherTable) {
		// TODO Auto-generated method stub
		if(teacherTable!=null){
			getSession().update(teacherTable);
		}
	}
}