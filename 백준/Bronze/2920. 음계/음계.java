import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[8];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		int ascending = 1;
		int descending = 1;
		for(int i = 0; i < a.length; i++) {
			if(a[i] != i + 1) {
				ascending = 0;
			}
			
			if(a[i] != a.length - i) {
				descending = 0;
			}
		}
		
		if(ascending == 1 && descending == 0) {
			System.out.println("ascending");
		}else if(ascending == 0 && descending == 1) {
			System.out.println("descending");
		}else {
			System.out.println("mixed");
		}
		sc.close();
	}
}