import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = 0, s = 0;
		
		for(int i = 0; i < 4; i++) {
			int a = sc.nextInt();
			t += a;
		}
		
		for(int i = 0; i < 4; i++) {
			int a = sc.nextInt();
			s += a;
		}
		
		if(t > s) {
			System.out.println(t);
		}else {
			System.out.println(s);
		}
		sc.close();
	}
}
