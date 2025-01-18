import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int newA = 0;
		int newB = 0;
		
		while(a != 0) {
			newA = newA * 10 + (a % 10);
			a = a / 10;
		}
		
		while(b != 0) {
			newB = newB * 10 + (b % 10);
			b = b / 10;
		}
		
		if(newA > newB) {
			System.out.println(newA);
		}else {
			System.out.println(newB);
		}
		sc.close();
	}
}