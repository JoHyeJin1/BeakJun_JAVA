import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String []a = new String[7];
		int []b = new int[7];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.next();
			b[i] = sc.nextInt();
		}
		
		int max = b[0];
		int maxIndex = 0;
		for(int i = 1; i < b.length; i++) {
			if(max < b[i]) {
				max = b[i];
				maxIndex = i;
			}
		}
		
		System.out.println(a[maxIndex]);
		sc.close();
	}
}