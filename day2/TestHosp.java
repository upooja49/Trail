package day2;
import java.util.Scanner;

public class TestHosp {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		Hospital hosp=new Hospital();
		
		System.out.println("Enter Hospital Name:");
		String nameOfHospital=sc.next();
		hosp.nameOfHospital=nameOfHospital;
		
		System.out.println("Number of patients in Hospital?");
		int numberOfPatients=sc.nextInt();
		hosp.numberOfPatients=numberOfPatients;
		
		
		System.out.println(hosp.nameOfHospital);
		
		//int numberOfPatients;
		//hosp.numberOfPatients=numberOfPatients;
		System.out.println(hosp.numberOfPatients);
	}

}
