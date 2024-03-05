import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		int flag = 1;
		for(int i = 0; i < a.length() / 2; i++) {
			if(a.charAt(i) != a.charAt(a.length() - 1 - i)) {
				flag = 0;
				break;
			}
		}
		
		if(flag == 1) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		sc.close();
	}
}