import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int mack = 0;
			int zack = 0;
			int[] a = new int[10];
			for(int j = 0; j < 10; j++) {
				a[j] = sc.nextInt();
				if(a[j] == 17) {
					zack = 1;
				}
				if(a[j] == 18) {
					mack = 1;
				}
			}
			
			for(int j = 0; j < 10; j++) {
				System.out.print(a[j] + " ");
			}
			System.out.println();
			if(mack == 0 && zack == 0) {
				System.out.println("none");
			}else if(mack == 1 && zack == 0) {
				System.out.println("mack");
			}else if(mack == 0 && zack == 1) {
				System.out.println("zack");
			}else if(mack == 1 && zack == 1) {
				System.out.println("both");
			}
			System.out.println();
		}
		sc.close();
	}
}