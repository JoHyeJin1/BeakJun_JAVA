import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();
		int x = sc.nextInt();
		int count = 0;
		
		for(int i = k - x; i <= k + x; i++) {
			for(int j = a; j <= b; j++) {
				if(i == j) {
					count++;
				}
			}
		}
		
		if(count == 0) {
			System.out.println("IMPOSSIBLE");
		}else {
			System.out.println(count);
		}
		sc.close();
	}
}