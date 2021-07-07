package com.bridgelabz.userRegistration;

import java.util.Scanner;
import java.util.regex.*;

class  Verify
{
	Scanner sc = new Scanner(System.in);
	
	public String firstName;
	public String lastName;
	private String userNameRegex;
	private String email;
	private String emailRegex;
	private String mobile;
	private String mobileRegex;
	
	public void userName()
	{
		userNameRegex = "[A-Z][a-z]{2,}";
		
		// Validation of First Name
		
		System.out.println("Enter First Name of User \nStart with UpperCase ");
		firstName = sc.next();
		
		// Validation of Last Name
		
		System.out.println("Enter Last Name of User \nStart with UpperCase ");
		lastName = sc.next();
		
		Pattern pt = Pattern.compile(userNameRegex);
		
		if(firstName.matches(userNameRegex) && lastName.matches(userNameRegex))
		{
			System.out.println("Name is Valid");
			
			System.out.println("UserName = "+firstName+" "+lastName);
		}
		else
		{
			System.out.println("Name is not Valid"); //\nRe-Enter Valid name\n Check the First name or Last name ");
			if(firstName.matches(userNameRegex))
			{
				System.out.println("You Entered the Invalid LastName");
			}
			else
			{
				System.out.println("You Entered the Invalid FirstName");
			}
		}
	}
	
	public void emailValidation()
	{
		emailRegex = "^[a-zA-Z0-9-]+[\\.[a-zA-Z0-9]]*@[a-z]{1,7}[\\.[a-z]]*";
		
		//Email id
		
		System.out.println("Enter the valid Email id : ");
		email = sc.next();
		
		Pattern pt = Pattern.compile(emailRegex);
		
		// validation
		
		if(email.matches(emailRegex))
		{
			System.out.println("Email is Valid");
			System.out.println("Email = "+email);
		}
		else
		{
			System.out.println("Email is Not Valid");
		}
	}
	
	public void mobileNumber()
	{
		
		mobileRegex = "[\\+](0|1|91)?[6-9][0-9]{9}";
		System.out.println("Enter the Valid Mobile Number with Country Code : ");
		mobile = "+"+sc.next();
		
		if(mobile.matches(mobileRegex))
		{
			System.out.println("Mobile Number is Valid");
			System.out.println("Mobile Number = "+mobile);
		}
		else
		{
			System.out.println("MobileNumber is Not Valid");
		}
		
	}
}


public class UserRegistration {
	public static void main(String[] args) {
		System.out.println("User Registration");
		
		Verify obj = new Verify();
		
		obj.userName();
		obj.emailValidation();
		obj.mobileNumber();
		}

}
