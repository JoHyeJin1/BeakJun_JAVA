import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		while(a.equals("0") == false) {
			int flag = 1;
			for(int i = 0; i < a.length() / 2; i++) {
				if(a.charAt(i) != a.charAt(a.length() - 1 - i)) {
					flag = 0;
					break;
				}
			}
			if(flag == 0) {
				System.out.println("no");
			}else {
				System.out.println("yes");
			}
			a = sc.next();
		}
		sc.close();
	}
}