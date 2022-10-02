package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.entity.User;

public interface UserDao 
{
	
	public List<User>viewUser() throws ClassNotFoundException, SQLException;
	public void insertNewUser(User u) throws ClassNotFoundException, SQLException;
	public void updateUser(User u) throws ClassNotFoundException, SQLException;
    public void deleteUser(User u) throws ClassNotFoundException, SQLException;
}
