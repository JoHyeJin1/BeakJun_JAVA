import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int maxTotal = 0;
		
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int total = 0;
			int maxNum = a;
			
			if(a == b && b == c) {
				total = 10000 + a * 1000;
			}else if(a == b && b != c || a == c && a != b) {
				total = 1000 + a * 100;
			}else if(b == c && b != a) {
				total = 1000 + b * 100;
			}else {
				maxNum = Math.max(a, b);
				maxNum = Math.max(maxNum, c);
				total = maxNum * 100;
			}
			maxTotal = Math.max(maxTotal, total);
		}
		System.out.println(maxTotal);
		sc.close();
	}
}