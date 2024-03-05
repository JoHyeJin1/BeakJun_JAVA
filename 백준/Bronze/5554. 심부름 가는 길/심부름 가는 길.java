import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, total = 0;
		
		for(int i = 0; i < 4; i++) {
			a = sc.nextInt();
			total += a;
		}
		System.out.println(total / 60);
		System.out.println(total % 60);
		sc.close();
	}
}
