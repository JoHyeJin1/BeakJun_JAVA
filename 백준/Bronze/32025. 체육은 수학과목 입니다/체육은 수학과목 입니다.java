import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a < b) {
			System.out.println((a * 100) / 2);
		}else {
			System.out.println((b * 100) / 2);
		}
		sc.close();
	}
}