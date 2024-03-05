import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		
		for(int i = 0; i < 8; i++) {
			String a = sc.next();
			for(int j = 0; j < a.length(); j++) {
				if(a.charAt(j) == 'K') {
					total += 0;
				}else if(a.charAt(j) == 'P') {
					total += 1;
				}else if(a.charAt(j) == 'N') {
					total += 3;
				}else if(a.charAt(j) == 'B') {
					total += 3;
				}else if(a.charAt(j) == 'R') {
					total += 5;
				}else if(a.charAt(j) == 'Q') {
					total += 9;
				}else if(a.charAt(j) == 'k') {
					total -= 0;
				}else if(a.charAt(j) == 'p') {
					total -= 1;
				}else if(a.charAt(j) == 'n') {
					total -= 3;
				}else if(a.charAt(j) == 'b') {
					total -= 3;
				}else if(a.charAt(j) == 'r') {
					total -= 5;
				}else if(a.charAt(j) == 'q') {
					total -= 9;
				}
			}
		}
		
		System.out.println(total);
		sc.close();
	}
}