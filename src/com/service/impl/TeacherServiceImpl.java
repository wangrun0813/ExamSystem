package com.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.entity.ChaptertypeTable;
import com.entity.ClassTable;
import com.entity.ExampaperTable;
import com.entity.QuestionTable;
import com.entity.TeacherTable;
import com.entity.TestanswerTable;
import com.entity.UserTable;
import com.entity.ClassTable;
import com.service.TeacherService;
import com.dao.impl.QuestionTableDAOimpl;
import com.dao.impl.ClassTableDAOimpl;
@Service()
@Transactional
public class TeacherServiceImpl extends BasicService implements TeacherService{

	@Override
	public void insert_choose(QuestionTable questionTable) {
      questionTableDAO.save(questionTable);
		
	}

	@Override
	public void insert_reading(QuestionTable questionTable) {
		// TODO Auto-generated method stub
		questionTableDAO.save(questionTable);
	}

	@Override
	public void insert_blank(QuestionTable questionTable) {
		// TODO Auto-generated method stub
		questionTableDAO.save(questionTable);
	}
	@Override
	public void insert_textpaper(ExampaperTable exampaperTable){
		exampaperTableDao.save(exampaperTable);
	}
	@Override
	public String querybyquestion(String question){
		QuestionTable questionTable=(QuestionTable) questionTableDAO.findByQuestion(question).get(0);
		//questionTableDAO.findByQuestion(question);
		
		String id=questionTable.getExampaperNumber()+"";
		return id;
	}
	@Override
	public String querybyreadingtext(String readingtext){
		QuestionTable questionTable=(QuestionTable)questionTableDAO.findByReadingtext(readingtext).get(0);
		String timekey=questionTable.getTimekey();
		return timekey;
	}


	@Override
	public List<ClassTable> chooseClass(String teacherId) {
		// TODO Auto-generated method stub
		//questionTableDAO.findByTeacherId();
		List<ClassTable> classTables=(List<ClassTable>)classTableDao.findByTeacherId(teacherId);
		return classTables;
	}
	@Override
	public List<ExampaperTable> showtestpaper(){
		List<ExampaperTable> exampaperTables=(List<ExampaperTable>)exampaperTableDao.findAll();
		return exampaperTables;
	}
	
	//选择批改的试卷
	@Override
	  public List<TestanswerTable> selectPaper(){
		//  String correctpaper="未批改";
		 List<TestanswerTable> testanswerTable=(List<TestanswerTable>)testanswerTableDao.findAll();
		return testanswerTable;
		  
	  }
	@Override
	public List<ExampaperTable> selectchartpaper(){
		List<ExampaperTable> exampaperTable=(List<ExampaperTable>)exampaperTableDao.findAll();
		return exampaperTable;
	}
	@Override
	public List<ChaptertypeTable> choose_chapterName(String chaptertypeName){
		List<ChaptertypeTable> chapterName=(List<ChaptertypeTable>)chaptertypeTableDao.findByChaptertypeName(chaptertypeName);
		return chapterName;
	}

	@Override
	public void change_teacherinfo(TeacherTable teacherTable) {
		// TODO Auto-generated method stub
		teacherTableDao.updateTeacherAccount(teacherTable);
	}
	
	//查看图表
	@Override
		public List<TestanswerTable> lookpaper(String exampaperId){
		//	TestanswerTable testanswerTable=new TestanswerTable(id);
			List<TestanswerTable> testanswerTables=(List<TestanswerTable>)testanswerTableDao.findBypaperid(exampaperId);
	     
			return testanswerTables;
		}
	//选择批改或未批改
		@Override
		public List<TestanswerTable> showcorrectpaper(String correctpaper){
			List<TestanswerTable> tables=(List<TestanswerTable>)testanswerTableDao.findByCorrectpaper(correctpaper);
			return tables;
		}
	
	//查看图表
	@Override
			public List<TestanswerTable> lookpaperbyidandclass(String exampaperId,String className){
			//	TestanswerTable testanswerTable=new TestanswerTable(id);
				List<TestanswerTable> testanswerTables=(List<TestanswerTable>)testanswerTableDao.findBypaperidandClass(exampaperId, className);
		     
				return testanswerTables;
			}
	//chapterName：章节
	//chapterTypeName：题型
	@Override
	public List<QuestionTable> choose_list(String chapterName ,String chapterTypeName){
		List<QuestionTable> questionTable =(List<QuestionTable>)questionTableDAO.findBychapterNameAndchapterTypeName(chapterName,chapterTypeName);
		return questionTable;
	}
	@Override
	public ExampaperTable  scanchoosepaper(String exampaperId){
		int id=Integer.parseInt(exampaperId);
		ExampaperTable exampaperTable=exampaperTableDao.findById(id);
		return exampaperTable;
	}
	
	//预览试卷的选择题
	@Override
		public QuestionTable  scanchoose(String chooseNumb){
			int id=Integer.parseInt(chooseNumb);
			QuestionTable scanchoose=(QuestionTable)questionTableDAO.findById(id);
			return scanchoose;
		}
	
	
	//删除选择的试卷
	@Override
	 public void deletechoosepaper(String id){
		 exampaperTableDao.deletebyid(id);
	 }
	
	//删除题库中的选择题
	@Override
	public void deletechoose(String exampaperNumber){
		questionTableDAO.deletechoosebyid(exampaperNumber);
	}
	@Override
	public void insertblankgrade(String subjectGrade,String testanswerId){
		TestanswerTable table= testanswerTableDao.findById(Integer.parseInt(testanswerId));
		table.setSubjectGrade(subjectGrade);
		table.setCorrectpaper("已批改");
		testanswerTableDao.merge(table);
	}
	

}
