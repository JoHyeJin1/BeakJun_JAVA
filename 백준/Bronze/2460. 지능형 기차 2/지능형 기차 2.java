import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int person = 0;
		int max = 0;
		
		for(int i = 0; i < 10; i++) {
			int in = sc.nextInt();
			person -= in;
			max = Math.max(max, person);
			int out = sc.nextInt();
			person += out;
			max = Math.max(max, person);
		}
		System.out.println(max);
		sc.close();
	}
}