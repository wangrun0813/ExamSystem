package com.dao.impl;

import com.dao.StudentTableDao;
import com.entity.StudentTable;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.stereotype.Repository;

/**
 * A data access object (DAO) providing persistence and search support for
 * StudentTable entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.entity.StudentTable
 * @author MyEclipse Persistence Tools
 */
@Repository
public class StudentTableDAOimpl extends BaseHibernateDAOimpl implements StudentTableDao {
	private static final Log log = LogFactory.getLog(StudentTableDAOimpl.class);
	// property constants
	public static final String STUDENT_ACCOUNT = "studentAccount";
	public static final String STUDENT_NAME = "studentName";
	public static final String STUDENT_TELE = "studentTele";
	public static final String EXAM_LIMIT = "examLimit";
	public static final String CLASS_NAME = "className";
	public static final String WRONG_NUMBER = "wrongNumber";

	/* (non-Javadoc)
	 * @see com.dao.impl.StudentTableDao#save(com.entity.StudentTable)
	 */
	@Override
	public void save(StudentTable transientInstance) {
		log.debug("saving StudentTable instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.StudentTableDao#delete(com.entity.StudentTable)
	 */
	@Override
	public void delete(StudentTable persistentInstance) {
		log.debug("deleting StudentTable instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.StudentTableDao#findById(java.lang.Integer)
	 */
	@Override
	public StudentTable findById(java.lang.Integer id) {
		log.debug("getting StudentTable instance with id: " + id);
		try {
			StudentTable instance = (StudentTable) getSession().get(
					"com.entity.StudentTable", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.StudentTableDao#findByExample(com.entity.StudentTable)
	 */
	@Override
	public List findByExample(StudentTable instance) {
		log.debug("finding StudentTable instance by example");
		try {
			List results = getSession()
					.createCriteria("com.entity.StudentTable")
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
	 * @see com.dao.impl.StudentTableDao#findByProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding StudentTable instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from StudentTable as model where model."
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
	 * @see com.dao.impl.StudentTableDao#findByStudentAccount(java.lang.Object)
	 */
	@Override
	public List findByStudentAccount(Object studentAccount) {
		return findByProperty(STUDENT_ACCOUNT, studentAccount);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.StudentTableDao#findByStudentName(java.lang.Object)
	 */
	@Override
	public List findByStudentName(Object studentName) {
		return findByProperty(STUDENT_NAME, studentName);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.StudentTableDao#findByStudentTele(java.lang.Object)
	 */
	@Override
	public List findByStudentTele(Object studentTele) {
		return findByProperty(STUDENT_TELE, studentTele);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.StudentTableDao#findByExamLimit(java.lang.Object)
	 */
	@Override
	public List findByExamLimit(Object examLimit) {
		return findByProperty(EXAM_LIMIT, examLimit);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.StudentTableDao#findByClassName(java.lang.Object)
	 */
	@Override
	public List findByClassName(Object className) {
		return findByProperty(CLASS_NAME, className);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.StudentTableDao#findByWrongNumber(java.lang.Object)
	 */
	@Override
	public List findByWrongNumber(Object wrongNumber) {
		return findByProperty(WRONG_NUMBER, wrongNumber);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.StudentTableDao#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all StudentTable instances");
		try {
			String queryString = "from StudentTable";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.StudentTableDao#merge(com.entity.StudentTable)
	 */
	@Override
	public StudentTable merge(StudentTable detachedInstance) {
		log.debug("merging StudentTable instance");
		try {
			StudentTable result = (StudentTable) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.StudentTableDao#attachDirty(com.entity.StudentTable)
	 */
	@Override
	public void attachDirty(StudentTable instance) {
		log.debug("attaching dirty StudentTable instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.StudentTableDao#attachClean(com.entity.StudentTable)
	 */
	@Override
	public void attachClean(StudentTable instance) {
		log.debug("attaching clean StudentTable instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}