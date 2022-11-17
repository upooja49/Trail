package day3;

import java.util.Scanner;

public class Purchase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Purchased Quantity:");
		int a = sc.nextInt();
		if ((a * 100) > 1000)
			System.out.println("you will get a discount of " + (a * 100 * 0.1) + "on purchased product");
		else
			System.out.println("No discount on your product");

	}

}
