import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		String b = sc.next();
		
		int totalN = 0;
		int totalS = 0;
		int totalW = 0;
		int totalE = 0;
		int total = 0;
		
		for(int i = 0; i < b.length(); i++) {
			if(b.charAt(i) == 'N') {
				totalN++;
			}else if(b.charAt(i) == 'S') {
				totalS++;
			}else if(b.charAt(i) == 'W') {
				totalW++;
			}else if(b.charAt(i) == 'E') {
				totalE++;
			}
		}
		
		if(totalN > totalS) {
			total += totalN - totalS;
		}else {
			total += totalS - totalN;
		}
		
		if(totalW > totalE) {
			total += totalW - totalE;
		}else {
			total += totalE - totalW;
		}
		System.out.println(total);
		sc.close();
	}
}