import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String[] b = a.split("/");
		int first = 0;
		int second = 0;
		
		if(b[0].charAt(0) == '1') {
			first = 10;
		}else if(b[0].charAt(0) == '2') {
			first = 20;
		}else if(b[0].charAt(0) == '3') {
			first = 30;
		}
		first += b[0].charAt(1) - 48;
		
		if(b[1].charAt(0) == '1') {
			second = 10;
		}else if(b[1].charAt(0) == '2') {
			second = 20;
		}else if(b[1].charAt(0) == '3') {
			second = 30;
		}
		second += b[1].charAt(1) - 48;
		
		if(first > 12 && second <= 12) {
			System.out.println("EU");
		}else if(second > 12 && first <= 12) {
			System.out.println("US");
		}else {
			System.out.println("either");
		}
		
		sc.close();
	}
}