package com.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.ChaptertypeTable;
import com.entity.ExampaperTable;
import com.entity.QuestionTable;
import com.entity.TeacherTable;
import com.entity.UserTable;
import com.sun.org.apache.bcel.internal.generic.NEW;

@Controller
@RequestMapping(value = "/teacher", produces = { "application/json;charset=UTF-8" })
public class TeacherController extends BaisController {

	List list = new ArrayList();
	@Autowired
	private HttpServletRequest request;
	@RequestMapping(value = "/choose", method = RequestMethod.POST)
	public String add_choose(ModelMap map,
			@ModelAttribute QuestionTable questionTable) {
		teacherServiceImpl.insert_choose(questionTable);
		return "form-common";
	}

	@RequestMapping(value = "/reading", method = RequestMethod.POST)
	public String add_reading(ModelMap map, String chapterName,
			String chapterTypeName, String[] question, String[] achoose,
			String[] bcchoose, String[] ccchoose, String[] dchoose,
			String[] trueexplain, String readingtext) {
		
		String timekey1="";
		for (int i = 0; i < question.length; i++) {
			String question1 = question[i];
			String achoose1 = achoose[i];
			String bcchoose1 = bcchoose[i];
			String ccchoose1 = ccchoose[i];
			String dchoose1 = dchoose[i];
			String mykey1 = request.getParameter("mykey" + i);
			String trueexplain1 = trueexplain[i];
			QuestionTable questionTable = new QuestionTable(question1,
					achoose1, bcchoose1, ccchoose1, dchoose1, mykey1,trueexplain1);
			teacherServiceImpl.insert_reading(questionTable);
			String exampaperNumber = teacherServiceImpl.querybyquestion(question1);
			list.add(exampaperNumber);
		}
		for (int i = 0; i < list.size(); i++) {
			timekey1 += list.get(i) + ",";		
		}
		
		int endIndex=timekey1.length()-1;
		String timekey=timekey1.substring(0, endIndex);
		System.out.println(timekey);
		QuestionTable questionTable2 = new QuestionTable(chapterName,
				chapterTypeName, readingtext, timekey);
		teacherServiceImpl.insert_reading(questionTable2);
		list.clear();
		return "form-common-reading";
	}
    //查看图表lookchart
	@RequestMapping(value = "/lookchart", method = RequestMethod.GET)
	public String lookchart(ModelMap map,String exampaperId,String joinclass,String passgrade,String fullgrade){
		
		teacherServiceImpl.lookpaper(exampaperId);
	    int  gradenumber=0;
		//试卷平均分
		for (int i = 0; i < teacherServiceImpl.lookpaper(exampaperId).size(); i++) {
			gradenumber+=Integer.parseInt(teacherServiceImpl.lookpaper(exampaperId).get(i).getGrade());
		}
		map.addAttribute("averagegrade", gradenumber/teacherServiceImpl.lookpaper(exampaperId).size());
		//算出每个班级平均分
		String[] allclass=joinclass.split(",");
		List allclassgradelist=new ArrayList();
		
		List alljoinclass=new ArrayList();
		for (int i = 0; i < allclass.length; i++) {
			int classgrade=0;
			for (int j = 0; j <teacherServiceImpl.lookpaperbyidandclass(exampaperId, allclass[i]).size(); j++) {
				
				classgrade+=Integer.parseInt(teacherServiceImpl.lookpaperbyidandclass(exampaperId, allclass[i]).get(j).getGrade());
			}
			//班级
			alljoinclass.add(allclass[i]);
			int averageclassgrade=classgrade/teacherServiceImpl.lookpaperbyidandclass(exampaperId, allclass[i]).size();
			String laststring=averageclassgrade+","+allclass[i];
			System.out.println("classgrade成绩"+laststring);
			allclassgradelist.add(laststring);
		}
		map.addAttribute("listclassname", alljoinclass);
		map.addAttribute("alllist",allclassgradelist);
	
		return "pillar1";
		
	}
	//各班级成绩情况
	@RequestMapping(value = "/eachclass", method = RequestMethod.GET)
	public String eachclasschart(ModelMap map,String classname,String fullgrade,String exampaperId){
		        //100.0
				String[] arrStrings= fullgrade.split("\\.");
				//计算出总分
				int fullgrade1=Integer.parseInt(arrStrings[0]);
				//饼状图，计算每个班级及格人数
					int unpass=0;//不及格
					int nepass=0;//中
					int liang=0;//良
					int good=0;//优秀
					for (int j = 0; j <teacherServiceImpl.lookpaperbyidandclass(exampaperId, classname).size(); j++) {
						
						if (Integer.parseInt(teacherServiceImpl.lookpaperbyidandclass(exampaperId, classname).get(j).getGrade())<60) {
							unpass++;
						}
						if (Integer.parseInt(teacherServiceImpl.lookpaperbyidandclass(exampaperId,classname).get(j).getGrade())<fullgrade1*0.7) {
							nepass++;
					
						}
						if (Integer.parseInt(teacherServiceImpl.lookpaperbyidandclass(exampaperId, classname).get(j).getGrade())<fullgrade1*0.8) {
							liang++;
			
						}
						else {
							good++;
						}
						
					}
					String binganxi=unpass+","+nepass+","+liang+","+good+","+classname;
				//	System.out.println("*********binganxi********"+binganxi);
				//	allbinganxi.add(binganxi);
					map.addAttribute("allbinganx", binganxi);
					return "pillar2";
			
	}

