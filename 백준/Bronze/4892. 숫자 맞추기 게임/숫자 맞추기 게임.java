import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n0 = sc.nextInt();
		int n1, n2, n3, n4;
		int i = 1;
		
		while(n0 != 0) {
			n1 = 3 * n0;
			if(n1 % 2 == 0) {
				n2 = n1 / 2;
			}else {
				n2 = (n1 + 1) / 2;
			}
			n3 = 3 * n2;
			n4 = n3 / 9;
			if(n1 % 2 == 0) {
				System.out.print(i + ". even ");
			}else {
				System.out.print(i + ". odd ");
			}
			System.out.println(n4);
			n0 = sc.nextInt();
			i++;
		}
		sc.close();
	}
}