import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int m = sc.nextInt();
		int stress = 0;
		int count = 0;
		
		for(int i = 0; i < 24; i++) {
			if(stress < 0) {
				stress = 0;
			}
			if(stress + a <= m) {
				count++;
				stress += a;
			}else {
				stress = stress - c;
			}
		}
		System.out.println(count * b);
		sc.close();
	}
}