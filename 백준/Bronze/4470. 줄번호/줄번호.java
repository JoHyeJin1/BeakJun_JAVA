import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String[] a = new String[num + 1];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextLine();
		}
		
		for(int i = 1; i < a.length; i++) {
			System.out.println(i + ". " + a[i]);
		}
		sc.close();
	}
}
