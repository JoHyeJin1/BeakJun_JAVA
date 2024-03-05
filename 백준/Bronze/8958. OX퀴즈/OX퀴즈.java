import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			String a = sc.next();
			String[] b = a.split("X");
			
			int total = 0;
			for(int j = 0; j < b.length; j++) {
				for(int k = 0; k <= b[j].length(); k++) {
					total += k;
				}
			}
			System.out.println(total);
		}
		sc.close();
	}
}