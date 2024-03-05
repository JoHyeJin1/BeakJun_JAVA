import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long p = 1;
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			p *= i;
		}
		p = p / 60;
		p = p / 60;
		p = p / 24;
		p = p / 7;
		
		System.out.println(p);
		sc.close();
	}
}