import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] a = new int[9][9];
		int max = -1;
		int maxI = 0;
		int maxJ = 0;
		int i, j;
		
		for(i = 0; i < 9; i++) {
			for(j = 0; j < 9; j++) {
				a[i][j] = sc.nextInt();
				if(max < a[i][j]) {
					max = a[i][j];
					maxI = i + 1;
					maxJ = j + 1;
				}
			}
		}
		System.out.println(max);
		System.out.println(maxI + " " + maxJ);
		sc.close();
	}
}