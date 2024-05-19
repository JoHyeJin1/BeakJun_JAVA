import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[18];
		int[] b = new int[18];
		int[] aScore = new int[11];
		int[] bScore = new int[11];
		int totalA = 0;
		int totalB = 0;
		
		for(int i = 0; i < 11; i++) {
			aScore[i] = 0;
			bScore[i] = 0;
		}
		
		for(int i = 0; i < 18; i++) {
			a[i] = sc.nextInt();
			for(int j = 0; j < 11; j++) {
				if(a[i] == j) {
					aScore[j]++;
				}
			}
			totalA += a[i];
		}
		
		for(int i = 0; i < 18; i++) {
			b[i] = sc.nextInt();
			for(int j = 0; j < 11; j++) {
				if(b[i] == j) {
					bScore[j]++;
				}
			}
			totalB += b[i];
		}
		
		int i;
		if(totalA > totalB) {
			System.out.println("Algosia");
		}else if(totalA < totalB) {
			System.out.println("Bajtek");
		}else {
			for(i = 10; i >= 0; i--) {
				if(aScore[i] > bScore[i]) {
					System.out.println("Algosia");
					break;
				}else if(aScore[i] < bScore[i]) {
					System.out.println("Bajtek");
					break;
				}
			}
			
			if(i < 0) {
				System.out.println("remis");
			}
		}
		
		sc.close();
	}
}