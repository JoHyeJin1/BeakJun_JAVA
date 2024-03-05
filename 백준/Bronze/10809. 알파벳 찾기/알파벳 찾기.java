import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char[] a = new char[26];
		for(int i = 0; i < a.length; i++) {
			a[i] = (char)(i + 97);
		}
		
		String b = sc.next();
		int j;
		for(int i = 0; i < a.length; i++) {
			int index = 0;
			for(j = 0; j < b.length(); j++) {
				if(a[i] == b.charAt(j)) {
					index = j;
					break;
				}
			}
			
			if(j == b.length()) {
				index = -1;
			}
			System.out.print(index + " ");
		}
		sc.close();
	}
}