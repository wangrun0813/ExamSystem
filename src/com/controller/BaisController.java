package com.controller;

import javax.annotation.Resource;

import com.service.TeacherService;
import com.service.UserService;

public class BaisController {
	@Resource
	protected UserService userServiceImpl;
	@Resource
	protected TeacherService teacherServiceImpl;
}
