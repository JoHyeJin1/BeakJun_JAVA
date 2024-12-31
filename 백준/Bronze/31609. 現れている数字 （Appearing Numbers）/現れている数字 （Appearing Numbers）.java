import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] check = new int[10];
		
		for(int i = 0; i < 10; i++) {
			check[i] = 0;
		}
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 10; j++) {
				if(a[i] == j) {
					check[j] = 1;
					break;
				}
			}
		}
		
		for(int i = 0; i < 10; i++) {
			if(check[i] == 1) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}