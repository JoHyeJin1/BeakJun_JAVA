import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		while(n != 0) {
			int[] a = new int[n];
			for(int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			
			for(int i = a.length - 1; i >= 0; i--) {
				System.out.println(a[i]);
			}
			System.out.println("0");
			n = sc.nextInt();
		}
		sc.close();
	}
}