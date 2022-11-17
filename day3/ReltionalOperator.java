package day3;
import java.util.Scanner;

public class ReltionalOperator {

	public static void main(String[] args) {
		int age;
		String citizenship="Indian";
		System.out.println("Enter your age:");
		Scanner sc=new Scanner(System.in);
		int userAge=sc.nextInt();
		if(userAge>18) {
			System.out.println("enter nationality:");
			String nationality=sc.next();
			if(nationality.equals("Indian")) {
				System.out.println("Enter your State");
				String state=sc.next();
				if(state.equals("TamilNadu")||(state.equals("Pondy"))) {
					System.out.println("user is eligible.");
					
				}
				else if (state.equals("Andhra")) {
				
					System.out.println("No elections.");
				}
				else
				    System.out.println("You are not Indian");
		
	
		} 
			else {
			System.out.println("Not Eligible");

	}

}
}
	
}