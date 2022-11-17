package day3;
import java.util.Scanner;

public class MedicalCause {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Do you have Medical issues?");
		String response=s.nextLine();
		 if (response.equals("yes"))
		{
			System.out.println("you are not allowed");
		}else
			{
			System.out.println("you are allowed");
			}
	}

}
