package com.revature;

import java.util.Scanner;

public class Register {
	
	private static Scanner scaner = new Scanner(System.in);
	
	System.out.println("Please enter a username");
	String userName = scaner.nextLine();
	
	System.out.println("Please enter a password");
    	String password = scaner.nextLine();
	
	if(username.equals("userName")&& password.equals("password")) {
		
		System.out.println("You are successfully login");
	}
	else {
		System.out.println("Invalid username and passwrod please try again");
	}
  }
}