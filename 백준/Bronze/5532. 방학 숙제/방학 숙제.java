import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		if(a % c == 0) {
			a = a / c;
		}else {
			a = a /c;
			a++;
		}
		
		if(b % d == 0) {
			b = b / d;
		}else {
			b = b / d;
			b++;
		}
		
		if(a > b) {
			System.out.println(l - a);
		}else {
			System.out.println(l - b);
		}
		sc.close();
	}
}
