import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int[] b = new int[a + 1];
			for(int j = 0; j < b.length; j++) {
				b[j] = -1;
			}
			
			for(int j = 1; j < b.length; j++) {
				for(int k = j; k < b.length; k++) {
					if(k % j == 0) {
						if(b[k] == -1) {
							b[k] = 1;
						}else if(b[k] == 1) {
							b[k] = -1;
						}
					}
				}
			}
			
			int count = 0;
			for(int j = 0; j < b.length; j++) {
				if(b[j] == 1) {
					count++;
				}
			}
			System.out.println(count);
		}
		sc.close();
	}
}