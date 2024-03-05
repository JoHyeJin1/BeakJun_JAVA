import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		int c = 0;
		int d = 0;
		
		if(min % 4 == 0) {
			if(max % 4 == 0) {
				c += max / 4 - min / 4;
			}else {
				c += max / 4 + 1 - min / 4;
				d += 4 - max % 4;
			}
		}else {
			if(max % 4 == 0) {
				c += max / 4 - min / 4 - 1;
				d += 4 - min % 4;
			}else {
				c += max / 4 - min / 4;
				if(min % 4 > max % 4) {
					d = min % 4 - max % 4;
				}else {
					d = max % 4 - min % 4;
				}
			}
		}
		System.out.println(c + d);
		sc.close();
	}
}