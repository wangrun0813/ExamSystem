package com.dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.dao.AdminTableDao;
import com.entity.AdminTable;

/**
 * A data access object (DAO) providing persistence and search support for
 * AdminTable entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.entity.AdminTable
 * @author MyEclipse Persistence Tools
 */
public class AdminTableDAOimpl extends BaseHibernateDAOimpl implements AdminTableDao {
	private static final Log log = LogFactory.getLog(AdminTableDAOimpl.class);
	public static final String ADMIN_NAME = "adminName";
	public static final String ADMIN_TEL = "adminTel";

	/* (non-Javadoc)
	 * @see com.dao.impl.AdminTableDao#save(com.entity.AdminTable)
	 */
	@Override
	public void save(AdminTable transientInstance) {
		log.debug("saving AdminTable instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.AdminTableDao#delete(com.entity.AdminTable)
	 */
	@Override
	public void delete(AdminTable persistentInstance) {
		log.debug("deleting AdminTable instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.AdminTableDao#findById(java.lang.Integer)
	 */
	@Override
	public AdminTable findById(java.lang.Integer id) {
		log.debug("getting AdminTable instance with id: " + id);
		try {
			AdminTable instance = (AdminTable) getSession().get(
					"com.entity.AdminTable", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.AdminTableDao#findByExample(com.entity.AdminTable)
	 */
	@Override
	public List findByExample(AdminTable instance) {
		log.debug("finding AdminTable instance by example");
		try {
			List results = getSession().createCriteria("com.entity.AdminTable")
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
	 * @see com.dao.impl.AdminTableDao#findByProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding AdminTable instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AdminTable as model where model."
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
	 * @see com.dao.impl.AdminTableDao#findByAdminAccount(java.lang.Object)
	 */
	@Override
	public List findByAdminAccount(Object adminAccount) {
		return findByProperty(ADMIN_ACCOUNT, adminAccount);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.AdminTableDao#findByAdminName(java.lang.Object)
	 */
	@Override
	public List findByAdminName(Object adminName) {
		return findByProperty(ADMIN_NAME, adminName);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.AdminTableDao#findByAdminTel(java.lang.Object)
	 */
	@Override
	public List findByAdminTel(Object adminTel) {
		return findByProperty(ADMIN_TEL, adminTel);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.AdminTableDao#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all AdminTable instances");
		try {
			String queryString = "from AdminTable";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.AdminTableDao#merge(com.entity.AdminTable)
	 */
	@Override
	public AdminTable merge(AdminTable detachedInstance) {
		log.debug("merging AdminTable instance");
		try {
			AdminTable result = (AdminTable) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.AdminTableDao#attachDirty(com.entity.AdminTable)
	 */
	@Override
	public void attachDirty(AdminTable instance) {
		log.debug("attaching dirty AdminTable instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.AdminTableDao#attachClean(com.entity.AdminTable)
	 */
	@Override
	public void attachClean(AdminTable instance) {
		log.debug("attaching clean AdminTable instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}