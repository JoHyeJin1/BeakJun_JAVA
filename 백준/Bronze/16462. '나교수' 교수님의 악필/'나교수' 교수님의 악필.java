import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] score = new int[n];
		
		for(int i = 0; i < n; i++) {
			score[i] = sc.nextInt();
		}
		
		double total = 0;
		for(int i = 0; i < n; i++) {			
			if(score[i] / 10 == 10) {
				total += 100;
			}else if(score[i] / 10 == 6 || score[i] / 10 == 9) {
				total += 90;
				if(score[i] % 10 == 0 || score[i] % 10 == 6 || score[i] % 10 == 9) {
					total += 9;
				}else {
					total += score[i] % 10;
				}
			}else {
				total += (score[i] / 10) * 10;
				if(score[i] % 10 == 0 || score[i] % 10 == 6 || score[i] % 10 == 9) {
					total += 9;
				}else {
					total += score[i] % 10;
				}
			}
		}
		
		double average = total / n;
		System.out.println(Math.round(average));
		sc.close();
	}
}