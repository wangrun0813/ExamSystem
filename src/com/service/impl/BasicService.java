package com.service.impl;

import javax.annotation.Resource;

import com.dao.ChaptertypeTableDao;
import com.dao.ClassTableDao;
import com.dao.ExampaperTableDao;
import com.dao.QuestionTableDao;
import com.dao.TeacherTableDao;
import com.dao.TestanswerTableDao;
import com.dao.UserTableDao;
import com.entity.ExampaperTable;


public class BasicService {
	@Resource
	protected UserTableDao userTableDAO;
	@Resource
	protected QuestionTableDao questionTableDAO;
	@Resource
	protected TeacherTableDao teacherTableDao;
	@Resource
	protected ClassTableDao classTableDao;
	@Resource
	protected ChaptertypeTableDao chaptertypeTableDao;
	@Resource
	protected ExampaperTableDao exampaperTableDao;
	@Resource
	protected TestanswerTableDao testanswerTableDao;
}
