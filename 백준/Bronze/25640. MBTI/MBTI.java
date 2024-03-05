import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		int b = sc.nextInt();
		int count = 0;
		for(int i = 0; i < b; i++) {
			String c = sc.next();
			if(a.equals(c)) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}