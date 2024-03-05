import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int[][] a = new int[15][15];
		for(int i = 0; i < 15; i++) {
			a[0][i] = i;
		}
		
		for(int i = 1; i < 15; i++) {
			for(int j = 1; j < 15; j++) {
				a[i][j] = a[i][j - 1] + a[i - 1][j];
			}
		}

		for(int p = 0; p < t; p++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			
			System.out.println(a[k][n]);
		}
		sc.close();
	}
}