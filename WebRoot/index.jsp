<%@ page language="java" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
pageContext.setAttribute("basepath", basePath);
%>
<html>
 <head>
 <base href=<%=basePath %>>
		<title>Unicorn Admin</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<link rel="stylesheet" href="${basepath}/css/bootstrap.min.css" />
		<link rel="stylesheet" href="${basepath}/css/bootstrap-responsive.min.css" />
		<link rel="stylesheet" href="${basepath}/css/fullcalendar.css" />	
		<link rel="stylesheet" href="${basepath}/css/unicorn.main.css" />
		<link rel="stylesheet" href="${basepath}/css/unicorn.grey.css" class="skin-color" />
   </head>
	<body>
		
		
		<div id="header">
			<h1><a href="./dashboard.jsp">教师主页</a></h1>		
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
                <li class="btn btn-inverse"><a title="" href="login.jsp"><i class="icon icon-share-alt"></i> <span class="text">Logout</span></a></li>
            </ul>
        </div>
            
		<div id="sidebar">
			<a href="#" class="visible-phone"><i class="icon icon-home"></i> 教师主页</a>
			<ul>
				<li class="active"><a href="index.jsp"><i class="icon icon-home"></i> <span>教师主页</span></a></li>
				<li class="submenu">
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
	<!--  -->	
		<div id="content">
			<div id="content-header">
				<h1>Dashboard</h1>
				<div class="btn-group">
					<a class="btn btn-large tip-bottom" title="Manage Files"><i class="icon-file"></i></a>
					<a class="btn btn-large tip-bottom" title="Manage Users"><i class="icon-user"></i></a>
					<a class="btn btn-large tip-bottom" title="Manage Comments"><i class="icon-comment"></i><span class="label label-important">5</span></a>
					<a class="btn btn-large tip-bottom" title="Manage Orders"><i class="icon-shopping-cart"></i></a>
				</div>
			</div>
			<div id="breadcrumb">
				<a href="#" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> Home</a>
				<a href="index.jsp" class="current">教师主页</a>
			</div>
						<div class="widget-box">
						<div class="widget-title">
							<span class="icon"> <i class="icon-th"></i> </span>
							<h5>基本信息</h5>
						</div>
						<div class="widget-content nopadding">
							<table class="table table-bordered table-striped">
								
								<tbody>
									<tr>
									    <th>id</th>
										<th>${teacher.teacherId}</th>
										<th>姓名</th>
										<th>${teacher.teacherName}</th>
									</tr>
									
									<tr>
										<th></th>
										<th></th>
										<th></th>
										<th></th>
									</tr>
									
									
									<tr>
										<th></th>
										<th></th>
										<th></th>
										<th></th>
									</tr>
									<tr>
										<th>账户</th>
										<th>${teacher.teacherAccount}</th>
										<th>电话</th>
										<th>${teacher.teacherTele}</th>
									</tr>
								
								</tbody>
							</table>
						</div>
					</div>

            <script src="${basepath }/js/excanvas.min.js"></script>
            <script src="${basepath }/js/jquery.min.js"></script>
            <script src="${basepath }/js/jquery.ui.custom.js"></script>
            <script src="${basepath }/js/bootstrap.min.js"></script>
            <script src="${basepath }/js/jquery.flot.min.js"></script>
            <script src="${basepath }/js/jquery.flot.resize.min.js"></script>
            <script src="${basepath }/js/jquery.peity.min.js"></script>
            <script src="${basepath }/js/fullcalendar.min.js"></script>
            <script src="${basepath }/js/unicorn.js"></script>
            <script src="${basepath }/js/unicorn.dashboard.js"></script>
	</body>
</html>
