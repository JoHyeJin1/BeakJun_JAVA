import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[28];
		int[] b = new int[30];
		
		for(int i = 0; i < b.length; i++) {
			b[i] = i + 1;
		}
		
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		int j;
		for(int i = 0; i < b.length; i++) {
			for(j = 0; j < a.length; j++) {
				if(b[i] == a[j]) {
					break;
				}
			}
			if(j == a.length) {
				System.out.println(b[i]);
			}
		}
		sc.close();
	}
}