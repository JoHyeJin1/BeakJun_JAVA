import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) == 'a') {
				System.out.print("4");
			}else if(a.charAt(i) == 'e') {
				System.out.print("3");
			}else if(a.charAt(i) == 'i') {
				System.out.print("1");
			}else if(a.charAt(i) == 'o') {
				System.out.print("0");
			}else if(a.charAt(i) == 's') {
				System.out.print("5");
			}else {
				System.out.print(a.charAt(i));
			}
		}
		sc.close();
	}
}