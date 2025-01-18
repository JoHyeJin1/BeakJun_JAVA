import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[k];
		int[] newA = new int[k];
		
		for(int i = 0; i < k; i++) {
			a[i] = n * (i + 1);
			newA[i] = 0;
		}
		
		for(int i = 0; i < k; i++) {
			while(a[i] != 0) {
				newA[i] = newA[i] * 10 + a[i] % 10;
				a[i] = a[i] / 10;
			}
		}
		
		int max = newA[0];
		for(int i = 1; i < k; i++) {
			if(max < newA[i]) {
				max = newA[i];
			}
		}
		System.out.println(max);
		sc.close();
	}
}