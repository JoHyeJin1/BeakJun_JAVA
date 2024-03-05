import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		int i, j;
		for(i = 0; i < b.length(); i++) {
			for(j = 0; j < a.length(); j++) {
				if(b.charAt(i) == a.charAt(j)) {
					break;
				}
			}
			
			if(j == a.length()) {
				System.out.println(b.charAt(i));
			}
		}
		sc.close();
	}
}