import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int totalY = 0;
		int totalM = 0;
		
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			totalY += (a / 30 + 1) * 10;
			totalM += (a / 60 + 1) * 15;
		}
		
		if(totalY > totalM) {
			System.out.println("M " + totalM);
		}else if(totalY < totalM) {
			System.out.println("Y " + totalY);
		}else {
			System.out.println("Y M " + totalM);
		}
		
		sc.close();
	}
}