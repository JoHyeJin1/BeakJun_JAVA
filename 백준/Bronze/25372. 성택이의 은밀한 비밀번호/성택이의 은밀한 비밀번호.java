import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		for(int i = 0; i < a; i++) {
			String string = sc.next();
			
			if(6 <= string.length() && string.length() <= 9) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
		sc.close();
	}
}
