package Day6BankApp;

import java.util.Scanner;

public class user {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("------------Welcome to ICICI bank of India-------------\n\n");
		ATM atm=new ATM();

		while(true) {
			System.out.println("************ Choose the Options according to your Need************\n\n");
			System.out.println("1.Deposit Amount \n2.Check Balance\n3.With Draw Amount\n4.Exit \n");
			int option=sc.nextInt();
			
			switch(option) {
			case 1:
				atm.deposit(500);
				break;
			case 2:
				atm.checkBalance();
				break;
			case 3:
				atm.withdraw(500);
				break;
			case 4:
				System.out.println("Now,You are Exited from the process!");
			default:
				System.out.println("Hope you had a great Experience!");
			}
	}

	}
}
