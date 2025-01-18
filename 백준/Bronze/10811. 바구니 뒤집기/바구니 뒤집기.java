import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] num = new int[n];
		int[] newNum = new int[n];
		
		for(int i = 0; i < n; i++) {
			num[i] = i + 1;
			newNum[i] = num[i];
		}
		
		for(int i = 0; i < m; i++) {
			int p = sc.nextInt();
			int q = sc.nextInt();
			for(int j = 0; j < (q - p + 1) / 2; j++) {
				int temp = num[q - j - 1];
				num[q - j - 1] = num[p + j  - 1];
				num[p + j - 1] = temp;
			}
		}
		
		for(int i = 0; i < n; i++) {
			System.out.print(num[i] + " ");
		}
		sc.close();
	}
}