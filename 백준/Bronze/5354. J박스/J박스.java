import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] c = new int[n];
		for(int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			if(c[i] != 1) {
				for(int j = 0; j < c[i]; j++) {
					System.out.print("#");
				}
				System.out.println();
				int b = c[i] - 2;
				
				for(int k = 0; k < b; k++) {
					System.out.print("#");
					for(int j = 0; j < b; j++) {
						System.out.print("J");
					}
					System.out.println("#");
				}
				
				for(int j = 0; j < c[i]; j++) {
					System.out.print("#");
				}
				System.out.println();
				System.out.println();
			}else if(c[i] == 1) {
				System.out.println("#");
				System.out.println();
			}
		}
		sc.close();
	}
}