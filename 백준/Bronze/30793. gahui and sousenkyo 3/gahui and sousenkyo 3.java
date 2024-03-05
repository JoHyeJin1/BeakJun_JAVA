import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double result = a / b;
		
		if(result < 0.2) {
			System.out.println("weak");
		}else if(0.2 <= result && result < 0.4) {
			System.out.println("normal");
		}else if(0.4 <= result && result < 0.6) {
			System.out.println("strong");
		}else {
			System.out.println("very strong");
		}
		sc.close();
	}
}