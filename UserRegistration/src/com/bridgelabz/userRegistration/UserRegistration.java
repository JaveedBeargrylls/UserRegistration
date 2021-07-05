package com.bridgelabz.userRegistration;

import java.util.Scanner;
import java.util.regex.Pattern;

class  Verify
{
	Scanner sc = new Scanner(System.in);
	
	public String userName;
	private String userNameRegex;
	
	public void userName()
	{
		userNameRegex = "[A-Z][a-z]{2,}";
		
		System.out.println("Enter First Name of User \nStart with UpperCase ");
		userName = sc.next();
		
		Pattern pt = Pattern.compile(userNameRegex);
		
		if(userName.matches(userNameRegex))
		{
			System.out.println("Name is Valid");
		}
		else
		{
			System.out.println("Name is not Valid \nRe-Enter Valid name");
		}
	}
}

public class UserRegistration {
	public static void main(String[] args) {
		System.out.println("User Registration");
		
		Verify obj = new Verify();
		
		obj.userName();
			}

}
