import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h1 = sc.nextInt();
		int b1 = sc.nextInt();
		
		int h2 = sc.nextInt();
		int b2 = sc.nextInt();
		
		int player1Score = h1 * 3 + b1;
		int player2Score = h2 * 3 + b2;
		int n;
		
		if(player1Score > player2Score) {
			n = player1Score - player2Score;
			System.out.println("1 " + n);
		}else if(player1Score < player2Score) {
			n = player2Score - player1Score;
			System.out.println("2 " + n);
		}else if(player1Score == player2Score) {
			System.out.println("NO SCORE");
		}
		sc.close();
	}
}