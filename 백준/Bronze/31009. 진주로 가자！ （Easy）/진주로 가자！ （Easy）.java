import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] a = new String[n];
		int[] b = new int[n];
		int index = 0;
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.next();
			b[i] = sc.nextInt();
			if(a[i].equals("jinju")) {
				index = i;
			}
		}
		
		int count = 0;
		for(int i = 0; i < n; i++) {
			if(b[i] > b[index]) {
				count++;
			}
		}
		System.out.println(b[index]);
		System.out.println(count);
		sc.close();
	}
}