import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] num = new int[n];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = 0;
		}
		
		for(int i = 0; i < m; i++) {
			int j = sc.nextInt();
			int k = sc.nextInt();
			int p = sc.nextInt();
			
			for(int q = j - 1; q < k; q++) {
				num[q] = p;
			}
		}
		
		for(int i = 0; i < n; i++) {
			System.out.print(num[i] + " ");
		}
		sc.close();
	}
}