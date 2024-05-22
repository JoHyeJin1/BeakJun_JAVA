import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = 1;
		
		while(k * k < n) {
			k++;
		}
		
		for(int i = 0; i < k + 2; i++) {
			System.out.print("x");
		}
		System.out.println();
		
		for(int i = 0; i < k; i++) {
			System.out.print("x");
			for(int j = 0; j < k; j++) {
				System.out.print(".");
			}
			System.out.println("x");
		}
		
		for(int i = 0; i < k + 2; i++) {
			System.out.print("x");
		}
		sc.close();
	}
}