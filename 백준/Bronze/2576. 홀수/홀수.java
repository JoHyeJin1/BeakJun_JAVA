import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int min = 999999999;
		int total = 0;
		int count = 0;
		for(int i = 0; i < 7; i++) {
			int a = sc.nextInt();
			
			if(a % 2 != 0) {
				count++;
				total += a;
				if(min > a) {
					min = a;
				}
			}
		}
		
		if(count == 0) {
			System.out.println("-1");
		}else {
			System.out.println(total);
			System.out.println(min);
		}
		sc.close();
	}
}