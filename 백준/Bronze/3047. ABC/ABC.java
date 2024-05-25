import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		String d = sc.next();
		int[] e = new int[3];
		
		if(a < b && b < c) {
			e[0] = a;
			e[1] = b;
			e[2] = c;
		}else if(a < c && c < b) {
			e[0] = a;
			e[1] = c;
			e[2] = b;
		}else if(b < a && a < c) {
			e[0] = b;
			e[1] = a;
			e[2] = c;
		}else if(b < c && c < a) {
			e[0] = b;
			e[1] = c;
			e[2] = a;
		}else if(c < a && a < b) {
			e[0] = c;
			e[1] = a;
			e[2] = b;
		}else if(c < b && b < a) {
			e[0] = c;
			e[1] = b;
			e[2] = a;
		}
		
		for(int i = 0; i < 3; i++) {
			if(d.charAt(i) == 'A') {
				System.out.print(e[0] + " ");
			}else if(d.charAt(i) == 'B') {
				System.out.print(e[1] + " ");
			}else if(d.charAt(i) == 'C') {
				System.out.print(e[2] + " ");
			}
		}
		sc.close();
	}
}