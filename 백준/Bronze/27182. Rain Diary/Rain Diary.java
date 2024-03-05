import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a = 0;
		
		if(n > 7) {
			a = n - 7;
		}else if(n <= 7) {
			a = m + 7;
		}
		System.out.println(a);
		sc.close();
	}
}