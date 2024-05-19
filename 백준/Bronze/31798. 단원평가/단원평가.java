import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		if(c == 0) {
			c = Math.sqrt(a + b);
			System.out.println((int)c);
		}else if(b == 0) {
			b = c * c - a;
			System.out.println((int)b);
		}else if(a == 0) {
			a = c * c - b;
			System.out.println((int)a);
		}
		sc.close();
	}
}