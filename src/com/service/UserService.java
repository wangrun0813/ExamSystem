package com.service;

import java.util.List;

import com.entity.TeacherTable;
import com.entity.UserTable;


public interface UserService {
 
	public UserTable findUser(String id,String pswd);

	boolean login(String id, String password);

	public TeacherTable findTeacher(String id);
	
	public void change_password(UserTable userTable);
}
