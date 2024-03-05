import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char[] b = new char[26];
		int[] c = new int[26];
		
		for(int i = 0; i < c.length; i++) {
			c[i] = 0;
		}
		
		for(int i = 0; i < b.length; i++) {
			b[i] = (char)(i + 65);
		}
		
		String a = sc.next();
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < a.length(); j++) {
				if(b[i] == a.charAt(j) || b[i] + 32 == a.charAt(j)) {
					c[i]++;
				}
			}
		}
		int j;
		int max = c[0];
		for(int i = 0; i < c.length; i++) {
			max = Math.max(max, c[i]);
		}
		
		int count = 0;
		for(int i = 0; i < c.length; i++) {
			if(max == c[i]) {
				count++;
			}
		}
		
		int maxIndex = 0;
		if(count >= 2) {
			System.out.println("?");
		}else {
			for(int i = 0; i < c.length; i++) {
				if(max == c[i]) {
					maxIndex = i;
				}
			}
			System.out.println(b[maxIndex]);
		}
		sc.close();
	}
}