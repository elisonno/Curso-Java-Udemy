package application;

import java.util.Scanner;

import entities.BankAccount;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name, account;
		double balance = 0;
		char option;
		
		System.out.println("Enter account number:");
		account = sc.nextLine();
		
		System.out.println("Enter account holder:");
		name = sc.nextLine();
		
		System.out.println("Is there na initial deposit (y/n)?");
		option = sc.next().charAt(0);
		
		if(option == 'y') {
			System.out.println("Enter initial deposit value: ");
			balance = sc.nextDouble();
		}
		BankAccount account_1 = (option == 'y') ? new BankAccount(account, name, balance) : new BankAccount(account, name);
		System.out.println("Account data:\n" + account_1);
		
		System.out.println("Enter a deposit value:");
		account_1.depositValue(sc.nextDouble());
		System.out.println("Updated account data:\n" + account_1);
		
		System.out.println("Enter a withdraw value:");
		account_1.withdrawValue(sc.nextDouble());
		System.out.println("Updated account data:\n" + account_1);
				
		
		sc.close();

	}

}
