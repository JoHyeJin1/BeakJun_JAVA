import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] score1 = new int[8];
		int[] score2 = new int[8];
		
		for(int i = 0; i < score1.length; i++) {
			score1[i] = sc.nextInt();
			score2[i] = score1[i];
		}
		
		Arrays.sort(score1);
		int min = score1[2];
		int total = 0;
		
		for(int i = 0; i < score2.length; i++) {
			if(min < score2[i]) {
				total += score2[i];
			}
		}
		
		System.out.println(total);
		for(int i = 0; i < score2.length; i++) {
			if(min < score2[i]) {
				System.out.print(i + 1 + " ");
			}
		}
		sc.close();
	}
}