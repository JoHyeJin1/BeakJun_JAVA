import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		
		int total = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] == 136) {
				total += 1000;
			}else if(a[i] == 142) {
				total += 5000;
			}else if(a[i] == 148) {
				total += 10000;
			}else if(a[i] == 154) {
				total += 50000;
			}
		}
		System.out.println(total);
		sc.close();
	}
}