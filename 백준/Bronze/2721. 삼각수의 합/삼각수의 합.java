import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		for(int i = 0; i < testCase; i++) {
			int n = sc.nextInt();
			int[] t = new int[n + 1];
			int[] T = new int[n + 1];
			int W = 0;
			
			for(int j = 0; j <= n; j++) {
				t[j] = j + 1;
			}
			
			for(int j = 0; j <= n; j++) {
				T[j] = 0;
			}
			
			for(int j = 0; j <= n; j++) {
				for(int k = 0; k <= j; k++) {
					T[j] += t[k];
				}
			}
			
			for(int j = 0; j <= n; j++) {
				W += j * T[j];
			}

			System.out.println(W);
		}
		sc.close();
	}
}