import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int count5 = 0;
		int count3 = 0;
		int total = 0;
		int i;
		int a = num / 5;
		
		if(num % 5 == 0) {
			count5 = num / 5;
			total = count5 + count3;
			System.out.println(total);
		}else {
			for(i = a; i >= 0; i--) {
				count5 = i;
				count3 = (num - count5 * 5) / 3;
				
				if(count5 * 5 + count3 * 3 == num) {
					break;
				}
			}
			
			if(i == -1) {
				System.out.println("-1");
			}else {
				total = count5 + count3;
				System.out.println(total);
			}
		}
		sc.close();
	}
}