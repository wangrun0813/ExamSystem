package com.service;

import java.util.List;

import com.entity.ChaptertypeTable;
import com.entity.ClassTable;
import com.entity.ExampaperTable;
import com.entity.QuestionTable;
import com.entity.TeacherTable;
import com.entity.TestanswerTable;
import com.entity.UserTable;

public interface TeacherService {
	
	public void insert_choose(QuestionTable questionTable);
	
	public void insert_reading(QuestionTable questionTable);
	
	public void insert_blank(QuestionTable questionTable);
	
	public void change_teacherinfo(TeacherTable teacherTable) ;
	
	public List<ClassTable >chooseClass(String teacherId);

	public List<QuestionTable> choose_list(String chapterName, String chapterTypeName);

	public List<ChaptertypeTable> choose_chapterName(String chapterTypeName);

	public String querybyquestion(String readingtext);

	public String querybyreadingtext(String readingtext);

	public void insert_textpaper(ExampaperTable exampaperTable);

	public List<ExampaperTable> showtestpaper();

	public ExampaperTable scanchoosepaper(String exampaperId);

	public QuestionTable scanchoose(String chooseNumb);

	public void deletechoosepaper(String id);

	public void deletechoose(String exampaperNumber);

	public List<TestanswerTable> selectPaper();

	public void insertblankgrade(String subjectGrade, String testanswerId);

	public List<ExampaperTable> selectchartpaper();

	public List<TestanswerTable> lookpaper(String exampaperId);

	public List<TestanswerTable> lookpaperbyidandclass(String exampaperId,
			String className);

	public List<TestanswerTable> showcorrectpaper(String correctpaper);
    
	





}
