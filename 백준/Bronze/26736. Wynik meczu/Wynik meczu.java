import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		int countA = 0;
		int countB = 0;
		
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) == 'A') {
				countA++;
			}else if(a.charAt(i) == 'B') {
				countB++;
			}
		}
		
		System.out.println(countA + " : " + countB);
		sc.close();
	}
}