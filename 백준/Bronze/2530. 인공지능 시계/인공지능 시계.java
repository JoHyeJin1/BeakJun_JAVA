import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();
		int p = sc.nextInt();
		
		s = s + p % 60;
		m = m + p / 60 % 60;
		h = h + p / 60 / 60;
		
		if(s >= 60) {
			h = h + s / 60 / 60;
			m = m + s / 60;
			s = s % 60;
		}
		
		if(m >= 60) {
			h = h + m / 60;
			m = m % 60;
		}
		
		if(h >= 24) {
			h = h % 24;
		}
		System.out.println(h + " " + m + " " + s);
		sc.close();
	}
}
