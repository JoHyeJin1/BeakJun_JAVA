import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int m = sc.nextInt();
			String c = sc.next();
			
			for(int j = 0; j < m; j++) {
				for(int k = 0; k < j + 1; k++) {
					if(c.charAt(0) + j > 'Z') {
						System.out.print((char)(c.charAt(0) + j - 26));
					}else {
						System.out.print((char)(c.charAt(0) + j));
					}
				}
				System.out.println();
			}
			System.out.println();
		}
		sc.close();
	}
}