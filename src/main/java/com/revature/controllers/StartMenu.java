package com.revature.controllers;
		
import java.util.Scanner;

import com.revature.model.Customer;
		
public class StartMenu {
private static Scanner keyboard = new Scanner(System.in);


public void runMenu() {
	boolean exit;
	
	
	
	printHeader();
	
	while (!exit)
	printMenu();
	int choice = getInput();
	performAction(choice);
	
}


private void printHeader() {
	System.out.println("===================================");
	System.out.println("         Welcome to T-Bank         ");
	System.out.println("       Save, Secure, Connect       ");
	System.out.println("===================================");
	
}


private void printMenu() {
	System.out.println("please make a selection");
	System.out.println("1) Create a new Account");
	System.out.println("2) deposit");
	System.out.println("3) withdraw");
	System.out.println("4) Account balance");
	System.out.println("0) Exit");
	
}

private int getInput() {
	int choice  = -1;
	do {
		System.out.println("Enter your choice:");
		try {
			choice = Integer.parseInt(keyboard.nextLine());
		}
		catch(NumberFormatException e){
				System.out.println("Invalid selection.Numbers only please");
		}
		if(choice < 0 || choice > 4) {
			System.out.println("Choice outside of range. please choice again");
		   }
	}while(choice <0||choice > 4);
	return choice;
}
private void performAction(int choice) {
	
	switch(choice) {
	case 0:
		System.out.println("Thank you for use T-bank");
		System.exit(0);
		break;
		
	case 1:
		//Create_account();
		break;
	case 2: 
			//deposit();
		break;	
	case 3:
			//withdraw();
			break;
	case 4:
			//Account balance
			break;
			
			default:
				System.out.println("");
	}
	
}


}
			
			
			
			
								
			
		
		
