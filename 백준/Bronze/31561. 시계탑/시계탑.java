import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double m = sc.nextDouble();
		if(0 <= m && m <= 30) {
			System.out.println(String.format("%.1f", m / 2));
		}else {
			System.out.println(String.format("%.1f", (m - 30) / 2 * 3 + 15));
		}
		sc.close();
	}
}