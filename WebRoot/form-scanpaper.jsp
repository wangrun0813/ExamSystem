<%@ page language="java" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<html>
<head>
<title>Insert title here</title>
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
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script src="js/jquery.min.js" type="text/JavaScript"></script>
<script type="text/javascript">
  
    </script>

</head>
<body>


	<div id="header">
		<h1>
			<a href="./dashboard.jsp">教师主页</a>
		</h1>
	</div>

	<div id="search">
		<input type="text" placeholder="Search here..." />
		<button type="submit" class="tip-right" title="Search">
			<i class="icon-search icon-white"></i>
		</button>
	</div>
	<div id="user-nav" class="navbar navbar-inverse">
		<ul class="nav btn-group">
			<li class="btn btn-inverse"><a title="" href="#"><i
					class="icon icon-user"></i> <span class="text">Profile</span>
			</a>
			</li>
			<li class="btn btn-inverse dropdown" id="menu-messages"><a
				href="#" data-toggle="dropdown" data-target="#menu-messages"
				class="dropdown-toggle"><i class="icon icon-envelope"></i> <span
					class="text">Messages</span> <span class="label label-important">5</span>
					<b class="caret"></b>
			</a>
				<ul class="dropdown-menu">
					<li><a class="sAdd" title="" href="#">new message</a>
					</li>
					<li><a class="sInbox" title="" href="#">inbox</a>
					</li>
					<li><a class="sOutbox" title="" href="#">outbox</a>
					</li>
					<li><a class="sTrash" title="" href="#">trash</a>
					</li>
				</ul></li>
			<li class="btn btn-inverse"><a title="" href="#"><i
					class="icon icon-cog"></i> <span class="text">Settings</span>
			</a>
			</li>
			<li class="btn btn-inverse"><a title="" href="login.html"><i
					class="icon icon-share-alt"></i> <span class="text">Logout</span>
			</a>
			</li>
		</ul>
	</div>

	<div id="sidebar">
		<a href="#" class="visible-phone"><i class="icon icon-th-list"></i>
			教师管理</a>
		<ul>
			<li><a href="index.jsp"><i class="icon icon-home"></i> <span>教师主页</span>
			</a>
			</li>
			<li class="submenu active open"><a href="#"><i
					class="icon icon-th-list"></i> <span>题库管理</span> <span
					class="label">3</span>
			</a>
				<ul>

					<li><a href="form-common.jsp">选择题</a>
					</li>
					<li><a href="form-common-reading.jsp">阅读题</a>
					</li>
					<li><a href="form-common-blank.jsp">填空题</a>
					</li>
				</ul></li>
			<li><a href="form-testpaper.jsp"><i class="icon icon-tint"></i>
					<span>组卷管理</span>
			</a>
			</li>
			<li><a href="teacher/showpaper"><i
					class="icon icon-pencil"></i> <span>查看试卷</span>
			</a>
			</li>
			  <li><a href="teacher/correctpaper"><i class="icon icon-pencil"></i> <span>批改试卷</span></a></li>
			       <li><a href="teacher/correctpaper2"><i class="icon icon-pencil"></i> <span>信息统计</span></a></li>
			<li><a href="form-information.jsp"><i
					class="icon icon-pencil"></i> <span>信息管理</span>
			</a>
			</li>
		</ul>

	</div>

	<div id="style-switcher">
		<i class="icon-arrow-left icon-white"></i> <span>Style:</span> <a
			href="#grey" style="background-color: #555555;border-color: #aaaaaa;"></a>
		<a href="#blue" style="background-color: #2D2F57;"></a> <a href="#red"
			style="background-color: #673232;"></a>
	</div>

	<div id="content">
		<div id="content-header">
			<h1>浏览试卷</h1>
			<div class="btn-group">
				<a class="btn btn-large tip-bottom" title="Manage Files"><i
					class="icon-file"></i>
				</a> <a class="btn btn-large tip-bottom" title="Manage Users"><i
					class="icon-user"></i>
				</a> <a class="btn btn-large tip-bottom" title="Manage Comments"><i
					class="icon-comment"></i><span class="label label-important">5</span>
				</a> <a class="btn btn-large tip-bottom" title="Manage Orders"><i
					class="icon-shopping-cart"></i>
				</a>
			</div>
		</div>
		<div id="breadcrumb">
			<a href="index.jsp" title="Go to Home" class="tip-bottom"><i
				class="icon-home"></i> 主页</a> <a href="#" class="tip-bottom">查看试卷</a>
		</div>


		<div class="container-fluid">
			<div class="row-fluid">
				<div class="span12">

					<div class="widget-box">
						<div class="widget-title">
							<span class="icon"> <i class="icon-align-justify"></i> </span>
							<h5>试卷信息</h5>
						</div>
						<div class="widget-content nopadding">
							<h2 align="center">${exampaper.exampaperName}</h2>
							<h4 align="center">
								总分：${exampaper.fullgrade}&nbsp;
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;考试时间:${exampaper.exampaperTime}
								<h4>
						</div>
					</div>
					<div class="widget-box">
						<div class="widget-title">
							<span class="icon"> <i class="icon-align-justify"></i> </span>
							<h5>选择题 &nbsp;&nbsp;&nbsp;&nbsp;
								&nbsp;&nbsp;&nbsp;&nbsp;共${lengthString}道题
								&nbsp;&nbsp;&nbsp;&nbsp;每题${exampaper.choosegrade}分</h5>
						</div>
						<div class="widget-content nopadding">
							<c:set var="number" value="0" />
							<c:forEach items="${chooselist}" var="cho">
								<c:set var="number" value="${number+1}" />	
							&nbsp;&nbsp;&nbsp;&nbsp;	第${number}题<br>
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	${cho.question};<br>
							&nbsp;&nbsp;&nbsp;&nbsp;	A:${cho.achoose};&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								B:${cho.bcchoose};<br>
							&nbsp;&nbsp;&nbsp;&nbsp;	C:${cho.ccchoose};&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								D:${cho.dchoose};<br>
								<br>
								<br>
							</c:forEach>
						</div>
					</div>

					<div class="widget-box">
						<div class="widget-title">
							<span class="icon"> <i class="icon-align-justify"></i> </span>
							<h5>填空题 &nbsp;&nbsp;&nbsp;&nbsp;
								&nbsp;&nbsp;&nbsp;&nbsp;共${blanklength}道题
								&nbsp;&nbsp;&nbsp;&nbsp;每题${exampaper.blankgrade}分</h5>
						</div>
						<div class="widget-content nopadding">
							<c:set var="number2" value="0" />
							<c:forEach items="${blanklist}" var="blan">
								<c:set var="number2" value="${number2+1}" />	
							&nbsp;&nbsp;&nbsp;&nbsp;	第${number2}题<br>
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	${blan.question};<br>
								<br>
								<br>
							</c:forEach>
						</div>
					</div>

					<div class="widget-box">
						<div class="widget-title">
							<span class="icon"> <i class="icon-align-justify"></i> </span>
							<h5>阅读题&nbsp;&nbsp;&nbsp;&nbsp;
								&nbsp;&nbsp;&nbsp;&nbsp;共${readinglength}道题
								&nbsp;&nbsp;&nbsp;&nbsp;每题${exampaper.readinggrade}分</h5>
						</div>
						<div class="widget-content nopadding">

							<c:set var="number3" value="0" />
							<c:forEach items="${readingList}" var="read">
								
	                                                                       
                          &nbsp;&nbsp;&nbsp;&nbsp;	  ${read.readingtext}<br>
                                                                               
                          
                            <c:if test="${read.readingtext  eq null}">
                            <c:set var="number3" value="${number3+1}" />	
                         	  第${number3}题<br>
                              &nbsp;&nbsp; ${read.question}<br>
                              &nbsp;&nbsp; A:${read.achoose}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							   &nbsp;&nbsp;B:${read.bcchoose}<br>	&nbsp;&nbsp;&nbsp;&nbsp;	
						      &nbsp;&nbsp; C:${read.ccchoose}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							   &nbsp;&nbsp;D:${read.dchoose}<br>
                            </c:if>
                            <c:if test="${read.readingtext ne  null}  " >
                               
                            </c:if>
                          
									<br>
									<br>

					<!--  			<c:forEach items="${readingchooseList}" var="readchoose">
							${readchoose.question};	<br>
                            A:${readchoose.achoose};&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							B:${readchoose.bcchoose};<br>	&nbsp;&nbsp;&nbsp;&nbsp;	
						    C:${readchoose.ccchoose};&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							D:${readchoose.dchoose};<br>
									<br>
									<br>
								</c:forEach>-->
							</c:forEach>
						</div>
					</div>
				</div>
			</div>
		</div>
</body>
</html>