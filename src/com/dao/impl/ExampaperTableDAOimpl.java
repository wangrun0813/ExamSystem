package com.dao.impl;

import com.dao.ExampaperTableDao;
import com.entity.ExampaperTable;

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
 * ExampaperTable entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.entity.ExampaperTable
 * @author MyEclipse Persistence Tools
 */
@Repository
public class ExampaperTableDAOimpl extends BaseHibernateDAOimpl implements ExampaperTableDao {
	private static final Log log = LogFactory.getLog(ExampaperTableDAOimpl.class);
	// property constants
	public static final String EXAMPAPER_NAME = "exampaperName";
	public static final String EXAMPAPER_TIME = "exampaperTime";
	public static final String FULLGRADE = "fullgrade";
	public static final String CHOOSE_NUMB = "chooseNumb";
	public static final String PASSGRADE = "passgrade";
	public static final String CHOOSEGRADE = "choosegrade";
	public static final String BLANKGRADE = "blankgrade";
	public static final String READINGGRADE = "readinggrade";
	public static final String JOINCLASS = "joinclass";
	public static final String BLANK_NUMB = "blankNumb";
	public static final String READING_NUMB = "readingNumb";

	/* (non-Javadoc)
	 * @see com.dao.impl.ExampaperTableDao#save(com.entity.ExampaperTable)
	 */
	@Override
	public void save(ExampaperTable transientInstance) {
		log.debug("saving ExampaperTable instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ExampaperTableDao#delete(com.entity.ExampaperTable)
	 */
	@Override
	public void delete(ExampaperTable persistentInstance) {
		log.debug("deleting ExampaperTable instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ExampaperTableDao#findById(java.lang.Integer)
	 */
	@Override
	public ExampaperTable findById(java.lang.Integer id) {
		log.debug("getting ExampaperTable instance with id: " + id);
		try {
			ExampaperTable instance = (ExampaperTable) getSession().get(
					"com.entity.ExampaperTable", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ExampaperTableDao#findByExample(com.entity.ExampaperTable)
	 */
	@Override
	public List findByExample(ExampaperTable instance) {
		log.debug("finding ExampaperTable instance by example");
		try {
			List results = getSession()
					.createCriteria("com.entity.ExampaperTable")
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
	 * @see com.dao.impl.ExampaperTableDao#findByProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding ExampaperTable instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from ExampaperTable as model where model."
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
	 * @see com.dao.impl.ExampaperTableDao#findByExampaperName(java.lang.Object)
	 */
	@Override
	public List findByExampaperName(Object exampaperName) {
		return findByProperty(EXAMPAPER_NAME, exampaperName);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ExampaperTableDao#findByExampaperTime(java.lang.Object)
	 */
	@Override
	public List findByExampaperTime(Object exampaperTime) {
		return findByProperty(EXAMPAPER_TIME, exampaperTime);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ExampaperTableDao#findByFullgrade(java.lang.Object)
	 */
	@Override
	public List findByFullgrade(Object fullgrade) {
		return findByProperty(FULLGRADE, fullgrade);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ExampaperTableDao#findByChooseNumb(java.lang.Object)
	 */
	@Override
	public List findByChooseNumb(Object chooseNumb) {
		return findByProperty(CHOOSE_NUMB, chooseNumb);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ExampaperTableDao#findByPassgrade(java.lang.Object)
	 */
	@Override
	public List findByPassgrade(Object passgrade) {
		return findByProperty(PASSGRADE, passgrade);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ExampaperTableDao#findByChoosegrade(java.lang.Object)
	 */
	@Override
	public List findByChoosegrade(Object choosegrade) {
		return findByProperty(CHOOSEGRADE, choosegrade);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ExampaperTableDao#findByBlankgrade(java.lang.Object)
	 */
	@Override
	public List findByBlankgrade(Object blankgrade) {
		return findByProperty(BLANKGRADE, blankgrade);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ExampaperTableDao#findByReadinggrade(java.lang.Object)
	 */
	@Override
	public List findByReadinggrade(Object readinggrade) {
		return findByProperty(READINGGRADE, readinggrade);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ExampaperTableDao#findByJoinclass(java.lang.Object)
	 */
	@Override
	public List findByJoinclass(Object joinclass) {
		return findByProperty(JOINCLASS, joinclass);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ExampaperTableDao#findByBlankNumb(java.lang.Object)
	 */
	@Override
	public List findByBlankNumb(Object blankNumb) {
		return findByProperty(BLANK_NUMB, blankNumb);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ExampaperTableDao#findByReadingNumb(java.lang.Object)
	 */
	@Override
	public List findByReadingNumb(Object readingNumb) {
		return findByProperty(READING_NUMB, readingNumb);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ExampaperTableDao#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all ExampaperTable instances");
		try {
			String queryString = "from ExampaperTable";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ExampaperTableDao#merge(com.entity.ExampaperTable)
	 */
	@Override
	public ExampaperTable merge(ExampaperTable detachedInstance) {
		log.debug("merging ExampaperTable instance");
		try {
			ExampaperTable result = (ExampaperTable) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ExampaperTableDao#attachDirty(com.entity.ExampaperTable)
	 */
	@Override
	public void attachDirty(ExampaperTable instance) {
		log.debug("attaching dirty ExampaperTable instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.ExampaperTableDao#attachClean(com.entity.ExampaperTable)
	 */
	@Override
	public void attachClean(ExampaperTable instance) {
		log.debug("attaching clean ExampaperTable instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
	
	
	//通过id删除试卷
	@Override
	public void deletebyid(String id){
		int id2=Integer.parseInt(id);
	  this.getSession().delete(this.findById(id2));
	}

}