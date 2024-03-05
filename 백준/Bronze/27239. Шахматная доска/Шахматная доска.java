import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = 0;
		char c;
		
		if(n % 8 != 0) {
			m = n / 8 + 1;
			c = (char)(n % 8 + 96);
		}else {
			m = n / 8;
			c = 'h';
		}
		
		System.out.println(c + "" + m);
		sc.close();
	}
}