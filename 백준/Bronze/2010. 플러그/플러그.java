import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		int total = 0;
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		int min = a[0];
		for(int i = 0; i < n; i++) {
			min = Math.min(min, a[i]);
		}
		
		for(int i = 0; i < n; i++) {
			total += a[i] - 1;
		}
		total++;
		System.out.println(total);
		sc.close();
	}
}