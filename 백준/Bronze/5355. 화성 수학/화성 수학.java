import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			double a = sc.nextDouble();
			String b = sc.nextLine();
			for(int j = 0; j < b.length(); j++) {
				if(b.charAt(j) == '@') {
					a = a * 3;
				}else if(b.charAt(j) == '%') {
					a = a + 5;
				}else if(b.charAt(j) == '#') {
					a = a - 7;
				}
			}
			System.out.println(String.format("%.2f", a));
		}
		sc.close();
	}
}