import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int total;
		
		while(n != 0 && m != 0) {
			total = 0;
			for(int i = 0; i < n; i++) {
				int money = sc.nextInt();
				if(money >= m / n) {
					total += m / n;
				}else {
					total += money;
				}
			}
			System.out.println(total);
			n = sc.nextInt();
			m = sc.nextInt();
		}
		sc.close();
	}
}