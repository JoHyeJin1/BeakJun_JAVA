import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a + b;
		
		int count = 0;
		while(sum != 0) {
			count++;
			sum = sum / 10;
		}
		
		System.out.println(count);
		sc.close();
	}
}