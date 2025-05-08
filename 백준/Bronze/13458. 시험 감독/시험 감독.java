import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];		
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		long total = 0;
		for(int i = 0; i < n; i++) {
			a[i] = a[i] - b;
			if(a[i] >= 0) {
				total += a[i] / c;
				if(a[i] % c != 0) {
					total += 1;
				}
			}
		}
		
		total += n;
		System.out.println(total);
		sc.close();
	}
}