<%@ page language="java" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
pageContext.setAttribute("basepath", basePath);
%>
<html>
<head>

<title>Insert title here</title>
	<head>
	 <base href=<%=basePath %>>
		<title>Unicorn Admin</title>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
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
			<a href="#" class="visible-phone"><i class="icon icon-th-list"></i> 教师主页</a>
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
				<a href="#" class="current">题库管理</a>
			</div>
			<div class="container-fluid">
				<div class="row-fluid">
					<div class="span12">
						<div class="widget-box">
							<div class="widget-title">
								<span class="icon">
									<i class="icon-align-justify"></i>									
								</span>
								<h5>Text inputs</h5>
							</div>
							<div class="widget-content nopadding">
								<form action="teacher/choose" method="post" class="form-horizontal" />
								<input type="hidden" name="chapterTypeName" value="选择">
									<div class="control-group">
										<label class="control-label">题目章节</label>
										<div class="controls">
									         <select style="width:120px" name="chapterName">
										<option value="单词"/>单词
										<option value="语法"/>语法
										<option value="短语"/>短语										
									</select>
									</div>
										
								
									</div>
									<div class="control-group">
										<label class="control-label">题干</label>
										<div class="controls">
											<input type="text" name="question"/>
											<span class="help-block">请在此输入题干</span>
										</div>
									</div>
									<div class="control-group">
										<label class="control-label">选项</label>
										<div class="controls">
											A:<input type="text" name="achoose"/>&nbsp;&nbsp;&nbsp;&nbsp;</br></br>
											B:<input type="text" name="bcchoose"/>&nbsp;&nbsp;&nbsp;&nbsp;</br></br>
											C:<input type="text" name="ccchoose"/>&nbsp;&nbsp;&nbsp;&nbsp;</br></br>
											D:<input type="text" name="dchoose"/>&nbsp;&nbsp;&nbsp;&nbsp;</br></br>
										
										</div>
									</div>
									<div class="control-group">
										<label class="control-label">正确答案</label>
										<div class="controls">
									          <select style="width:120px" name="mykey">
										<option value="A"/>A
										<option value="B"/>B
										<option value="C"/>C
										<option value="D"/>D 
									</select>
										</div>
									</div>
								
									<div class="control-group">
										<label class="control-label">解答</label>
										<div class="controls" >
											<textarea name="trueexplain"></textarea>
										</div>
									</div>
									<div class="form-actions">
										<button type="submit" class="btn btn-primary">Save</button>
									</div>
								</form>
							</div>
						</div>						
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
