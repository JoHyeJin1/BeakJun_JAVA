import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String a = sc.next();
		
		if(a.charAt(a.length() - 1) == 'G') {
			for(int i = 0; i < a.length() - 1; i++) {
				System.out.print(a.charAt(i));
			}
		}else {
			System.out.println(a + "G");
		}
		sc.close();
	}
}