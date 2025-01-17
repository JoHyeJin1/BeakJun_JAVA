import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int x = sc.nextInt();
		int n = sc.nextInt();
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			for(int j = 0; j < a; j++) {
				int b = sc.nextInt();
				if(b == x) {
					count++;
				}
			}
		}
		if(count == n) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		sc.close();
	}
}