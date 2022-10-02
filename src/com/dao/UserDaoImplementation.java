package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.entity.User;

public class UserDaoImplementation implements UserDao
{

	@Override
	public List<User> viewUser() throws ClassNotFoundException, SQLException {
		ArrayList<User>userList=new ArrayList<User>();
		Class.forName("com.mysql.jdbc.Driver");//load the driver
		//create the connection 
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/projectdb","Anjali","Anjali@8910");
		
		//create the statement
		PreparedStatement statement =con.prepareStatement("select * from userdata");
		ResultSet rs=statement.executeQuery();
		
		while(rs.next())
		{
			User u=new User();
			u.setUserid(rs.getInt(1));
			System.out.println(" ");
			u.setUsername(rs.getString(2));
			u.setPassword(rs.getString(3));
			userList.add(u);
		
	}
		return userList;
	}

	@Override
	public void insertNewUser(User u) throws ClassNotFoundException, SQLException {
		int row=0;
		Class.forName("com.mysql.jdbc.Driver");//load the driver
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/projectdb","Anjali","Anjali@8910");
		PreparedStatement statement =con.prepareStatement("insert into userdata values(?,?,?)");
		statement.setInt(1, u.getUserid());
		statement.setString(2, u.getUsername());
		statement.setString(3, u.getPassword());
		
		row=statement.executeUpdate();
		
	}

	@Override
	public void updateUser(User u) throws ClassNotFoundException, SQLException {
		int row=0;
		Class.forName("com.mysql.jdbc.Driver");//load the driver
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/projectdb","Anjali","Anjali@8910");
		PreparedStatement statement =con.prepareStatement("update userdata set username=?,password=? where userid=?");
		;
		statement.setString(1, u.getUsername());
		statement.setString(2, u.getPassword());
		statement.setInt(3, u.getUserid());
		row=statement.executeUpdate();
		
	}

	@Override
	public void deleteUser(User u) throws ClassNotFoundException, SQLException {
		int row=0;
		Class.forName("com.mysql.jdbc.Driver");//load the driver
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/projectdb","Anjali","Anjali@8910");
		PreparedStatement statement =con.prepareStatement("delete from userdata where userid=?");
		
		
		statement.setInt(1, u.getUserid());
		row=statement.executeUpdate();
		
	}

	
}
