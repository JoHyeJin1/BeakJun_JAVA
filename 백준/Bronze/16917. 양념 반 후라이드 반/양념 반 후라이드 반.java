import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int total1 = a * x + b * y;
		int total2 = 0;
		int total3 = 0;
		if(x < y) {
			total2 = x * 2 * c + (y - x) * b;
			total3 = c * 2 * y;
		}else {
			total2 = y * 2 * c + (x - y) * a;
			total3 = c * 2 * x;
		}
		
		int min = total1;
		if(min > total2) {
			min = total2;
		}
		
		if(min > total3) {
			min = total3;
		}
		
		System.out.println(min);
		sc.close();
	}
}