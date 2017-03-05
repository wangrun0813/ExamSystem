package com.dao.impl;

import com.dao.TestanswerTableDao;
import com.entity.TestanswerTable;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.stereotype.Repository;

/**
 * A data access object (DAO) providing persistence and search support for
 * TestanswerTable entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.entity.TestanswerTable
 * @author MyEclipse Persistence Tools
 */
@Repository
public class TestanswerTableDAOimpl extends BaseHibernateDAOimpl implements TestanswerTableDao {
	private static final Log log = LogFactory.getLog(TestanswerTableDAOimpl.class);
	// property constants
	public static final String STUDENT_CHOOSEANSWER = "studentChooseanswer";
	public static final String SUBJECT_GRADE = "subjectGrade";
	public static final String OBJECT_GRAGE = "objectGrage";
	public static final String GRADE = "grade";
	public static final String WRONG_NUMBER = "wrongNumber";
	public static final String STUDENT_BLANKANSWER = "studentBlankanswer";
	public static final String STUDENT_READINGANSWER = "studentReadinganswer";
	public static final String CORRECTPAPER = "correctpaper";

	/* (non-Javadoc)
	 * @see com.dao.impl.TestanswerTableDao#save(com.entity.TestanswerTable)
	 */
	@Override
	public void save(TestanswerTable transientInstance) {
		log.debug("saving TestanswerTable instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.TestanswerTableDao#delete(com.entity.TestanswerTable)
	 */
	@Override
	public void delete(TestanswerTable persistentInstance) {
		log.debug("deleting TestanswerTable instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.TestanswerTableDao#findById(java.lang.Integer)
	 */
	@Override
	public TestanswerTable findById(java.lang.Integer id) {
		log.debug("getting TestanswerTable instance with id: " + id);
		try {
			TestanswerTable instance = (TestanswerTable) getSession().get(
					"com.entity.TestanswerTable", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.TestanswerTableDao#findByExample(com.entity.TestanswerTable)
	 */
	@Override
	public List findByExample(TestanswerTable instance) {
		log.debug("finding TestanswerTable instance by example");
		try {
			List results = getSession()
					.createCriteria("com.entity.TestanswerTable")
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
	 * @see com.dao.impl.TestanswerTableDao#findByProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TestanswerTable instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TestanswerTable as model where model."
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
	 * @see com.dao.impl.TestanswerTableDao#findByStudentChooseanswer(java.lang.Object)
	 */
	@Override
	public List findByStudentChooseanswer(Object studentChooseanswer) {
		return findByProperty(STUDENT_CHOOSEANSWER, studentChooseanswer);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.TestanswerTableDao#findBySubjectGrade(java.lang.Object)
	 */
	@Override
	public List findBySubjectGrade(Object subjectGrade) {
		return findByProperty(SUBJECT_GRADE, subjectGrade);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.TestanswerTableDao#findByObjectGrage(java.lang.Object)
	 */
	@Override
	public List findByObjectGrage(Object objectGrage) {
		return findByProperty(OBJECT_GRAGE, objectGrage);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.TestanswerTableDao#findByGrade(java.lang.Object)
	 */
	@Override
	public List findByGrade(Object grade) {
		return findByProperty(GRADE, grade);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.TestanswerTableDao#findByWrongNumber(java.lang.Object)
	 */
	@Override
	public List findByWrongNumber(Object wrongNumber) {
		return findByProperty(WRONG_NUMBER, wrongNumber);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.TestanswerTableDao#findByStudentBlankanswer(java.lang.Object)
	 */
	@Override
	public List findByStudentBlankanswer(Object studentBlankanswer) {
		return findByProperty(STUDENT_BLANKANSWER, studentBlankanswer);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.TestanswerTableDao#findByStudentReadinganswer(java.lang.Object)
	 */
	@Override
	public List findByStudentReadinganswer(Object studentReadinganswer) {
		return findByProperty(STUDENT_READINGANSWER, studentReadinganswer);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.TestanswerTableDao#findByCorrectpaper(java.lang.Object)
	 */
	@Override
	public List findByCorrectpaper(Object correctpaper) {
		return findByProperty(CORRECTPAPER, correctpaper);
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.TestanswerTableDao#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all TestanswerTable instances");
		try {
			String queryString = "from TestanswerTable";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.TestanswerTableDao#merge(com.entity.TestanswerTable)
	 */
	@Override
	public TestanswerTable merge(TestanswerTable detachedInstance) {
		log.debug("merging TestanswerTable instance");
		try {
			TestanswerTable result = (TestanswerTable) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	
	
	@Override
	public List findBypaperid(String id){
		//QuestionTable questionTable=(QuestionTable)getSession().get();
		int id1=Integer.parseInt(id);
		String hql = "from TestanswerTable q where q.exampaperTable.exampaperId=?";
		Query TestanswerTable = getSession().createQuery(hql);
		TestanswerTable.setParameter(0, id1);
		return TestanswerTable.list();
		
	}
	
	@Override
	public List findBypaperidandClass(String id,String sclass){
		//QuestionTable questionTable=(QuestionTable)getSession().get();
		int id1=Integer.parseInt(id);
		int sclass1=Integer.parseInt(sclass);
		String hql = "from TestanswerTable q where q.exampaperTable.exampaperId=? and q.studentTable.className=?";
		Query TestanswerTable = getSession().createQuery(hql);
		TestanswerTable.setParameter(0, id1);
		TestanswerTable.setParameter(1, sclass1);
		return TestanswerTable.list();
		
	}
	/* (non-Javadoc)
	 * @see com.dao.impl.TestanswerTableDao#attachDirty(com.entity.TestanswerTable)
	 */
	@Override
	public void attachDirty(TestanswerTable instance) {
		log.debug("attaching dirty TestanswerTable instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.impl.TestanswerTableDao#attachClean(com.entity.TestanswerTable)
	 */
	@Override
	public void attachClean(TestanswerTable instance) {
		log.debug("attaching clean TestanswerTable instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
	
	
	@Override
	public void insertblankgrade(String grade,String id){
		int id1=Integer.parseInt(id);
		String hql="update TestanswerTable test set test.subjectGrade=? where test.testanswerId=?";
		Query  query= getSession().createQuery(hql);
		query.setParameter(0, grade);
		query.setParameter(1, id1);
	}
	
}