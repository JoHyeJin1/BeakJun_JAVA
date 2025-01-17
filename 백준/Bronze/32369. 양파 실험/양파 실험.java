import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int p = 1;
		int q = 1;
		
		for(int i = 0; i < n; i++) {			
			int temp;
			p += a;
			q += b;
			
			if(p < q) {
				temp = p;
				p = q;
				q = temp;
			}else if(p == q) {
				q = q - 1;
			}
		}
		
		System.out.println(p + " " + q);
		sc.close();
	}
}