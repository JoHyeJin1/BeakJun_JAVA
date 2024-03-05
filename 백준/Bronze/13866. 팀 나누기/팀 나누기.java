import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int teamA, teamB, difference, min;
		
		teamA = a + b;
		teamB = c + d;
		if(teamA > teamB) {
			difference = teamA - teamB;
		}else {
			difference = teamB - teamA;
		}
		min = difference;
		
		teamA = a + c;
		teamB = b + d;
		if(teamA > teamB) {
			difference = teamA - teamB;
		}else {
			difference = teamB - teamA;
		}
		if(difference < min) {
			min = difference;
		}
		
		teamA = a + d;
		teamB = b + c;
		if(teamA > teamB) {
			difference = teamA - teamB;
		}else {
			difference = teamB - teamA;
		}
		if(difference < min) {
			min = difference;
		}
		
		System.out.println(min);
		sc.close();
	}
}
