import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			String a = sc.next();
			if((a.charAt(a.length() - 1) - 48) % 2 == 0) {
				System.out.println("even");
			}else {
				System.out.println("odd");
			}
		}
		sc.close();
	}
}