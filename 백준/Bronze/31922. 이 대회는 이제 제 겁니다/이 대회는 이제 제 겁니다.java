import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a + c > b) {
			System.out.println(a + c);
		}else {
			System.out.println(b);
		}
		sc.close();
	}
}