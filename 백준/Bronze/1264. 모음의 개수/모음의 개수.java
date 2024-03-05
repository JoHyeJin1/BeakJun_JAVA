import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		while(a.equals("#") != true) {
			int count = 0;
			for(int i = 0; i < a.length(); i++) {
				if(a.charAt(i) == 'A' || a.charAt(i) == 'a' || a.charAt(i) == 'E' || a.charAt(i) == 'e' || a.charAt(i) == 'O' || a.charAt(i) == 'o' || a.charAt(i) == 'U' || a.charAt(i) == 'u' || a.charAt(i) == 'I' || a.charAt(i) == 'i') {
					count++;
				}
			}
			System.out.println(count);
			a = sc.nextLine();
		}
		sc.close();
	}
}
