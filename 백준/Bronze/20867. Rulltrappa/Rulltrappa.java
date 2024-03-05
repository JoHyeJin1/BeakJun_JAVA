import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double m = sc.nextDouble();
		double s = sc.nextDouble();
		double g = sc.nextDouble();
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		int l = sc.nextInt();
		int r = sc.nextInt();
		
		double totalL = 0;
		double totalR = 0;
		
		totalL = l * (1 / a) + (m / g);
		totalR = r * (1 / b) + (m / s);
		
		if(totalL > totalR) {
			System.out.println("latmask");
		}else if(totalL < totalR) {
			System.out.println("friskus");
		}
		
		sc.close();
	}
}