import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int min = 999999;
		
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int can = 0;
			if(a <= b && min > b) {
				min = b;
			}
		}
		
		if(min != 999999) {
			System.out.println(min);
		}else {
			System.out.println("-1");
		}
		sc.close();
	}
}