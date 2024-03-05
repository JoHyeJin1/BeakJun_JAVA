import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int total = 0;
		
		if(n == 1 || m == 1) {
			total = n * m;
		}else {
			total = 2 * n + 2 * (m - 2);
		}
		
		System.out.println(total);
		sc.close();
	}
}