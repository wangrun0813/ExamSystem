<%@ page language="java" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
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
  <script type="text/javascript">
          var questionid="";
           var questionarr=new Array();//选择题编号数组
           var questionarr2=new Array();//填空题编号数组
           var questionarr3=new Array();//阅读题编号数组
           function addquestion(questionid) {
            alert("本题编号"+questionid);
         	questionarr.push(questionid);
            $("#numberquestion").append("&nbsp;&nbsp;&nbsp;<lable id='dellable"+questionid+"'>"+questionid+"</lable >&nbsp;&nbsp;&nbsp;<a href='javascritp:void(0);' id='delnumberquestion"+questionid+"' onclick='delquestion("+questionid+")'>删除题目</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
 
            }
         //从组成试卷中删除选择题
              function delquestion(questionid) {
            	  $("#dellable"+questionid+"").remove();
            	  $("#delnumberquestion"+questionid+"").remove();
            	  Array.prototype.indexOf = function(questionid) {
                   for (var i = 0; i < questionarr.length; i++) {
                       if (questionarr[i] ==questionid) return i;
                   }
                   return -1;
               };
               Array.prototype.remove = function(questionid) {
                   var index = questionarr.indexOf(questionid);
                   if (index > -1) {
                	   questionarr.splice(index, 1);
                   }
               };
               questionarr.remove(questionid);
           }
            //填空题
              function addquestion2(questionid) {
                  alert("本题编号"+questionid);
               	questionarr2.push(questionid);
                  $("#numberquestion").append("&nbsp;&nbsp;&nbsp;<lable id='dellable"+questionid+"'>"+questionid+"</lable >&nbsp;&nbsp;&nbsp;<a href='javascritp:void(0);' id='delnumberquestion"+questionid+"' onclick='delquestion2("+questionid+")'>删除题目</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
       
                  }
                    function delquestion2(questionid) {
                  	  $("#dellable"+questionid+"").remove();
                  	  $("#delnumberquestion"+questionid+"").remove();
                  	  Array.prototype.indexOf = function(questionid) {
                         for (var i = 0; i < questionarr2.length; i++) {
                             if (questionarr2[i] ==questionid) return i;
                         }
                         return -1;
                     };
                     Array.prototype.remove = function(questionid) {
                         var index = questionarr2.indexOf(questionid);
                         if (index > -1) {
                      	   questionarr2.splice(index, 1);
                         }
                     };
                     questionarr2.remove(questionid);
                 } 
         
              
            //阅读题
 
              function addquestion3(questionid) {
                  alert("本题编号"+questionid);
               	questionarr3.push(questionid);
                  $("#numberquestion").append("&nbsp;&nbsp;&nbsp;<lable id='dellable"+questionid+"'>"+questionid+"</lable >&nbsp;&nbsp;&nbsp;<a href='javascritp:void(0);' id='delnumberquestion"+questionid+"' onclick='delquestion3("+questionid+")'>删除题目</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
       
                  }
                    function delquestion3(questionid) {
                  	  $("#dellable"+questionid+"").remove();
                  	  $("#delnumberquestion"+questionid+"").remove();
                  	  Array.prototype.indexOf = function(questionid) {
                         for (var i = 0; i < questionarr3.length; i++) {
                             if (questionarr3[i] ==questionid) return i;
                         }
                         return -1;
                     };
                     Array.prototype.remove = function(questionid) {
                         var index = questionarr3.indexOf(questionid);
                         if (index > -1) {
                      	   questionarr3.splice(index, 1);
                         }
                     };
                     questionarr3.remove(questionid);
                 } 
                    
                    function changearray(){
                  	  var fstrarray="";
                  	  var strarraylast="";
                  	  var fstrarray2="";
                  	  var strarray2last="";
                  	  var fstrarray3="";
                  	  var strarray3last="";
                  	  for (var i = 0; i < questionarr.length-1; i++) {
                  	  fstrarray+=questionarr[i]+",";         
                  	  }
                  	 for (var i = 0; i < questionarr.length; i++) {
                  		strarraylast=questionarr[i];
                  	 }
                  	  var strarray=fstrarray+strarraylast
                  
                  	$("#chooseNumb").val(strarray);
                  	
                  	
                  	 for (var i = 0; i < questionarr2.length-1; i++) {
                  		fstrarray2+=questionarr2[i]+",";
                     	  }
                  	 for (var i = 0; i < questionarr2.length; i++) {
                   		strarray2last=questionarr2[i];
                   	 }
               	      var strarray2=fstrarray2+strarray2last;
                     	$("#blankNumb").val(strarray2);
                     	
                     	 for (var i = 0; i < questionarr3.length-1; i++) {
                     		fstrarray3+=questionarr3[i]+",";                  
                         	  }
                    	 for (var i = 0; i < questionarr3.length; i++) {
                        		strarray3last=questionarr3[i];
                        	 }
                    	      var strarray3=fstrarray3+strarray3last;
                         	$("#readingNumb").val(strarray3);
                         	  var grade=  questionarr.length*document.formquestion.choosegrade.value+questionarr2.length*
                           	  document.formquestion.blankgrade.value+questionarr3.length*
                           	  document.formquestion.readinggrade.value*5;
                             if(document.formquestion.fullgrade.value!=grade){
                           		alert("当前试卷总分: "+document.formquestion.fullgrade.value+"        你当前总分为: "+grade+"     请继续组卷!");
                           		 return false;
                           	  }
                  	  return true;
                    }
          $(function(){
            $("#chapterTypeName").change(function(){
              $.post("teacher/chapter",
            		  {chapterTypeName:$("#chapterTypeName  option:selected").val()},function(data,status){
                  var str = "";
                  var list = eval("("+data+")");
                  for(var i=0;i<list.length;i++){
                       str +="<option value='"+list[i].chapterName+"'>"+list[i].chapterName+"</option>";
                  }
                  $("#chapterName").html(str);
              });
            });

            $("#chapterName").change(function(){
              $.post("teacher/question",{chapterName:$("#chapterName  option:selected").val(),chapterTypeName:$("#chapterTypeName  option:selected").val()},function(data,status){
                  var str = "";
                  var list = eval("("+data+")");
                  for(var i=0;i<list.length;i++){ 
                	questionid=list[i].exampaperNumber;
                	str +="<tr>";                    	
                	str+="<td><a href='javascritp:void(0);' onclick='addquestion("+questionid+")' id='addchoosequestion'>添加题目</a></td>"; 
                	str+="<td><a href='teacher/deletechoose?exampaperNumber="+questionid+";'>删除题目</a></td>"; 
                	str+="<td>"+list[i].exampaperNumber+"</td>";
                	str+="<td>"+list[i].question+"</td>";
                	str+="<td>"+list[i].achoose+"</td>";
                	str+="<td>"+list[i].bcchoose+"</td>";
                	str+="<td>"+list[i].ccchoose+"</td>";
                	str+="<td>"+list[i].dchoose+"</td>";
                	str+="<td>"+list[i].mykey+"</td>";
                	str+="<td>"+list[i].trueexplain+"</td>"; 
                	str+="</tr>";
                  }
                  $("#questiontable").html(str);
              });
            });
            
            
            $(function(){
                $("#chapterTypeName2").change(function(){
                  $.post("teacher/chapter",
                		  {chapterTypeName:$("#chapterTypeName2  option:selected").val()},function(data,status){
                      var str = "";
                      var list = eval("("+data+")");
                      for(var i=0;i<list.length;i++){
                           str +="<option value='"+list[i].chapterName+"'>"+list[i].chapterName+"</option>";
                      }
                      $("#chapterName2").html(str);
                  });
                });
                
                $("#chapterName2").change(function(){
                    $.post("teacher/question",{chapterName:$("#chapterName2  option:selected").val(),chapterTypeName:$("#chapterTypeName2  option:selected").val()},function(data,status){
                        var str = "";
                        var list = eval("("+data+")");
                        for(var i=0;i<list.length;i++){ 	
                        questionid=list[i].exampaperNumber;
                      	str +="<tr>";
                      	str+="<td><a href='javascritp:void(0);' onclick='addquestion2("+questionid+")' id='addchoosequestion'>添加题目</a></td>"; 
                    	str+="<td><a href='teacher/deletechoose?exampaperNumber="+questionid+";'>删除题目</a></td>"; 
                      	str+="<td>"+list[i].exampaperNumber+"</td>";
                      	str+="<td>"+list[i].question+"</td>";
                      	str+="<td>"+list[i].mykey+"</td>";
                      	str+="<td>"+list[i].trueexplain+"</td>"; 
                      	str+="</tr>";
                        }
                        $("#questiontable2").html(str);
                    });
                  });
                
                
                $(function(){
                    $("#chapterTypeName3").change(function(){
                      $.post("teacher/chapter",
                    		  {chapterTypeName:$("#chapterTypeName3 option:selected").val()},function(data,status){
                          var str = "";
                          var list = eval("("+data+")");
                          for(var i=0;i<list.length;i++){
                               str +="<option value='"+list[i].chapterName+"'>"+list[i].chapterName+"</option>";
                          }
                          $("#chapterName3").html(str);
                      });
                    });
                    
                    $("#chapterName3").change(function(){
                        $.post("teacher/question",{chapterName:$("#chapterName3  option:selected").val(),chapterTypeName:$("#chapterTypeName3 option:selected").val()},function(data,status){
                            var str = "";                       
                            var list = eval("("+data+")");
                            for(var i=0;i<list.length;i++){
                            questionid=list[i].exampaperNumber;
                            var strnumber= new Array();   
                            strnumber=list[i].timekey.split(",");
                            var readinglength=strnumber.length;
                          	str +="<tr>";
                          	str+="<td><a href='javascritp:void(0);' onclick='addquestion3("+questionid+")' id='addchoosequestion'>添加题目</a></td>"; 
                          	str+="<td>"+list[i].exampaperNumber+"</td>";
                          	str+="<td>"+list[i].readingtext+"</td>";
                          	str+="<td name='readinglength'>"+readinglength+"</td>";
                          	str+="</tr>";           
                            }       
                            $("#questiontable3").html(str);
                        });
                      }); 
          });
          });
          });

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
					class="icon icon-user"></i> <span class="text">Profile</span> </a></li>
			<li class="btn btn-inverse dropdown" id="menu-messages"><a
				href="#" data-toggle="dropdown" data-target="#menu-messages"
				class="dropdown-toggle"><i class="icon icon-envelope"></i> <span
					class="text">Messages</span> <span class="label label-important">5</span>
					<b class="caret"></b> </a>
				<ul class="dropdown-menu">
					<li><a class="sAdd" title="" href="#">new message</a></li>
					<li><a class="sInbox" title="" href="#">inbox</a></li>
					<li><a class="sOutbox" title="" href="#">outbox</a></li>
					<li><a class="sTrash" title="" href="#">trash</a></li>
				</ul>
			</li>
			<li class="btn btn-inverse"><a title="" href="#"><i
					class="icon icon-cog"></i> <span class="text">Settings</span> </a></li>
			<li class="btn btn-inverse"><a title="" href="login.html"><i
					class="icon icon-share-alt"></i> <span class="text">Logout</span> </a>
			</li>
		</ul>
	</div>

	<div id="sidebar">
		<a href="#" class="visible-phone"><i class="icon icon-th-list"></i>
			教师主页</a>
		<ul>
			<li><a href="index.jsp"><i class="icon icon-home"></i> <span>教师主页</span>
			</a></li>
			<li class="submenu active open"><a href="#"><i
					class="icon icon-th-list"></i> <span>题库管理</span> <span
					class="label">3</span> </a>
				<ul>
					<li><a href="form-common.jsp">选择题</a></li>
					<li><a href="form-common-reading.jsp">阅读题</a></li>
					<li><a href="form-common-blank.jsp">填空题</a></li>
				</ul>
			</li>
			<li><a href="form-testpaper.jsp"><i class="icon icon-tint"></i>
					<span>组卷管理</span>
			</a>
			</li>
			 <li><a href="teacher/showpaper"><i class="icon icon-pencil"></i> <span>查看试卷</span></a></li>
			   <li><a href="teacher/correctpaper"><i class="icon icon-pencil"></i> <span>批改试卷</span></a></li>
			        <li><a href="teacher/correctpaper2"><i class="icon icon-pencil"></i> <span>信息统计</span></a></li>
			<li><a href="form-information.jsp"><i
					class="icon icon-pencil"></i> <span>信息管理</span>
			</a>
			</li>
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
			<h1>教师管理</h1>
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
			<a href="index.jsp" title="Go to Home" class="tip-bottom"><i
				class="icon-home"></i>组卷管理</a>
		</div>
		<div class="container-fluid">
			<div class="row-fluid">
				<div class="span12">
					<div class="widget-box">
						<div class="widget-title">
							<span class="icon"> <i class="icon-align-justify"></i> </span>
							<h5>Text inputs</h5>
						</div>
						<div class="widget-content nopadding">
							<form action="teacher/inserttextpaper" method="post" class="form-horizontal" id="form1" name="formquestion"   onsubmit="return changearray();" />
							<div class="control-group">
								<label class="control-label">试卷标题</label>
								<div class="controls">
									<input type="text" name="exampaperName"/>
									<input type="hidden" name="chooseNumb"  id="chooseNumb" >
									<input type="hidden" name="blankNumb"  id="blankNumb" >
									<input type="hidden" name="readingNumb"  id="readingNumb" >
								</div>
							</div>
							<div class="control-group">
								<label class="control-label">考试时间(分钟)</label>
								<div class="controls">
									&nbsp;&nbsp;&nbsp;&nbsp; <select style="width:120px" name="exampaperTime">
										<option >30min</option>
										<option >40min</option>
										<option >50min</option>
										<option >60min</option>
										<option >70min</option>
										<option >80min</option>
										<option >90min</option>
										<option >100min</option>
										<option >110min</option>
										<option >120min</option>
									</select>
								</div>
                               </div>
                               
                               <div class="control-group">
								<label class="control-label">试卷总分</label>
								<div class="controls">
									<input type="text" name="fullgrade"/>
								</div>
							</div>
							
							  <div class="control-group">
								<label class="control-label">及格分</label>
								<div class="controls">
									<input type="text" name="passgrade"/>
								</div>
							</div>
                             <div>
								<label class="control-label">参与班级</label>
								<div class="controls">
									<c:forEach items="${teachclass}" var="tea">	&nbsp;&nbsp;&nbsp;&nbsp;
							   		   <input name="joinclass" type="checkbox"
											value="${tea.className }" />${tea.className }	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						   		</c:forEach>
								</div>
							</div>
							
							
					  	<div class="control-group">
								<label class="control-label">题目类型</label>
								<div class="controls">
									&nbsp;&nbsp;&nbsp;&nbsp; 	<select style="width:120px" name="chapterTypeName" id="chapterTypeName">
										<option value="选择" >选择题</option>	
									</select>
									
								</div>
							</div>
               
							<div class="control-group">
								<label class="control-label">选择章节</label>
								<div class="controls">
										&nbsp;&nbsp;&nbsp;&nbsp; <select style="width:120px" name="chapterName" id="chapterName">
										<option value="单词" >单词</option>
										<option value="语法" >语法</option>
										<option value="短语" >短语</option>
									</select>
								</div>
							</div>
								<div class="control-group">
								<label class="control-label">选择题每题分值</label>
								<div class="controls">
										&nbsp;&nbsp;&nbsp;&nbsp; <select style="width:120px" name="choosegrade" id="choosegrade">
										<option value="1" >1分</option>
										<option value="2" >2分</option>
										<option value="3" >3分</option>
										<option value="4" >4分</option>
									</select>
								</div>
							</div>
							
						<div class="widget-box">
							<div class="widget-title">
								<span class="icon">
									<i class="icon-th"></i>
								</span>
								<h5>选择题</h5>
								<span class="label label-info">Featured</span>
							</div>
							<div class="widget-content">
								<table class="table table-bordered table-striped with-check" >
									<thead>
										<tr>
										
											
											<th>添加</th>	
											<th>删除</th>			
											<th>编号</th>			
											<th>题干</th>
											<th>选项A</th>
											<th>选项B</th>
										    <th>选项C</th>
										    <th>选项D</th>
										    <th>正确答案</th>
										    <th>解释</th>
										</tr>
									</thead>
									<tbody id="questiontable">
										<tr>
										    <td><a href="javascritp:void(0);" onclick="addquestion()" id="addchoosequestion">添加题目</a></td>
										    <td><a href="teacher/deletepaper?exampaperId=questionid;">添加题目</a></td>
											<td>Row 1</td>
											<td>Row 2</td>
											<td>Row 3</td>
											<td>Row 4</td>
											<td>Row 5</td>
											<td>Row 6</td>
											<td>Row 7</td>
											<td>Row 8</td>
										     <td>Row 9</td>
										</tr>
									</tbody>
								</table>							
							</div>
						</div>
						
		<!-- 填空题 -->				
						<div class="control-group">
								<label class="control-label">题目类型</label>
								<div class="controls">
									&nbsp;&nbsp;&nbsp;&nbsp; 	<select style="width:120px" name="chapterTypeName" id="chapterTypeName2">
										<option value="填空" >填空题</option>	
									</select>
									
								</div>
							</div>
               
							<div class="control-group">
								<label class="control-label">选择章节</label>
								<div class="controls">
										&nbsp;&nbsp;&nbsp;&nbsp; <select style="width:120px" name="chapterName" id="chapterName2">
										<option value="名词" >名词</option>
										<option value="语法" >语法</option>
										<option value="形容词" >形容词</option>
										<option value="副词" >副词</option>
									</select>
								</div>
							</div>
								<div class="control-group">
								<label class="control-label">填空题每题分值</label>
								<div class="controls">
										&nbsp;&nbsp;&nbsp;&nbsp; <select style="width:120px" name="blankgrade" id="choosegrade2">
										<option value="1" >1分</option>
										<option value="2" >2分</option>
										<option value="3" >3分</option>
										<option value="4" >4分</option>
									</select>
								</div>
							</div>
							
						<div class="widget-box">
							<div class="widget-title">
								<span class="icon">
									<i class="icon-th"></i>
								</span>
								<h5>填空题</h5>
								<span class="label label-info">Featured</span>
							</div>
							<div class="widget-content">
								<table class="table table-bordered table-striped with-check" >
									<thead>
										<tr>
											<th></th>
											<th>编号</th>			
											<th>题干</th>										
										    <th>正确答案</th>
										    <th>解释</th>
										</tr>
									</thead>
									<tbody id="questiontable2">
										<tr>
										   <td><a href="javascritp:void(0);" onclick="addquestion2()" id="addchoosequestion">添加题目</a></td>
											<td>Row 1</td>	
											<td>Row 2</td>											
											<td>Row 6</td>
											<td>Row 7</td>
										</tr>
									</tbody>
								</table>							
							</div>
						</div>
						
						
		<!-- 阅读题 -->				
						<div class="control-group">
								<label class="control-label">题目类型</label>
								<div class="controls">
									&nbsp;&nbsp;&nbsp;&nbsp; 	<select style="width:120px" name="chapterTypeName" id="chapterTypeName3">
										<option value="阅读" >阅读题</option>	
									</select>
									
								</div>
							</div>
               
							<div class="control-group">
								<label class="control-label">选择章节</label>
								<div class="controls">
										&nbsp;&nbsp;&nbsp;&nbsp; <select style="width:120px" name="chapterName" id="chapterName3">
										<option value="社会" >社会类</option>
										<option value="经济" >经济类</option>
										<option value="科技" >科技类</option>
										<option value="故事" >故事类</option>
									</select>
								</div>
							</div>
								<div class="control-group">
								<label class="control-label">阅读题每题分值</label>
								<div class="controls">
										&nbsp;&nbsp;&nbsp;&nbsp; <select style="width:120px" name="readinggrade" id="choosegrade3">
										<option value="1" >1分</option>
										<option value="2" >2分</option>
										<option value="3" >3分</option>
										<option value="4" >4分</option>
									</select>
								</div>
							</div>
							
						<div class="widget-box">
							<div class="widget-title">
								<span class="icon">
									<i class="icon-th"></i>
								</span>
								<h5>阅读题</h5>
								<span class="label label-info">Featured</span>
							</div>
							<div class="widget-content">
								<table class="table table-bordered table-striped with-check" >
								       
									<thead>
									
										<tr>
											<th></th>
											<th>编号</th>	
								            <th>题干</th>
										    <th>题目个数</th>
									
										</tr>
									</thead>
									<tbody id="questiontable3">
										<tr>
										   <td><a href="javascritp:void(0);" onclick="addquestion3()"  id="addchoosequestion">添加题目</a></td>
								            <td>Row 1</td>
										    <td>Row 2</td>
										    <td name="readinglength">Row 2</td>
										</tr>
									</tbody>
								</table>							
							</div>
						</div>
						
	
						
				<div class="widget-box" id="numberquestion">
			            <div class="widget-title">
							<span class="icon"> <i class="icon-align-justify"></i> </span>
							<h5>所选题目</h5>
						</div>
			     
	             </div>
						
						

							<div class="form-actions">
								<button type="submit" class="btn btn-primary" >Save</button>
							</div>
							</form>
						</div>
					</div>
				</div>
			</div>
         
            <script src="js/jquery.min.js"></script>
            <script src="js/jquery.ui.custom.js"></script>
            <script src="js/bootstrap.min.js"></script>
            <script src="js/jquery.uniform.js" ></script>
            <script src="js/select2.min.js"></script>
            <script src="js/jquery.validate.js"></script>
            <script src="js/unicorn.js"></script>
            <script src="js/unicorn.form_validation.js"></script>
	</body>
</html>
