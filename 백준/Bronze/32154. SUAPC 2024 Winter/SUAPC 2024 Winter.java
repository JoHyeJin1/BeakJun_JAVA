import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int w = sc.nextInt();
		if(w == 1) {
			System.out.println("11");
			System.out.println("A B C D E F G H J L M");
		}else if(w == 2 || w == 3) {
			System.out.println("9");
			System.out.println("A C E F G H I L M");
		}else if(w == 4) {
			System.out.println("9");
			System.out.println("A B C E F G H L M");
		}else if(5 <= w && w <= 9) {
			System.out.println("8");
			System.out.println("A C E F G H L M");
		}else if(w == 10) {
			System.out.println("8");
			System.out.println("A B C F G H L M");
		}
		sc.close();
	}
}