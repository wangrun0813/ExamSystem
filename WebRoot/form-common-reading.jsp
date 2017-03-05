
<%@page import="java.util.Date"%>
<%@ page language="java" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html lang="en">
<head>
<base href="<%=basePath%>">
<title>Unicorn Admin</title>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/bootstrap-responsive.min.css" />
<link rel="stylesheet" href="css/uniform.css" />
<link rel="stylesheet" href="css/select2.css" />
<link rel="stylesheet" href="css/unicorn.main.css" />
<link rel="stylesheet" href="css/unicorn.grey.css" class="skin-color" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script src="js/jquery.min.js" type="text/JavaScript"></script>
<script type="text/JavaScript">
	$(function() {
		var i = 0;
		var t = 1;
		var h = 0;
		$("#lol")
				.click(
						function() {
							var $link = $("<div class='row-fluid'>"
									+ "<div class='span12'>"
									+ "<div class='widget-box'>"
									+ "<div class='widget-title'>"
									+ "<span class='icon'>"
									+ "<i class='icon-align-justify'></i>"
									+ "</span>" + "<h5>题目"
									+ t
									+ "</h5>"
									+ "</div>"
									+ "<div class='widget-content nopadding'>"
									+ "<div class='control-group'>"
									+ "<label class='control-label'>选择题干</label>"
									+ "<div class='controls'>"
									+ "<textarea name='question'></textarea>"
									+ "</div>"
									+ "</div>"
									+

									"<div class='control-group'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;A"
									+ "<div class='controls'>"
									+ "<input type='text' name='achoose'/>"
									+ "</div>"
									+ "</div>"
									+ "<div class='control-group'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;B"
									+

									"<div class='controls'>"
									+ "<input type='text' name='bcchoose'/>"
									+ "</div>"
									+ "</div>"
									+ "<div class='control-group'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;C"
									+

									"<div class='controls'>"
									+ "<input type='text' name='ccchoose'/>"
									+ "</div>"
									+ "</div>"
									+ "<div class='control-group'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;D"
									+

									"<div class='controls'>"
									+ "<input type='text' name='dchoose'/>"
									+ "</div>"
									+ "</div>"
									+ "<div class='control-group'><label class='control-label'>"
									+ "正确答案</label>"
									+ "<div class='controls' id='myradio'>"
									+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp<input type='radio' name='mykey"+h+"' value='A'>&nbsp;&nbsp;&nbsp;&nbsp;A"
									+ " &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp<input type='radio'name='mykey"+h+"' value='B'>&nbsp;&nbsp;&nbsp;&nbsp;B"
									+ " &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp<input type='radio' name='mykey"+h+"' value='C'>&nbsp;&nbsp;&nbsp;&nbsp;C"
									+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp<input type='radio' name='mykey"+h+"' value='D'>&nbsp;&nbsp;&nbsp;&nbsp;D"
									+ "</div>"
									+ "</div>"
									+ "<div class='control-group'>"
									+ "<label class='control-label'>解答</label>"
									+ "<div class='controls'>"
									+ "<textarea name='trueexplain'></textarea>"
									+ "	</div>"
									+ "</div>"
									+ "</div>"
									+ "</div>" + "</div>" + "</div>" + "</div>");
							i++;
							t++;
							h++;
							$("#end").before($link);

						})
	})
</script>
</head>

