import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count = a * b / (4840 * 5);
		
		if(a * b % (4840 * 5) != 0) {
			count++;
		}
		
		System.out.println(count);
		sc.close();
	}
}