import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int[] money = new int[a];
		
		for(int i = 0; i < a; i++) {
			money[i] = sc.nextInt();
		}
		
		int b = sc.nextInt();
		int[] wish = new int[b];
		
		for(int i = 0; i < b; i++) {
			wish[i] = sc.nextInt();
		}
		
		int total = 0;
		for(int i = 0; i < b; i++) {
			total += money[wish[i] - 1];
		}
		
		System.out.println(total);
		sc.close();
	}
}