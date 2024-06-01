import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int max = Math.max(a, b);
			max = Math.max(max, c);
			
			System.out.println("Scenario #" + (i + 1) + ":");
			if(max == a) {
				if(b * b + c * c == a * a) {
					System.out.println("yes");
				}else {
					System.out.println("no");
				}
			}else if(max == b) {
				if(a * a + c * c == b * b) {
					System.out.println("yes");
				}else {
					System.out.println("no");
				}
			}else if(max == c) {
				if(a * a + b * b == c * c) {
					System.out.println("yes");
				}else {
					System.out.println("no");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}