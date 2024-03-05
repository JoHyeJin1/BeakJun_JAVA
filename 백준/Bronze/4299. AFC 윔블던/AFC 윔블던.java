import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int add = sc.nextInt();
		int sub = sc.nextInt();
		int a, b;
		
		a = (add + sub) / 2;
		b = add - a;
		
		if(a >= 0 && b >= 0 && (add + sub) % 2 == 0) {
			System.out.println(a + " " + b);
		}else {
			System.out.println("-1");
		}
		sc.close();
	}
}