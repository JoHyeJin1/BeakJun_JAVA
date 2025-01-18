import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			if(n % 2 == 0) {
				for(int j = 0; j < n / 2; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}else {
				for(int j = 0; j < (n + 1) / 2; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			for(int j = 0; j < n / 2; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		sc.close();
	}
}