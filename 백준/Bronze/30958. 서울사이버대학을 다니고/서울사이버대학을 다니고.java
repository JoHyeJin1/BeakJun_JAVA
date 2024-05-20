import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		String a = sc.nextLine();
		
		int[] alpha = new int[26];
		int[] count = new int[26];
		
		for(int i = 0; i < alpha.length; i++) {
			alpha[i] = 97 + i;
			count[i] = 0;
		}
		
		for(int i = 0; i < a.length(); i++) {
			for(int j = 0; j < alpha.length; j++) {
				if(a.charAt(i) == alpha[j]) {
					count[j]++;
				}
			}
		}
		
		int max = count[0];
		for(int i = 0; i < count.length; i++) {
			max = Math.max(max, count[i]);
		}
		System.out.println(max);
		
		sc.close();
	}
}