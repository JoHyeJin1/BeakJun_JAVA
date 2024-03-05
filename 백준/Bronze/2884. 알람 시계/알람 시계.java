import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int outputH, outputM;
		
		if(m >= 45) {
			outputH = h;
			outputM = m - 45;
		}else {
			outputM = 60 - (45 - m);
			if(h == 0) {
				outputH = 23;
			}else {
				outputH = h - 1;
			}
		}
		
		System.out.println(outputH + " " + outputM);
		sc.close();
	}
}