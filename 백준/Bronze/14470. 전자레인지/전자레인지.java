import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int total = 0;
		
		if(a < 0) {
			total += (-a) * c;
			total += d;
			total += b * e;
		}else if(a > 0) {
			total += (b - a) * e;
		}
		
		System.out.println(total);
		sc.close();
	}
}