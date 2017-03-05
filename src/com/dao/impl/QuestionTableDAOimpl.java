package com.dao.impl;

import com.dao.QuestionTableDao;
import com.entity.QuestionTable;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.stereotype.Repository;

/**
 * A data access object (DAO) providing persistence and search support for
 * QuestionTable entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.entity.QuestionTable
 * @author MyEclipse Persistence Tools
 */
@Repository
public class QuestionTableDAOimpl extends BaseHibernateDAOimpl implements QuestionTableDao {
	private static final Log log = LogFactory.getLog(QuestionTableDAOimpl.class);
	// property constants
	public static final String CHAPTER_NAME = "chapterName";
	public static final String CHAPTER_TYPE_NAME = "chapterTypeName";
	public static final String QUESTION = "question";
	public static final String MYKEY = "mykey";
	public static final String ACHOOSE = "achoose";
	public static final String BCCHOOSE = "bcchoose";
	public static final String CCCHOOSE = "ccchoose";
	public static final String DCHOOSE = "dchoose";
	public static final String TRUEEXPLAIN = "trueexplain";
	public static final String TIMEKEY = "timekey";
	public static final String READINGTEXT = "readingtext";

	/* (non-Javadoc)
	 * @see com.dao.impl.QuestionTableDao#save(com.entity.QuestionTable)
	 */
	@Override
	public void save(QuestionTable transientInstance) {
		log.debug("saving QuestionTable instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}
	@Override
	public List findBychapterNameAndchapterTypeName(String chapterName ,String chapterTypeName){
		//QuestionTable questionTable=(QuestionTable)getSession().get();
		String hql = "from QuestionTable q where q.chapterName=? and q.chapterTypeName=?";
		Query questionTable = getSession().createQuery(hql);
		questionTable.setParameter(0, chapterName);
		questionTable.setParameter(1, chapterTypeName);
		return questionTable.list();
		
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.QuestionTableDao#delete(com.entity.QuestionTable)
	 */
	@Override
	public void delete(QuestionTable persistentInstance) {
		log.debug("deleting QuestionTable instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.QuestionTableDao#findById(java.lang.Integer)
	 */
	@Override
	public QuestionTable findById(java.lang.Integer id) {
		log.debug("getting QuestionTable instance with id: " + id);
		try {
			QuestionTable instance = (QuestionTable) getSession().get(
					"com.entity.QuestionTable", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.QuestionTableDao#findByExample(com.entity.QuestionTable)
	 */
	@Override
	public List findByExample(QuestionTable instance) {
		log.debug("finding QuestionTable instance by example");
		try {
			List results = getSession()
					.createCriteria("com.entity.QuestionTable")
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
	 * @see com.dao.impl.QuestionTableDao#findByProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding QuestionTable instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from QuestionTable as model where model."
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
	 * @see com.dao.impl.QuestionTableDao#findByChapterName(java.lang.Object)
	 */
	@Override
	public List findByChapterName(Object chapterName) {
		return findByProperty(CHAPTER_NAME, chapterName);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.QuestionTableDao#findByChapterTypeName(java.lang.Object)
	 */
	@Override
	public List findByChapterTypeName(Object chapterTypeName) {
		return findByProperty(CHAPTER_TYPE_NAME, chapterTypeName);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.QuestionTableDao#findByQuestion(java.lang.Object)
	 */
	@Override
	public List findByQuestion(Object question) {
		return findByProperty(QUESTION, question);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.QuestionTableDao#findByMykey(java.lang.Object)
	 */
	@Override
	public List findByMykey(Object mykey) {
		return findByProperty(MYKEY, mykey);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.QuestionTableDao#findByAchoose(java.lang.Object)
	 */
	@Override
	public List findByAchoose(Object achoose) {
		return findByProperty(ACHOOSE, achoose);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.QuestionTableDao#findByBcchoose(java.lang.Object)
	 */
	@Override
	public List findByBcchoose(Object bcchoose) {
		return findByProperty(BCCHOOSE, bcchoose);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.QuestionTableDao#findByCcchoose(java.lang.Object)
	 */
	@Override
	public List findByCcchoose(Object ccchoose) {
		return findByProperty(CCCHOOSE, ccchoose);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.QuestionTableDao#findByDchoose(java.lang.Object)
	 */
	@Override
	public List findByDchoose(Object dchoose) {
		return findByProperty(DCHOOSE, dchoose);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.QuestionTableDao#findByTrueexplain(java.lang.Object)
	 */
	@Override
	public List findByTrueexplain(Object trueexplain) {
		return findByProperty(TRUEEXPLAIN, trueexplain);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.QuestionTableDao#findByTimekey(java.lang.Object)
	 */
	@Override
	public List findByTimekey(Object timekey) {
		return findByProperty(TIMEKEY, timekey);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.QuestionTableDao#findByReadingtext(java.lang.Object)
	 */
	@Override
	public List findByReadingtext(Object readingtext) {
		return findByProperty(READINGTEXT, readingtext);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.QuestionTableDao#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all QuestionTable instances");
		try {
			String queryString = "from QuestionTable";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.QuestionTableDao#merge(com.entity.QuestionTable)
	 */
	@Override
	public QuestionTable merge(QuestionTable detachedInstance) {
		log.debug("merging QuestionTable instance");
		try {
			QuestionTable result = (QuestionTable) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.QuestionTableDao#attachDirty(com.entity.QuestionTable)
	 */
	@Override
	public void attachDirty(QuestionTable instance) {
		log.debug("attaching dirty QuestionTable instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.QuestionTableDao#attachClean(com.entity.QuestionTable)
	 */
	@Override
	public void attachClean(QuestionTable instance) {
		log.debug("attaching clean QuestionTable instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
	
	@Override
	public void deletechoosebyid(String id){
		    String stringid=id;
	      	int id2=Integer.parseInt( stringid.substring(0,stringid.length()-1));
			 this.getSession().delete(this.findById(id2));
	}
}