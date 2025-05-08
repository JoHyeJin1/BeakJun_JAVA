import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int j = n * a;
		int r = m * b;
		int s = k * c;
		
		int max = j;
		if(max <= r) {
			max = r;
		}
		
		if(max <= s) {
			max = s;
		}
		
		if(max == j) {
			System.out.print("Joffrey ");
		}
		
		if(max == r) {
			System.out.print("Robb ");
		}
		
		if(max == s) {
			System.out.print("Stannis ");
		}
		sc.close();
	}
}