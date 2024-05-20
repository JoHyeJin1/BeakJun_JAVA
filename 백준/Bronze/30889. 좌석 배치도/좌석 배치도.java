import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[][] seat = new String[10][20];
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 20; j++) {
				seat[i][j] = ".";
			}
		}
		
		int seatH;
		int seatNum;
		for(int i = 0; i < n; i++) {
			String a = sc.next();
			seatH = a.charAt(0) - 65;
			seatNum = a.charAt(1) - 48;
			int d;
			if(a.length() == 3) {
				d = a.charAt(2) - 48;
				seatNum *= 10;
				seatNum += d;
			}
			seat[seatH][seatNum - 1] = "o";
		}
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 20; j++) {
				System.out.print(seat[i][j]);
			}
			System.out.println();
		}
		sc.close();
	}
}