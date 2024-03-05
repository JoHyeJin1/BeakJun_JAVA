import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		String[] a = new String[n];
		int total = 0;
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.next();
		}
		
		for(int i = 0; i < n; i++) {
			int find = 0;
			for(int j = 0; j < a[i].length(); j++) {
				if(a[i].charAt(j) == '+') {
					find = 1;
				}
			}
			
			if(find == 1) {
				total++;
			}
		}
		
		System.out.println(total);
		sc.close();
	}
}