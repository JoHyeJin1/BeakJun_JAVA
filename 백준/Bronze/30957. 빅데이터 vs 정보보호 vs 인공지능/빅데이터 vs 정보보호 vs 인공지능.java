import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		String b = sc.next();
		int countB = 0;
		int countS = 0;
		int countA = 0;
		
		for(int i = 0; i < b.length(); i++) {
			if(b.charAt(i) == 'B') {
				countB++;
			}else if(b.charAt(i) == 'S') {
				countS++;
			}else if(b.charAt(i) == 'A') {
				countA++;
			}
		}
		
		int max = Math.max(countA, countB);
		max = Math.max(countA, countS);
		
		if(countB == countS && countS == countA) {
			System.out.println("SCU");
		}else if(countA < countB && countB == countS) {
			System.out.println("BS");
		}else if(countB < countA && countA == countS) {
			System.out.println("SA");
		}else if(countS < countB && countB == countA) {
			System.out.println("BA");
		}else {
			if(countA <= countS && countS < countB || countS <= countA && countA < countB ) {
				System.out.println("B");
			}else if(countA <= countB && countB < countS || countB <= countA && countA < countS) {
				System.out.println("S");
			}else {
				System.out.println("A");
			}
		}
		sc.close();
	}
}