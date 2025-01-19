import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String s = sc.next();
		
		String a = "";
		String b = "";
		String c = "";
		
		for(int i = 0; i < n; i++) {
			if(i % 3 == 0) {
				a += 'A';
			}else if(i % 3 == 1) {
				a += 'B';
			}else {
				a += 'C';
			}
		}
		
		for(int i = 0; i < n; i++) {
			if(i % 4 == 0 || i % 4 == 2) {
				b += 'B';
			}else if(i % 4 == 1) {
				b += 'A';
			}else {
				b += 'C';
			}
		}
		
		for(int i = 0; i < n; i++) {
			if(i % 6 == 0 || i % 6 == 1) {
				c += 'C';
			}else if(i % 6 == 2 || i % 6 == 3) {
				c += 'A';
			}else {
				c += 'B';
			}
		}
		
		int scoreA = 0;
		int scoreB = 0;
		int scoreC = 0;
		
		for(int i = 0; i < n; i++) {
			if(s.charAt(i) == a.charAt(i)) {
				scoreA++;
			}
			
			if(s.charAt(i) == b.charAt(i)) {
				scoreB++;
			}
			
			if(s.charAt(i) == c.charAt(i)) {
				scoreC++;
			}
		}
		
		int max = scoreA;
		if(max < scoreB) {
			max = scoreB;
		}
		
		if(max < scoreC) {
			max = scoreC;
		}
		
		System.out.println(max);
		if(max == scoreA) {
			System.out.println("Adrian");
		}
		
		if(max == scoreB) {
			System.out.println("Bruno");
		}
		
		if(max == scoreC) {
			System.out.println("Goran");
		}
		sc.close();
	}
}