	@RequestMapping(value = "/blank", method = RequestMethod.POST)
	public String add_blank(ModelMap map,
			@ModelAttribute QuestionTable questionTable) {
		teacherServiceImpl.insert_blank(questionTable);
		return "form-common-blank";
	}

	@RequestMapping(value = "/change", method = RequestMethod.POST)
	public String change_information(ModelMap map,
			@ModelAttribute TeacherTable teacherTable,
			@ModelAttribute UserTable userTable) {
		teacherServiceImpl.change_teacherinfo(teacherTable);
		userServiceImpl.change_password(userTable);
		// return "redirect:../user/login";
		return "login";
	}

	@RequestMapping(value = "/chapter", method = RequestMethod.POST)
	public @ResponseBody
	String change_chapter(ModelMap map, String chapterTypeName) {
		JSONArray chapterList = JSONArray.fromObject(teacherServiceImpl
				.choose_chapterName(chapterTypeName));
		return chapterList.toString();
	}
	
	@RequestMapping(value = "/question", method = RequestMethod.POST)
	public @ResponseBody
	String choose_question(ModelMap map, String chapterTypeName,
			String chapterName) {
		JSONArray questionList = JSONArray.fromObject(teacherServiceImpl
				.choose_list(chapterName, chapterTypeName));
		return questionList.toString();

	}
	
	@RequestMapping(value = "/change_paperselect", method = RequestMethod.POST)
	public @ResponseBody
	String change_paperselect(ModelMap map, String correctpaper) {
		JSONArray paperlist = JSONArray.fromObject(teacherServiceImpl.showcorrectpaper(correctpaper));
		return paperlist.toString();
	}

	
	@RequestMapping(value = "/choosepaper", method = RequestMethod.GET)
	public  String showpaper(ModelMap map,String exampaperId){
		ExampaperTable exampaperTable= teacherServiceImpl.scanchoosepaper(exampaperId);	
		//查找选择题
		String choosestr=exampaperTable.getChooseNumb();
		String[] choosearray=choosestr.split(",");
		String  lengthString=choosearray.length+"";
		map.addAttribute("lengthString",lengthString);
		List exampaperlist=new ArrayList();
		  for (int i = 0; i < choosearray.length; i++) {
			  exampaperlist.add(teacherServiceImpl.scanchoose(choosearray[i]));
		}
		  map.addAttribute("chooselist",exampaperlist);
		//查找填空题
	     String blankstr=exampaperTable.getBlankNumb();
	     String[] blankarray= blankstr.split(",");
	     String blanklength=blankarray.length+"";
	     map.addAttribute("blanklength",blanklength);
	     List blanklist=new ArrayList();
	       for(int j=0;j<blankarray.length;j++){
	    	   blanklist.add(teacherServiceImpl.scanchoose(blankarray[j]));
	       }
	       map.addAttribute("blanklist", blanklist);
	     //查找阅读题
	    String readingstr=exampaperTable.getReadingNumb();
	    String[] readingarray=readingstr.split(",");
	    String readinglength=readingarray.length+"";
	    map.addAttribute("readinglength",readinglength);
	    List readingList=new ArrayList();
	 //   List readingchooseList=new ArrayList();
	    for(int k=0;k<readingarray.length;k++){
	    	//通过主键id得到一个个实体
	    	QuestionTable questionTable=teacherServiceImpl.scanchoose(readingarray[k]);
	    	String readingchoose=questionTable.getTimekey();
	    	String[] readingchoosearray=readingchoose.split(",");
	    	readingList.add(questionTable);
	    	//每个文章题目的个数
	    	//String readingchoosearraylength=readingchoosearray.length+"";
	    	
	    	
//	    	for(int m=0;m<readingchoosearray.length;m++){
//	    		readingchooseList.add(teacherServiceImpl.scanchoose(readingchoosearray[m]));
//	    	}
	    	
	    	for(int m=0;m<readingchoosearray.length;m++){
	    		readingList.add(teacherServiceImpl.scanchoose(readingchoosearray[m]));
	    	}
	    
	    }
	    map.addAttribute("readingList", readingList);
	 //  map.addAttribute("readingchooseList",readingchooseList);
	   //组卷表 (试卷的基本信息)
	    map.addAttribute("exampaper",exampaperTable);
		return "form-scanpaper";
		
	}
	
