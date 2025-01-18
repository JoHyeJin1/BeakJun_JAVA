import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] num = new int[n];
		
		for(int i = 0; i < n; i++) {
			num[i] = i + 1;
		}
		
		for(int i = 0; i < m; i++) {
			int p = sc.nextInt();
			int q = sc.nextInt();
			int temp = num[p - 1];
			num[p - 1] = num[q - 1];
			num[q - 1] = temp;
		}
		
		for(int i = 0; i < n; i++) {
			System.out.print(num[i] + " ");
		}
		sc.close();
	}
}