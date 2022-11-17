package day2;
import java.util.Scanner;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// arithmetic operators
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("Sum of 2 Numbers is"+(num1+num2));
		System.out.println("Difference of 2 Numbers is"+(num1-num2));
		System.out.println("Product of 2 Numbers is"+(num1*num2));
		System.out.println("Division of 2 Numbers is"+(num1/num2));
		System.out.println("Modules of 2 Numbers is"+(num1%num2));

	}

}
