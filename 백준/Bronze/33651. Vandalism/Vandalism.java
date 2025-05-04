import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int flagU = 0;
		int flagA = 0;
		int flagP = 0;
		int flagC = 0;
		
		String s = sc.next();
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'U') {
				flagU = 1;
			}
			
			if(s.charAt(i) == 'A') {
				flagA = 1;
			}
			
			if(s.charAt(i) == 'P') {
				flagP = 1;
			}
			
			if(s.charAt(i) == 'C') {
				flagC = 1;
			}
		}
		
		if(flagU == 0) {
			System.out.print("U");
		}
		
		if(flagA == 0) {
			System.out.print("A");
		}
		
		if(flagP == 0) {
			System.out.print("P");
		}
		
		if(flagC == 0) {
			System.out.print("C");
		}
	}
}