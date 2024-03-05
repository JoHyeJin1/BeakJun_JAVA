import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int total = 0;
		
		if(n <= m) {
			total = 2 * n;
		}else {
			total = 2 * m;
		}
		
		if(n != m) {
			total += 1;
		}
		
		System.out.println(total);
		sc.close();
	}
}