import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double w = sc.nextDouble();
		w = w + w;
		
		double a = Math.sqrt(w);
		System.out.println((int)(4 * a));
		sc.close();
	}
}