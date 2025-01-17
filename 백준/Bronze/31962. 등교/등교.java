import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		int []total = new int[n];
		int []s = new int[n];
		
		for(int i = 0; i < n; i++) {
			total[i] = 0;
			s[i] = sc.nextInt();
			int t = sc.nextInt();
			if(s[i] + t <= x) {
				total[i] = s[i] + t;
			}
		}
		
		int max = total[0];
		int maxIndex = 0;
		for(int i = 0; i < n; i++) {
			if(max < total[i]) {
				max = total[i];
				maxIndex = i;
			}
		}
		
		if(max == 0) {
			System.out.println("-1");
		}else {
			System.out.println(s[maxIndex]);
		}
		sc.close();
	}
}