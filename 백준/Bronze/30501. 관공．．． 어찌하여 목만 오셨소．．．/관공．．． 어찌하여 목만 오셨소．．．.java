import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] a = new String[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.next();
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < a[i].length(); j++) {
				if(a[i].charAt(j) == 'S') {
					System.out.println(a[i]);
					break;
				}
			}
		}
		sc.close();
	}
}