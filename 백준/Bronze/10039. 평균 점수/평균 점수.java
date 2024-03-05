import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		for(int i = 0; i < 5; i++) {
			int a = sc.nextInt();
			if(a >= 40) {
				total += a;
			}else {
				total += 40;
			}
		}
		
		System.out.println(total / 5);
		sc.close();
	}
}
