package day3;
import java.util.Scanner;

public class CricketScore {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String teamA,teamB;
	int score;
	System.out.println("Enter Team names:");
	teamA=sc.nextLine();
	teamB=sc.nextLine();
	System.out.println("Enter Target Score: ");
	score=sc.nextInt();
	if(score>250)
		System.out.println("Team A is the winner.");
	else if(score<250)
		System.out.println("Team B is the winner.");
	else 
		System.out.println("Match Draw");
	
				

	}

}
