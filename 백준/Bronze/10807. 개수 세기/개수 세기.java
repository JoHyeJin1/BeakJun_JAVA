import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[]a = new int[n];
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		int b = sc.nextInt();
		int count = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] == b) {
				count++;
			}
		}
		
		System.out.println(count);
		sc.close();
	}
}