	@RequestMapping(value = "/inserttextpaper", method = RequestMethod.POST)
	public String add_textpaper(ModelMap map,
			@ModelAttribute ExampaperTable exampaperTable) {
		teacherServiceImpl.insert_textpaper(exampaperTable);
		return "form-testpaper";
	}
	
	//查看试卷
	@RequestMapping(value = "/showpaper", method = RequestMethod.GET)
	public String lookpaper(ModelMap map){
		map.addAttribute("textpaperlist",teacherServiceImpl.showtestpaper() );
		return "from-selectpaper";
	}
	
	@RequestMapping(value = "/correctpaper", method = RequestMethod.GET)
	public String selectpaper(ModelMap map){
		String correctpaper="未批改";
		map.addAttribute("correctpaper2",teacherServiceImpl.showcorrectpaper(correctpaper));
		return "form-correctpaperselect";
		
	}
	
	@RequestMapping(value = "/allcorrectpaper", method = RequestMethod.GET)
	public String selectallpaper(ModelMap map){

		map.addAttribute("allcorrectpaper",teacherServiceImpl.selectPaper());
		return "allpapercorrect";
		
	}


	//查看图表时选择试卷
	@RequestMapping(value = "/correctpaper2", method = RequestMethod.GET)
	public String selectpaper2(ModelMap map){
		map.addAttribute("correctpaper",teacherServiceImpl.selectchartpaper());
		return "form-common-choosechart";
		
	}
	
	//删除试卷
	@RequestMapping(value = "/deletepaper", method = RequestMethod.GET)
	public String delete(ModelMap map,String exampaperId){
		teacherServiceImpl.deletechoosepaper(exampaperId);
		return "from-selectpaper";
		
	}
	
	//从题库中删除选择题
	@RequestMapping(value = "/deletechoose", method = RequestMethod.GET)
	public String deletechoose(ModelMap map,String exampaperNumber){
		teacherServiceImpl.deletechoose(exampaperNumber);
		return "form-testpaper";
		
	}
	
	//插入填空题得分
	@RequestMapping(value = "/insertcorrectblank", method = RequestMethod.POST)
	public String insertblankgrade(ModelMap map,String testanswerId,String 	studentBlankanswer,String[] grade){

        String  blankgradeString=""; 
		for (int i = 0; i < grade.length; i++) {
			blankgradeString+=grade[i]+",";
		}
		int endIndex=blankgradeString.length()-1;
		String blankgradeg=blankgradeString.substring(0, endIndex);
		System.out.println(blankgradeg);
		teacherServiceImpl.insertblankgrade(blankgradeg, testanswerId);
		return "form-correctpaperselect";
	}
	//批改填空题
	@RequestMapping(value = "/correctblank", method = RequestMethod.GET)
	public String correctblank(ModelMap map,String testanswerId,String studentBlankanswer,String blankNumb,String blankgrade){
		  String[] blankarray= blankNumb.split(",");
		  String[] studentanswer=studentBlankanswer.split(",");
		     List blanklist=new ArrayList();
		     List blanklistanswer=new ArrayList();
		     List gradelistList=new ArrayList();
		       for(int j=0;j<blankarray.length;j++){
		    	   blanklist.add(teacherServiceImpl.scanchoose(blankarray[j]));
		    	   blanklistanswer.add(studentanswer[j]);
		       }
		       map.addAttribute("correctblanklist", blanklist);
		       map.addAttribute("blanklistanswer", blanklistanswer);
		       int blankgrade2=Integer.parseInt(blankgrade);
		       for(int k=0;k<blankgrade2;k++){
		    	   gradelistList.add(k);		    	   
		       }
		       map.addAttribute("blankgrade",gradelistList);
		return "form-correctblank";	
	}
	
	
	
	

}
