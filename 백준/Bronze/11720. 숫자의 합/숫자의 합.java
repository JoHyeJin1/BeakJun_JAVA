import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String a = sc.next();
		int total = 0;
		
		for(int i = 0; i < a.length(); i++) {
			total += (int)(a.charAt(i) - 48);
		}
		
		System.out.println(total);
		sc.close();
	}
}