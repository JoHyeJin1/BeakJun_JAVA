import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		while(a.equals("***") == false) {
			for(int i = a.length() - 1; i >= 0; i--) {
				System.out.print(a.charAt(i));
			}
			System.out.println();
			a = sc.nextLine();
		}
		sc.close();
	}
}