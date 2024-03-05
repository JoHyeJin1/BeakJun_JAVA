import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int totalA = (k - 1 + n - 1) * b;
		int totalB = (n - 1) * a;
		
		System.out.println(totalA + " " + totalB);
		sc.close();
	}
}