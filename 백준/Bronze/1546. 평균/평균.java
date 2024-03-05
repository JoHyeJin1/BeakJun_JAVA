import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] score = new double[n];
		double[] newScore = new double[n];
		
		for(int i = 0; i < score.length; i++) {
			score[i] = sc.nextDouble();
		}
		
		double max = score[0];
		for(int i = 0; i < score.length; i++) {
			max = Math.max(max, score[i]);
		}
		
		double newTotal = 0;
		for(int i = 0; i < score.length; i++) {
			newScore[i] = score[i] / max * 100;
			newTotal += newScore[i];
		}
		
		System.out.println(newTotal / n);
		sc.close();
	}
}
