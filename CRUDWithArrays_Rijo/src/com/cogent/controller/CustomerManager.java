package com.cogent.controller;

import java.util.Scanner;

import com.cogent.bean.CustomerBean;
import com.cogent.repo.CustomerRepo;

public class CustomerManager {

	public static void main(String[] args) {
		 
		CustomerRepo cr = new CustomerRepo(); 
		
		while(true) {
		
		System.out.println("******************************************");
		System.out.println("CUSTOMER MANAGEMENT SYSTEM");
		System.out.println("******************************************");
		System.out.println("1. Add Customer");
		System.out.println("2. View All Customer");
		System.out.println("3. Search Customer by Id");
		System.out.println("4. Exit");
		
		
		Scanner input = new Scanner(System.in); 
		
		int menuNum = input.nextInt(); 
		 
		
		switch(menuNum) {
		
		case 1: 
			
			String option = ""; 
			do {
			System.out.println("User Selected 1");
			System.out.println("Please enter customer Id");
			int customerID = input.nextInt(); 
			System.out.println("Please enter customer name");
			input.nextLine();
			String customerName = input.nextLine();
			 
			CustomerBean cb = new CustomerBean(customerID, customerName);
			cr.addCustomer(cb);
			System.out.println("Customer Added successfully");
			System.out.println("Do you want to add more Customer? Press Y or N");
			option = input.nextLine(); 
			}while(option.equals("Y"));
			break; 
			
		case 2: 
			String option2 =""; 
			do {
			System.out.println("User selected 2");
			
			cr.viewAllCustomer(); 
			
			System.out.println("Press N to exit and Y to Back to main Menu");
			input.nextLine();
			option2 = input.nextLine();
			}while(option2.equals("N"));
			break; 
			
			
		case 3: 
			String option3 = ""; 
			do {
			System.out.println("User select 3");
			System.out.println("Enter the Customer ID");
			int customerID = input.nextInt(); 
			CustomerBean searchingCust = cr.searchCustomerById(customerID); 
			if(searchingCust == null) {
				System.out.println("Customer Does not exist");
			}
			//input.nextLine();
			option3 = input.nextLine();
			}while(option3.equals("Y"));
			break;
			
		case 4:
			System.out.println("Thank you!");
			System.exit(0);
			break; 
			
		default:
			System.out.println("Please enter a valid option");
			System.out.println();
			
		}
		
		

	}
		
	}

}
