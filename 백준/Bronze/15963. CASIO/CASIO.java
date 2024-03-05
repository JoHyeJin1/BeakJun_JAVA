import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long m = sc.nextLong();
		
		if(n == m) {
			System.out.print("1");
		}else {
			System.out.print("0");
		}
		sc.close();
	}
}
