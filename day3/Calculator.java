package day3;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		// declaring variables
		int a,b,c;
		char op;
		System.out.println("Enter two numbers");
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("Enter the operation that you want to perform(+,-,*,/,% :");
		op=s.next().charAt(0);
		if(op=='+') {
			c=a+b;
			System.out.println(c);
		}
		else if(op=='-') {
			c=a-b;
			System.out.println(c);
		}
		else if(op=='*') {
			c=a*b;
			System.out.println(c);
		}
		else if(op=='/') {
			c=a/b;
			System.out.println(c);
		}
		else if(op=='%') {
			c=a%b;
			System.out.println(c);
		}
		else
			System.out.println("Please enter valid data."
					+ "");
		
		

	}

}
