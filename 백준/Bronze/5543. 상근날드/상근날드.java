import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		int min1 = 999999999;
		for(int i = 0; i < 3; i++) {
			a = sc.nextInt();
			if(a < min1) {
				min1 = a;
			}
		}
		
		int min2 = 999999999;
		for(int i = 0; i < 2; i++) {
			a = sc.nextInt();
			if(a < min2) {
				min2 = a;
			}
		}
		
		System.out.println(min1 + min2 - 50);
		sc.close();
	}
}
