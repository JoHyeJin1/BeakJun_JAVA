import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double w = sc.nextDouble();
		double l = sc.nextDouble();
		double h = sc.nextDouble();
		
		if(Math.min(w, l) / h >= 2 && Math.max(w, l) / Math.min(w, l) <= 2) {
			System.out.println("good");
		}else {
			System.out.println("bad");
		}
		sc.close();
	}
}