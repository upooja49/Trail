package day3;
import java.util.Scanner;

public class StudentAttendance {

	public static void main(String[] args) {
		Scanner mn=new Scanner(System.in);
		int totalClasses,attendedClass;
		float x;
		System.out.println("Enter Total number of classes: ");
		totalClasses=mn.nextInt();
		System.out.println("Enter number of classes attended:");
		attendedClass=mn.nextInt();
		x=(attendedClass*100)/totalClasses;
		if(x>=75) {
	System.out.println("You are allowed for exam");
		}else  {
			System.out.println("you are not allowed for exam");
		}
		System.out.println("Do you have Medical issues?");
		String response=mn.nextLine();
		 if (response.equals("yes"))
		{
			System.out.println("you are allowed");
		}else
			{
			System.out.println("you are not allowed");
			}
		


	}

}
