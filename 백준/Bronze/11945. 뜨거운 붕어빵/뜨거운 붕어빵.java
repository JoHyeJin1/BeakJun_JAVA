import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		if(n > 0 && m > 0) {
			for(int i = 0; i < n; i++) {
				String a = sc.next();
				for(int j = m - 1; j >= 0; j--) {
					System.out.print(a.charAt(j));
				}
				System.out.println();
			}
		}
		sc.close();
	}
}
