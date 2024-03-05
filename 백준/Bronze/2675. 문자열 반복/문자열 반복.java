import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int m = sc.nextInt();
			String a = sc.next();
			for(int j = 0; j < a.length(); j++) {
				for(int k = 0; k < m; k++) {
					System.out.print(a.charAt(j));
				}
			}
			System.out.println();
		}
		sc.close();
	}
}