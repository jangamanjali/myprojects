package com.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.dao.InsuranceDaoImplementation;
import com.dao.UserDaoImplementation;
import com.entity.Insurance;
import com.entity.User;


public class InsuranceService {
	public void viewInsuranceDetails() throws ClassNotFoundException, SQLException
	{
		List<Insurance>insuranceList=new  InsuranceDaoImplementation().viewInsuranceDetails();
		for(Insurance i:insuranceList)
		{
			System.out.println("\n=============================User Data================");
			System.out.print(i.getId());
			System.out.println(" ");
			System.out.print(i.getInsuranceProvider());
			System.out.println(" ");
			System.out.print(i.getInsuranceNumber());
			System.out.println(" ");
			System.out.print(i.getValidDate());
			
			
		}
	}
	
	public void insertInsuranceDetails() throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Insurance id");
		int id=sc.nextInt();
		System.out.println("enter the Insurance Provider Name");
		String insuranceprovider=sc.next();
		System.out.println("enter the Insurance Number");
		Long insurancenumber=sc.nextLong();
		System.out.println("enter the Validity Date");
		String validdate=sc.next();
		
		Insurance i=new Insurance();
		i.setId(id);
		i.setInsuranceProvider(insuranceprovider);
		i.setInsuranceNumber(insurancenumber);
		i.setValidDate(validdate);
		new InsuranceDaoImplementation().insertInsuranceDetails(i);
	}

	public void UpdateInsurance() throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Insurance Provider Name");
		String insuranceProvider=sc.next();
		System.out.println("Enter the Insurance Number");
		String insuranceNumber=sc.next();
		System.out.println("Enter the Validity Date");
		String validDate=sc.next();
		System.out.println("enter the Id");
		int id=sc.nextInt();
		
		Insurance i=new Insurance();
		i.setInsuranceProvider(insuranceProvider);
		i.setInsuranceProvider(insuranceNumber);
		i.setValidDate(validDate);
	
		new InsuranceDaoImplementation().updateInsurance(i);
	}
	
	
	public void deleteInsurance() throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Id");
		int id=sc.nextInt();
		
		Insurance i = new Insurance();
		i.setId(id);
		new InsuranceDaoImplementation().deleteInsurance(i);
	}
}
