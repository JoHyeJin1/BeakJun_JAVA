import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[][] a = new String[10][10];
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				a[i][j] = sc.next();
			}
		}
		
		int flag = 0;
		for(int i = 0; i < 10; i++) {
			int count = 0;
			for(int j = 0; j < 10; j++) {
				if(a[i][0].equals(a[i][j])) {
					count++;
				}
			}
			
			if(count == 10) {
				flag = 1;
				break;
			}
		}
		
		for(int j = 0; j < 10; j++) {
			int count = 0;
			for(int i = 0; i < 10; i++) {
				if(a[0][j].equals(a[i][j])) {
					count++;
				}
			}
			
			if(count == 10) {
				flag = 1;
				break;
			}
		}
		
		System.out.println(flag);
		sc.close();
	}
}