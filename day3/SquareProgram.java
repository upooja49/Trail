package day3;
import java.util.Scanner;
public class SquareProgram {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int length,breadth;
		System.out.println("Enter length & breadth");
		length=s.nextInt();
		breadth=s.nextInt();
		if(length==breadth)
			System.out.println("It is a Square");
		else
			System.out.println("It is not a square.");
	}

}
