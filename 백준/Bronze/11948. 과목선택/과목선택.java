import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		int total = 0;
		
		if(a >= d && b >= d && c >= d) {
			total = a + b + c;
		}else if(a >= c && b >= c && d >= c) {
			total = a + b + d;
		}else if(a >= b && c >= b && d >= d) {
			total = a + c + d;
		}else {
			total = b + c + d;
		}
		
		if(e >= f) {
			total += e;
		}else {
			total += f;
		}
		
		System.out.println(total);
		sc.close();
	}
}
