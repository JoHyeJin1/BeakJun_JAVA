import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int m = sc.nextInt();
			int[] a = new int[m];
			int good = 1;
			for(int j = 0; j < m; j++) {
				a[j] = sc.nextInt();
			}
			System.out.print("Denominations: ");
			for(int j = 0; j < m; j++) {
				System.out.print(a[j] + " ");
			}
			
			for(int j = 0; j < m - 1; j++) {
				if(2 * a[j] > a[j + 1]) {
					good = 0;
				}
			}
			System.out.println();
			if(good == 1) {
				System.out.println("Good coin denominations!");
			}else {
				System.out.println("Bad coin denominations!");
			}
			System.out.println();
		}
		sc.close();
	}
}