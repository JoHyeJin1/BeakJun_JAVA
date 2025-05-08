import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] alpha = new int[26];
		
		for(int i = 0; i < n; i++) {
			String a = sc.next();
			int total = 0;
			
			for(int j = 0; j < 26; j++) {
				alpha[j] = 0;
			}
			
			for(int j = 0; j < a.length(); j++) {
				alpha[(int)a.charAt(j) - 65] = 1;
			}
			
			for(int j = 0; j < 26; j++) {
				if(alpha[j] == 0) {
					total += 65 + j;
				}
			}
			System.out.println(total);
		}
		sc.close();
	}
}