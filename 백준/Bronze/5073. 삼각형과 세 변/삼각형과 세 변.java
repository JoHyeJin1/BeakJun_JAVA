import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		while(a != 0 && b != 0 && c != 0) {
			int max = a;
			max = Math.max(max, b);
			max = Math.max(max, c);
			
			if(a == b && b == c) {
				System.out.println("Equilateral");
			}else if(max == a) {
				if(a >= b + c) {
					System.out.println("Invalid");
				}else if(a == b && b != c || a == c && c != b || b == c && c != a) {
						System.out.println("Isosceles");
				}else {
					System.out.println("Scalene");
				}
			}else if(max == b) {
				if(b >= a + c) {
					System.out.println("Invalid");
				}else if(a == b && b != c || a == c && c != b || b == c && c != a) {
					System.out.println("Isosceles");
				}else {
					System.out.println("Scalene");
				}
			}else if(max == c) {
				if(c >= a + b) {
					System.out.println("Invalid");
				}else if(a == b && b != c || a == c && c != b || b == c && c != a) {
					System.out.println("Isosceles");
				}else {
					System.out.println("Scalene");
				}
			}
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
		}
		sc.close();
	}
}