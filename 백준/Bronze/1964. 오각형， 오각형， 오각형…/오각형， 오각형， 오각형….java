import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long total = 0;
		total += n + 1;
		
		for(int i = 0; i < n; i++) {
			total += (i + 1) * 3;
		}
		System.out.println(total % 45678);
		sc.close();
	}
}