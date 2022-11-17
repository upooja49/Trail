package day3;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		long accountNumber;
		int aadharNumber = 45678, transactionPin = 1234, password = 9876;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account Holder Name:");
		String accountHolderName = sc.next();

		if ((accountHolderName.trim() != null) && (accountHolderName.length() > 3)) {
			System.out.println("Enter acc num:");
			accountNumber = sc.nextLong();
			System.out.println("Enter Aadhar Number:");
			aadharNumber = sc.nextInt();
			if (aadharNumber == 45678) {
				System.out.println("Enter transaction pin and Password");
				transactionPin = sc.nextInt();
				password = sc.nextInt();
				if ((transactionPin == 1234) && (password == 9876)) {
					System.out.println("Successful Transaction");

				} else {

					System.out.println("Enter valid account Name");
				}
			}

		}
	}
}