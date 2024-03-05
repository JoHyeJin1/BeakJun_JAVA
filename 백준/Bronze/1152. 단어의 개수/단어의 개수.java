import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		int count = 0;
		
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) == ' ') {
				count++;
			}
		}
		
		if(a.charAt(0) != ' ') {
			count++;
		}
		
		if(a.charAt(a.length() - 1) == ' ') {
			count--;
		}
		System.out.println(count);
		sc.close();
	}
}