<body>
	<div id="header">
		<h1>
			<a href="./dashboard.html">Unicorn Admin</a>
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
					class="icon icon-user"></i> <span class="text">Profile</span> </a>
			</li>
			<li class="btn btn-inverse dropdown" id="menu-messages"><a
				href="#" data-toggle="dropdown" data-target="#menu-messages"
				class="dropdown-toggle"><i class="icon icon-envelope"></i> <span
					class="text">Messages</span> <span class="label label-important">5</span>
					<b class="caret"></b> </a>
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
					class="icon icon-cog"></i> <span class="text">Settings</span> </a>
			</li>
			<li class="btn btn-inverse"><a title="" href="login.html"><i
					class="icon icon-share-alt"></i> <span class="text">Logout</span> </a>
			</li>
		</ul>
	</div>

	<div id="sidebar">
		<a href="#" class="visible-phone"><i class="icon icon-th-list"></i>
		</a>
		<ul>
			<li><a href="index.jsp"><i class="icon icon-home"></i> <span>教师主页</span>
			</a>
			</li>
			<li class="submenu active open"><a href="#"><i
					class="icon icon-th-list"></i> <span>题库管理</span> <span
					class="label">3</span> </a>
				<ul>
					<li><a href="form-common.jsp">选择题</a>
					</li>
					<li class="active"><a href="form-common-reading.jsp">阅读题</a>
					</li>
					<li><a href="form-common-blank.jsp">填空题</a>
					</li>
				</ul></li>
			<li><a href="form-testpaper.jsp"><i class="icon icon-tint"></i>
					<span>组卷管理</span> </a>
			</li>
			 <li><a href="teacher/showpaper"><i class="icon icon-pencil"></i> <span>查看试卷</span></a></li>
			   <li><a href="teacher/correctpaper"><i class="icon icon-pencil"></i> <span>批改试卷</span></a></li>
			        <li><a href="teacher/correctpaper2"><i class="icon icon-pencil"></i> <span>信息统计</span></a></li>
			<li><a href="form-information.jsp"><i
					class="icon icon-pencil"></i> <span>信息管理</span> </a>
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
			<h1>阅读题</h1>
			<div class="btn-group">
				<a class="btn btn-large tip-bottom" title="Manage Files"><i
					class="icon-file"></i> </a> <a class="btn btn-large tip-bottom"
					title="Manage Users"><i class="icon-user"></i> </a> <a
					class="btn btn-large tip-bottom" title="Manage Comments"><i
					class="icon-comment"></i><span class="label label-important">5</span>
				</a> <a class="btn btn-large tip-bottom" title="Manage Orders"><i
					class="icon-shopping-cart"></i> </a>
			</div>
		</div>
		<div id="breadcrumb">
			<a href="index.html" title="Go to Home" class="tip-bottom"><i
				class="icon-home"></i> 主页</a> <a href="#">题库管理</a> <a href="#"
				class="current">阅读题</a>
		</div>
		<div class="container-fluid">
			<form action="teacher/reading" method="post" class="form-horizontal" />
			<input type="hidden" name="chapterTypeName" value="阅读">
			<div class="row-fluid">
				<div class="span12">
					<div class="widget-box">
						<div class="widget-title">
							<span class="icon"> <i class="icon-align-justify"></i> </span>
							<h5>主要信息</h5>
						</div>
						<div class="widget-content nopadding">
							<div class="control-group">
								<label class="control-label">题目内容</label>
								<div class="controls">
									<textarea name="readingtext"></textarea>
								</div>
							</div>
							<div class="control-group">
								<label class="control-label">题目章节</label>
								<div class="controls">
									<select style="width:120px" name="chapterName">
										<option value="社会" />社会类
										<option value="科技" />科技类
										<option value="经济" />经济类
										<option value="故事" />故事类
									</select>
								</div>
							</div>


						</div>
					</div>
				</div>
			</div>



			<div class="form-actions" id="end">
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<button type="submit" class="btn btn-primary" onclick="checks()">save</button>
				&nbsp;&nbsp;&nbsp;
				<button type="button" class="btn btn-primary" id="lol">add</button>
			</div>
			</form>
		</div>

		<div class="row-fluid">
			<div id="footer" class="span12">
				2012 &copy; Unicorn Admin. Brought to you by <a
					href="https://wrapbootstrap.com/user/diablo9983">diablo9983</a>
			</div>
		</div>
	</div>
	</div>



	<script src="js/jquery.min.js"></script>
	<script src="js/jquery.ui.custom.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.uniform.js"></script>
	<script src="js/select2.min.js"></script>
	<script src="js/jquery.validate.js"></script>
	<script src="js/unicorn.js"></script>
	<script src="js/unicorn.form_validation.js"></script>
</body>
</html>
