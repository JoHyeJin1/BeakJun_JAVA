import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		
		int count = 0;
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) == 'e') {
				count++;
			}
		}
		
		String b = "h";
		for(int i = 0; i < count * 2; i++) {
			b += 'e';
		}
		b += "y";
		
		System.out.println(b);
		sc.close();
	}
}