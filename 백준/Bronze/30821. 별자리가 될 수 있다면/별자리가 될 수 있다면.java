import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long count = 1;
		
		for(int i = 0; i < 5; i++) {
			count *= n - i;
		}

		for(int i = 0; i < 5; i++) {
			count /= (i + 1);
		}
		System.out.println(count);
		sc.close();
	}
}