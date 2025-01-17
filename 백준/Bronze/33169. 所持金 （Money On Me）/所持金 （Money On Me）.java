import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int total = a * 1000 + b * 10000;
		
		System.out.println(total);
		sc.close();
	}
}