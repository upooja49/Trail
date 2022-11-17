package day3;

import java.util.Scanner;

public class ATMWithdrawal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double accountNumber, phoneNumber;
		int pinNumber, amount;
		System.out.println("Enter Account Number:");
		accountNumber = s.nextInt();
		System.out.println("Enter PIN Number:");
		pinNumber = s.nextInt();
		System.out.println("Enter Phone Number");
		phoneNumber = s.nextInt();
		if((pinNumber==9876) || (phoneNumber==9876656678d)) {
			System.out.println("Enter the withdrawal amount:");
			amount=s.nextInt();
			System.out.println("withdrawal Successfull");
		}
		else
			System.out.println("Enter valid details!");
	}

}
