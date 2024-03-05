import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int total = 0;
		
		if(a <= b || b == a - 1) {
			total += a + (a - 1);
		}else {
			total += b + (b + 1);
		}
		System.out.println(total);
		sc.close();
	}
}