import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		
		int w = sc.nextInt();
		int p = sc.nextInt();
		int n = sc.nextInt();
		
		if(m >= w) {
			System.out.println("Watermelon");
		}else if(m >= p) {
			System.out.println("Pomegranates");
		}else if(m >= n) {
			System.out.println("Nuts");
		}else {
			System.out.println("Nothing");
		}
		sc.close();
	}
}