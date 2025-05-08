import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long num = sc.nextLong();
		
		if(-32768 <= num && num <= 32767) {
			System.out.println("short");
		}else if(-2147483648 <= num && num <= 2147483647) {
			System.out.println("int");
		}else {
			System.out.println("long long");
		}
		sc.close();
	}
}