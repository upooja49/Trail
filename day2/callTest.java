package day2;

import java.util.Scanner;

public class callTest {

	public static void main(String[] args) {
		call cl = new call();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		cl.a = num1;
		cl.b = num2;
		System.out.println("Sum of 2 numbers is" + (num1 + num2));
		System.out.println(num1 + num2);

	}

}
