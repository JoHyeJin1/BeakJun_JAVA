import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		while(m != 0) {
			if(m % n == 0) {
				System.out.println(m + " is a multiple of " + n + ".");
			}else {
				System.out.println(m + " is NOT a multiple of " + n + ".");
			}
			m = sc.nextInt();
		}
		sc.close();
	}
}