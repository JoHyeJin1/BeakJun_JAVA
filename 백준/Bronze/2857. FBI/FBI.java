import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		int j;
		for(int i = 0; i < 5; i++) {
			String a = sc.next();
			for(j = 0; j < a.length() - 2; j++) {
				if(a.charAt(j) == 'F' && a.charAt(j + 1) == 'B' && a.charAt(j + 2) == 'I') {
					count++;
					break;
				}
			}
			if(j != a.length() - 2) {
				System.out.println(i + 1);
			}
		}
		
		if(count == 0) {
			System.out.println("HE GOT AWAY!");
		}
		sc.close();
	}
}