import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int mul = a * b * c;
		int[] count = new int[10];
		
		for(int i = 0; i < count.length; i++) {
			count[i] = 0;
		}
		
		while(mul != 0) {
			if(mul % 10 == 0) {
				count[0]++;
			}else if(mul % 10 == 1) {
				count[1]++;
			}else if(mul % 10 == 2) {
				count[2]++;
			}else if(mul % 10 == 3) {
				count[3]++;
			}else if(mul % 10 == 4) {
				count[4]++;
			}else if(mul % 10 == 5) {
				count[5]++;
			}else if(mul % 10 == 6) {
				count[6]++;
			}else if(mul % 10 == 7) {
				count[7]++;
			}else if(mul % 10 == 8) {
				count[8]++;
			}else if(mul % 10 == 9) {
				count[9]++;
			}
			mul = mul / 10;
		}
		
		for(int i = 0; i < count.length; i++) {
			System.out.println(count[i]);
		}
		sc.close();
	}
}