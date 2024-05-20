import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String a = sc.next();
		
		int countU = 0;
		int countO = 0;
		int countS = 0;
		int countP = 0;
		int countC = 0;
		
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) == 'u') {
				countU++;
			}
			if(a.charAt(i) == 'o') {
				countO++;
			}
			if(a.charAt(i) == 's') {
				countS++;
			}
			if(a.charAt(i) == 'p') {
				countP++;
			}
			if(a.charAt(i) == 'c') {
				countC++;
			}
		}
		
		int min = Math.min(countU, countO);
		min = Math.min(countS, min);
		min = Math.min(countP, min);
		min = Math.min(countC, min);
		
		System.out.println(min);
		sc.close();
	}
}