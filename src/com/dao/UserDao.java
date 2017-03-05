package com.dao;

import java.util.List;

import com.entity.UserTable;

public interface UserDao {
    public void addUser(UserTable userTable); 
    
    public List<UserTable> getUsers();
    
    public UserTable getUser(int id);
    
    public void update(UserTable userTable);
    
    public void delete(UserTable userTable);
    
    public void repwd(UserTable userTable) ;
    
}
