import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int total = 0;
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			int count = 0;
			for(int j = i; j < n - 1; j++) {
				if(a[j + 1] == a[j] + 1) {
					count++;
				}else {
					break;
				}
			}
			total += a[i];
			i = i + count;
		}
		System.out.println(total);
		sc.close();
	}
}