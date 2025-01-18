import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		while(!a.equals("#")) {
			String b = sc.nextLine();
			int count = 0;
			String upper = b.toUpperCase();
			String lower = b.toLowerCase();
			
			for(int i = 0; i < b.length(); i++) {
				if(a.charAt(0) == upper.charAt(i) || a.charAt(0) == lower.charAt(i)) {
					count++;
				}
			}
			System.out.println(a + " " + count);
			a = sc.next();
		}
		sc.close();
	}
}