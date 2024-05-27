import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		while(a != 0 || b != 0 || c != 0) {
			int d = b - a;
			if(d == c - b) {
				System.out.println("AP " + (c + d));
			}else {
				int r = b / a;
				System.out.println("GP " + (c * r));	
			}
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
		}
		sc.close();
	}
}