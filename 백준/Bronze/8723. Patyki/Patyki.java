import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a == b && b == c) {
			System.out.println("2");
		}else if(a > b && b > c && a * a == b * b + c * c || a > c && c > b && a * a == c * c + b * b || b > a && a > c && b * b == a * a + c * c || b > c && c > a && b * b == c * c + a * a || c > a && a > b && c * c == a * a + b * b || c > b && b > a && c * c == b * b + a * a) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		sc.close();
	}
}
