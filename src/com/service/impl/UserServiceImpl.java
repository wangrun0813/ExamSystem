package com.service.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.impl.UserTableDAOimpl;
import com.entity.TeacherTable;
import com.entity.UserTable;
import com.service.UserService;
@Service
@Transactional
public class UserServiceImpl extends BasicService implements UserService{
	
	@Override
	public boolean login(String id, String password) {
		// TODO Auto-generated method stub
		UserTable user= userTableDAO.findById(id);
		
		if(user.getPassword().equals(password)){
			return true;
		}
		return false;		
	}

	@Override
	public UserTable findUser(String id, String pswd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TeacherTable findTeacher(String id) {
		// TODO Auto-generated method stub
		TeacherTable teacherTable=teacherTableDao.findById(id);
		return teacherTable;
	}

	@Override
	public void change_password(UserTable userTable) {
		// TODO Auto-generated method stub
		userTableDAO.updatePswd(userTable);
	}
}
