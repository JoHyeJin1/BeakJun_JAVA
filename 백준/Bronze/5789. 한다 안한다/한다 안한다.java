import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			if(s.charAt(s.length() / 2 - 1) == s.charAt(s.length() / 2)) {
				System.out.println("Do-it");
			}else {
				System.out.println("Do-it-Not");
			}
		}
		sc.close();
	}
}