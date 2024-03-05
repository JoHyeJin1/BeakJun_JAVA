import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		while(n % 10 == 0) {
			n = n / 10;
		}
		
		int count = 0;
		while(n != 0) {
			if(n % 10 == 0) {
				count++;
			}
			n = n / 10;
		}
		
		System.out.println(count);
		sc.close();
	}
}