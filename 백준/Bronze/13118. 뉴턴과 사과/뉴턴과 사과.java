import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[4];
		int i;
		for(i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();
		for(i = 0; i < a.length; i++) {
			if(a[i] == x) {
				break;
			}
		}
		
		if(i == a.length) {
			System.out.println("0");
		}else {
			System.out.println(i + 1);
		}
		sc.close();
	}
}
