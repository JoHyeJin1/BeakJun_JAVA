import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int score[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			score[i] = sc.nextInt();
		}
		
		int total = 0;
		
		for(int i = 0; i < n; i++) {
			int count = 0;
			for(int j = i; j < n; j++) {
				if(score[j] == 1) {
					count++;
				}else {
					break;
				}
			}
			
			for(int j = 0; j <= count; j++) {
				total += j;
			}
			i = i + count;
		}
		System.out.println(total);
		sc.close();
	}
}