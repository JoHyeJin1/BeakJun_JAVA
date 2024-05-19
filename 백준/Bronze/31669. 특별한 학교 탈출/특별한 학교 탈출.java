import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		String[] a = new String[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.next();
		}
		
		int i, j;
		for(i = 0; i < m; i++) {
			int count = 0;
			for(j = 0; j < n; j++) {
				if(a[j].charAt(i) == 'X') {
					count++;
				}
			}
			if(count == n) {
				System.out.println(i + 1);
				break;
			}
		}
		
		if(i == m) {
			System.out.println("ESCAPE FAILED");
		}
		sc.close();
	}
}