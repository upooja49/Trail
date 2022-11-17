package day3;

import java.util.Scanner;

public class LoanCalculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Principle amount");
		int amt = s.nextInt();
		System.out.println("Enter interest percentage");
		int ip=s.nextInt();
		System.out.println("Enter term:");
		int term=s.nextInt();
		int rate=(amt/ip)*term;
		System.out.println("Rate of interest"+rate);
		int total=amt+rate;
		System.out.println("Total amount:"+total);
		int month=total/(term*12);
		System.out.println("Paid per month:"+month);
		for(int i=total;i>=0;i-=month)
		{
			System.out.println(""+i);
			
		}
		

	}

}
