import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = 1000 - a;
		int count = 0;
		
		count += b / 500;
		b = b % 500;
		count += b / 100;
		b = b % 100;
		count += b / 50;
		b = b % 50;
		count += b / 10;
		b = b % 10;
		count += b / 5;
		count += b % 5;
		
		System.out.println(count);
		sc.close();
	}
}