import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = 0;
		
		if(x > y) {
			w = x + y;
		}else {
			w = y - x;
		}
		
		System.out.println(w);
		sc.close();
	}
}