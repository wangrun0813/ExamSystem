package com.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.entity.TeacherTable;
import com.entity.UserTable;

import com.service.impl.UserServiceImpl;

@Controller
@RequestMapping(value="user",produces={"application/json;charset=UTF-8"})
public class UserController extends BaisController {

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(UserTable user ,HttpServletRequest request) {
		if (userServiceImpl.login(user.getId(), user.getPassword())) {
			request.getSession().setAttribute("teacher",userServiceImpl.findTeacher(user.getId()));
			request.getSession().setAttribute("teachclass",teacherServiceImpl.chooseClass(user.getId()));
    //        request.getSession().setAttribute("textpaperlist",teacherServiceImpl.showtestpaper() );
			return "index";
		} else {
			return "login";
		}
	}
}
