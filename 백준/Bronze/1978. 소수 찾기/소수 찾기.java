import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		int count = 0;
		
		int j;
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			for(j = 2; j < a[i]; j++) {
				if(a[i] % j == 0) {
					break;
				}
			}
			if(j == a[i]) {
				count++;
			}
		}
		
		System.out.println(count);
		sc.close();
	}
}