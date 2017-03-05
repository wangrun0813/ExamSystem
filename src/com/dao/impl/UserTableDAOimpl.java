package com.dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.stereotype.Service;

import com.dao.UserTableDao;
import com.entity.UserTable;

/**
 * A data access object (DAO) providing persistence and search support for
 * UserTable entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.entity.UserTable
 * @author MyEclipse Persistence Tools
 */
@Service("userTableDAO")
public class UserTableDAOimpl extends BaseHibernateDAOimpl implements UserTableDao {
	private static final Log log = LogFactory.getLog(UserTableDAOimpl.class);
	// property constants
	public static final String PASSWORD = "password";
	public static final String TYPE = "type";

	/* (non-Javadoc)
	 * @see com.dao.impl.UserTableDao#save(com.entity.UserTable)
	 */
	@Override
	public void save(UserTable transientInstance) {
		log.debug("saving UserTable instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.UserTableDao#delete(com.entity.UserTable)
	 */
	@Override
	public void delete(UserTable persistentInstance) {
		log.debug("deleting UserTable instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.UserTableDao#findById(java.lang.String)
	 */
	@Override
	public UserTable findById(java.lang.String id) {
		log.debug("getting UserTable instance with id: " + id);
		try {
			UserTable instance = (UserTable) getSession().get(
					"com.entity.UserTable", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.UserTableDao#findByExample(com.entity.UserTable)
	 */
	@Override
	public List findByExample(UserTable instance) {
		log.debug("finding UserTable instance by example");
		try {
			List results = getSession().createCriteria("com.entity.UserTable")
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
	 * @see com.dao.impl.UserTableDao#findByProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding UserTable instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from UserTable as model where model."
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
	 * @see com.dao.impl.UserTableDao#findByPassword(java.lang.Object)
	 */
	@Override
	public List findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.UserTableDao#findByType(java.lang.Object)
	 */
	@Override
	public List findByType(Object type) {
		return findByProperty(TYPE, type);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.UserTableDao#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all UserTable instances");
		try {
			String queryString = "from UserTable";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.UserTableDao#merge(com.entity.UserTable)
	 */
	@Override
	public UserTable merge(UserTable detachedInstance) {
		log.debug("merging UserTable instance");
		try {
			UserTable result = (UserTable) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.UserTableDao#attachDirty(com.entity.UserTable)
	 */
	@Override
	public void attachDirty(UserTable instance) {
		log.debug("attaching dirty UserTable instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.UserTableDao#attachClean(com.entity.UserTable)
	 */
	@Override
	public void attachClean(UserTable instance) {
		log.debug("attaching clean UserTable instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	@Override
	public void updatePswd(UserTable userTable) {
		// TODO Auto-generated method stub
		getSession().update(userTable);
	}
}