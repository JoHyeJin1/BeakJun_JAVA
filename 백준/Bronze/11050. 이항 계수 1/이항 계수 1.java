import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int p = 1;
		int q = 1;
		for(int i = 1; i <= n; i++) {
			p *= i;
		}
		
		for(int i = 1; i <= k; i++) {
			q *= i;
		}
		
		for(int i = 1; i <= n - k; i++) {
			q *= i;
		}
		
		System.out.println(p / q);
		sc.close();
	}
}