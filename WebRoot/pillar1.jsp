<%@page import="java.util.List"%>
<%@page import="com.entity.TestanswerTable"%>
<%@ page language="java" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%@ page import="org.jfree.chart.ChartFactory,
org.jfree.chart.JFreeChart,
org.jfree.chart.plot.PlotOrientation,  
org.jfree.chart.servlet.ServletUtilities,
org.jfree.data.category.DefaultCategoryDataset,
org.jfree.data.category.*,
 org.jfree.chart.*,
 java.awt.Font,
 org.jfree.chart.ChartFactory,
org.jfree.chart.JFreeChart,
org.jfree.data.general.DefaultPieDataset,
org.jfree.chart.servlet.*"%>  
<%  

String exampaperName=request.getParameter("exampaperName");
//链表

List list=(List)request.getAttribute("alllist");
System.out.println("list"+list.size());
String averagegradee=request.getAttribute("averagegrade")+"";
int averagegradee2=Integer.parseInt(averagegradee);
DefaultCategoryDataset dataset = new DefaultCategoryDataset();  
dataset.addValue(averagegradee2, "1", "平均分:"+averagegradee2);  
for(int i=0;i<list.size();i++){
	String string=list.get(i)+"";
	String[] array=string.split(",");
	int grade=Integer.parseInt(array[0]);
	System.out.println(grade);
    dataset.addValue(grade, "1",array[1]+": "+grade+"分");  
}

//创建主题样式  
StandardChartTheme standardChartTheme=new StandardChartTheme("CN");  
//设置标题字体  
standardChartTheme.setExtraLargeFont(new Font("隶书",Font.BOLD,20));  
//设置图例的字体  
standardChartTheme.setRegularFont(new Font("宋书",Font.PLAIN,15));  
//设置轴向的字体  
standardChartTheme.setLargeFont(new Font("宋书",Font.PLAIN,15));  
//应用主题样式  
ChartFactory.setChartTheme(standardChartTheme); 
JFreeChart chart = ChartFactory.createBarChart3D("班级平均分",   
                  "班级",  
                  "分数",  
                  dataset,  
                  PlotOrientation.VERTICAL,  
                  false,  
                  false,  
                  false);  
String filename = ServletUtilities.saveChartAsPNG(chart, 600, 350, null, session);  
String graphURL = request.getContextPath() + "/DisplayChart?filename=" + filename;  



