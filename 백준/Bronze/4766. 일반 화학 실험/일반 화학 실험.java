import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		while(b != 999) {
			System.out.println(String.format("%.2f", b - a));
			a = b;
			b = sc.nextDouble();
		}
		sc.close();
	}
}