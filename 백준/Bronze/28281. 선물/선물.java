import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		int total = 0;
		int[] cost = new int[n];
		
		for(int i = 0; i < n; i++) {
			cost[i] = sc.nextInt();
		}
		
		total = (cost[0] + cost[1]) * x;
		for(int i = 1; i < n - 1; i++) {
			if((cost[i] + cost[i + 1]) * x < total) {
				total = (cost[i] + cost[i + 1]) * x;
			}
		}
		System.out.println(total);
		sc.close();
	}
}