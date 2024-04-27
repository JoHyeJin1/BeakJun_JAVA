import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = 100 - a;
		
		System.out.println(String.format("%.10f", (100 / a)));
		System.out.println(String.format("%.10f", (100 / b)));
		
		sc.close();
	}
}