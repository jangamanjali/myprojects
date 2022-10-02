package com.view;

import java.sql.SQLException;
import java.util.Scanner;

import com.service.InsuranceService;
import com.service.UserService;

public class AppMain {

	public static void main(String[] args)  throws ClassNotFoundException, SQLException {

		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("Welcome to UserManagement");
		System.out.println("1.View User Data");
		System.out.println("2.Insert User Data");
		System.out.println("3.Update User Data");
		System.out.println("4.Delete User data");
		
		System.out.println("5.View Insurance Data");
		System.out.println("6.Insert Insurance Data");
		System.out.println("7.Update Insurance Data");
		System.out.println("8.Delete Insurance data");
		do
		{
			System.out.println("enter the choice");
			
			int choice =sc.nextInt();
			switch(choice)
			{
				case 1:
					new UserService().viewData();
					break;
				case 2:
					 new UserService().insertUser();
					 break;
				case 3:
					new UserService().UpdateUser();
					  break;
				case 4:
					new UserService().deleteUser();
					break;
				case 5:
					new InsuranceService().viewInsuranceDetails();
					break;
				case 6:
					 new InsuranceService().insertInsuranceDetails();
					 break;
				case 7:
					new InsuranceService().UpdateInsurance();
					  break;
				case 8:
					new InsuranceService().deleteInsurance();
					break;
			}
			System.out.println("\n do you want to continue");
	        s=sc.next();
		}while(s.equals("y"));
	}
	

}
