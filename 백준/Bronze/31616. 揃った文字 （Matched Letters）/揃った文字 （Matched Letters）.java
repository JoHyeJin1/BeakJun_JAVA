import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String s = sc.next();
		int i;
		
		for(i = 0; i < n - 1; i++) {
			if(s.charAt(i) != s.charAt(i + 1)) {
				break;
			}
		}
		
		if(i != n - 1) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
		sc.close();
	}
}