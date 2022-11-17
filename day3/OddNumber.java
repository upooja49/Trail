package day3;
import java.util.Scanner;

public class OddNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number to be checked:");
		int i=s.nextInt();
		if(i%2==0) {
			System.out.println(i+"is a Even Number.");
		
		}else
		System.out.println(i+"is an Odd Number.");

	}

}