/*DefaultPieDataset dpd = new DefaultPieDataset();

dpd.setValue("管理人员", 25);
dpd.setValue("市场人员", 25);
dpd.setValue("开发人员", 45);
dpd.setValue("其他人员", 10);

JFreeChart chart2 = ChartFactory.createPieChart("某公司组织结构图",dpd, true, false, false);

String fileName = ServletUtilities.saveChartAsPNG(chart2,800,600,session); 
//ServletUtilities是面向web开发的工具类，返回一个字符串文件名,文件名自动生成，生成好的图片会自动放在服务器（tomcat）的临时文件下（temp）

String url = request.getContextPath() + "/DisplayChart?filename=" + fileName;*/
//根据文件名去临时目录下寻找该图片，这里的/DisplayChart路径要与配置文件里用户自定义的<url-pattern>一致
%>  

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	   <base href="<%=basePath%>">
		<title>Unicorn Admin</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<link rel="stylesheet" href="css/bootstrap.min.css" />
		<link rel="stylesheet" href="css/bootstrap-responsive.min.css" />
        <link rel="stylesheet" href="css/colorpicker.css" />
        <link rel="stylesheet" href="css/datepicker.css" />
		<link rel="stylesheet" href="css/uniform.css" />
		<link rel="stylesheet" href="css/select2.css" />		
		<link rel="stylesheet" href="css/unicorn.main.css" />
		<link rel="stylesheet" href="css/unicorn.grey.css" class="skin-color" />	
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /></head>
	<body>
		
		
		<div id="header">
			<h1><a href="./dashboard.jsp">教师主页</a></h1>		
		</div>
		
		<div id="search">
			<input type="text" placeholder="Search here..." /><button type="submit" class="tip-right" title="Search"><i class="icon-search icon-white"></i></button>
		</div>
		<div id="user-nav" class="navbar navbar-inverse">
            <ul class="nav btn-group">
                <li class="btn btn-inverse"><a title="" href="#"><i class="icon icon-user"></i> <span class="text">Profile</span></a></li>
                <li class="btn btn-inverse dropdown" id="menu-messages"><a href="#" data-toggle="dropdown" data-target="#menu-messages" class="dropdown-toggle"><i class="icon icon-envelope"></i> <span class="text">Messages</span> <span class="label label-important">5</span> <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a class="sAdd" title="" href="#">new message</a></li>
                        <li><a class="sInbox" title="" href="#">inbox</a></li>
                        <li><a class="sOutbox" title="" href="#">outbox</a></li>
                        <li><a class="sTrash" title="" href="#">trash</a></li>
                    </ul>
                </li>
                <li class="btn btn-inverse"><a title="" href="#"><i class="icon icon-cog"></i> <span class="text">Settings</span></a></li>
                <li class="btn btn-inverse"><a title="" href="login.html"><i class="icon icon-share-alt"></i> <span class="text">Logout</span></a></li>
            </ul>
        </div>
            
		<div id="sidebar">
			<a href="#" class="visible-phone"><i class="icon icon-th-list"></i> 教师管理</a>
			<ul>
				<li><a href="index.jsp"><i class="icon icon-home"></i> <span>教师主页</span></a></li>
				<li class="submenu active open">
					<a href="#"><i class="icon icon-th-list"></i> <span>题库管理</span> <span class="label">3</span></a>
					<ul>
				
						<li><a href="form-common.jsp">选择题</a></li>
						<li><a href="form-common-reading.jsp">阅读题</a></li>
						<li><a href="form-common-blank.jsp">填空题</a></li>
					</ul>
				</li>
					<li><a href="form-testpaper.jsp"><i class="icon icon-tint"></i> <span>组卷管理</span></a></li>
					 <li><a href="teacher/showpaper"><i class="icon icon-pencil"></i> <span>查看试卷</span></a></li>
					   <li><a href="teacher/correctpaper"><i class="icon icon-pencil"></i> <span>批改试卷</span></a></li>
					     <li><a href="teacher/correctpaper2"><i class="icon icon-pencil"></i> <span>信息统计</span></a></li>
			        <li><a href="form-information.jsp"><i class="icon icon-pencil"></i> <span>信息管理</span></a></li>
			</ul>
		
		</div>
		
		<div id="style-switcher">
			<i class="icon-arrow-left icon-white"></i>
			<span>Style:</span>
			<a href="#grey" style="background-color: #555555;border-color: #aaaaaa;"></a>
			<a href="#blue" style="background-color: #2D2F57;"></a>
			<a href="#red" style="background-color: #673232;"></a>
		</div>
		
		<div id="content">
			<div id="content-header">
				<h1>教师管理</h1>
				<div class="btn-group">
					<a class="btn btn-large tip-bottom" title="Manage Files"><i class="icon-file"></i></a>
					<a class="btn btn-large tip-bottom" title="Manage Users"><i class="icon-user"></i></a>
					<a class="btn btn-large tip-bottom" title="Manage Comments"><i class="icon-comment"></i><span class="label label-important">5</span></a>
					<a class="btn btn-large tip-bottom" title="Manage Orders"><i class="icon-shopping-cart"></i></a>
				</div>
			</div>
			<div id="breadcrumb">
			<a href="index.jsp" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> 主页</a>
				
				<a href="#" class="tip-bottom">教师管理</a>
				
				<a href="#" class="current">数据统计</a>
			</div>
				<div class="widget-title">
								<span class="icon">
									<i class="icon-th"></i>
								</span>
								<h5>班级总体情况</h5>
								<span class="label label-info">Featured</span>
							</div>
			<img src="<%= graphURL %>" width=640 height=450 border=0>  
			
				<div class="widget-box">
							<div class="widget-title">
								<span class="icon">
									<i class="icon-th"></i>
								</span>
								<h5>各班级情况</h5>
								<span class="label label-info">Featured</span>
							</div>
							<div class="widget-content">
								<table class="table table-bordered table-striped with-check" >
									<thead>
										<tr>
												
											<th>名称</th>
											<th>查看信息统计</th>
										
										</tr>
									</thead>
									<tbody >
									<input type="hidden" name="fullgrade" value="${param.fullgrade}">
									 	<c:forEach items="${listclassname}" var="lis">
										<tr>
											<td>${lis}</td>
										    <td><a href="teacher/eachclass?classname=${lis}&fullgrade=${param.fullgrade}&exampaperId=${param.exampaperId}">查看信息统计</a></td> 
										</tr>
									</c:forEach> 
									</tbody>
								</table>							
							</div>
						</div>
        
            <script src="js/jquery.min.js"></script>
            <script src="js/jquery.ui.custom.js"></script>
            <script src="js/bootstrap.min.js"></script>
            <script src="js/bootstrap-colorpicker.js"></script>
            <script src="js/bootstrap-datepicker.js"></script>
            <script src="js/jquery.uniform.js"></script>
            <script src="js/select2.min.js"></script>
            <script src="js/unicorn.js"></script>
            <script src="js/unicorn.form_common.js"></script>
	</body>
</html>