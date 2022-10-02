package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.entity.Insurance;

public class InsuranceDaoImplementation implements InsuranceDao
{

	@Override
	public List<Insurance> viewInsuranceDetails() throws ClassNotFoundException, SQLException {
		ArrayList<Insurance>insuranceList=new ArrayList<Insurance>();
		Class.forName("com.mysql.jdbc.Driver");//load the driver
		//create the connection 
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/projectdb","Anjali","Anjali@8910");
		
		//create the statement
		PreparedStatement statement =con.prepareStatement("select * from insurancedata");
		ResultSet rs=statement.executeQuery();
		
		while(rs.next())
		{
			Insurance i=new Insurance();
			i.setId(rs.getInt(1));
			System.out.println(" ");
			i.setInsuranceProvider(rs.getString(2));
			i.setInsuranceNumber(rs.getLong(3));
			i.setValidDate(rs.getString(4));
			insuranceList.add(i);
		
	}
		return insuranceList;
	}

	@Override
	public void insertInsuranceDetails(Insurance i) throws ClassNotFoundException, SQLException {
		int row=0;
		Class.forName("com.mysql.jdbc.Driver");//load the driver
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/projectdb","Anjali","Anjali@8910");
		PreparedStatement statement =con.prepareStatement("insert into insurancedata values(?,?,?,?)");
		statement.setInt(1, i.getId());
		statement.setString(2, i.getInsuranceProvider());
		statement.setLong(3, i.getInsuranceNumber());
		statement.setString(4, i.getValidDate());
		
		row=statement.executeUpdate();
		
	}

	@Override
	public void updateInsurance(Insurance i) throws ClassNotFoundException, SQLException {
		int row=0;
		Class.forName("com.mysql.jdbc.Driver");//load the driver
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/projectdb","Anjali","Anjali@8910");
		PreparedStatement statement =con.prepareStatement("update insurancedata set insuranceProvider=?,insuranceNumber=?,validDate=? where id=?");
		
		statement.setString(1, i.getInsuranceProvider());
		statement.setLong(2, i.getInsuranceNumber());
		statement.setString(3, i.getValidDate());
		statement.setInt(4, i.getId());
		row=statement.executeUpdate();

		
		
	}

	@Override
	public void deleteInsurance(Insurance i) throws ClassNotFoundException, SQLException {
		int row=0;
		Class.forName("com.mysql.jdbc.Driver");//load the driver
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/projectdb","Anjali","Anjali@8910");
		PreparedStatement statement =con.prepareStatement("delete from insurancedata where id=?");
		
		
		statement.setInt(1, i.getId());
		row=statement.executeUpdate();
		
	}
}
