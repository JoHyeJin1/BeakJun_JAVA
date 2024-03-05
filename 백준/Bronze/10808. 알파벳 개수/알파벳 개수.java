import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char[] a = new char[26];
		for(int i = 0; i < a.length; i++) {
			a[i] = (char)(97 + i);
		}
		
		String b = sc.next();
		for(int i = 0; i < a.length; i++) {
			int count = 0;
			for(int j = 0; j < b.length(); j++) {
				if(a[i] == b.charAt(j)) {
					count++;
				}
			}
			System.out.print(count + " ");
		}
		sc.close();
	}
}
