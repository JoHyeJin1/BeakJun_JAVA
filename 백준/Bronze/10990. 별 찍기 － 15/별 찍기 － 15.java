import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int k = n - i - 1; k > 0; k--) {
				System.out.print(" ");
			}
			
			if(i == 0) {
				System.out.println("*");
			}else {
				System.out.print("*");
				for(int j = 0; j < 2 * i - 1; j++) {
					System.out.print(" ");
				}
				System.out.println("*");
			}
		}
		sc.close();
	}
}