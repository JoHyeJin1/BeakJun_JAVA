import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int[] num1 = new int[a];
		int[] num2 = new int[a];
		long N1 = 0;
		long N2 = 0;
		
		for(int i = 0; i < a; i++) {
			num1[i] = sc.nextInt();
		}
		
		for(int i = 0; i < a; i++) {
			num2[i] = sc.nextInt();
		}
		
		for(int i = 0; i < a; i++) {
			int n = num1[i];
			if(digit(n) == 1) {
				N1 *= 10;
				N1 += num1[i];
			}else if(digit(n) == 2) {
				N1 *= 100;
				N1 += num1[i];
			}
		}
		
		for(int i = 0; i < a; i++) {
			int n = num2[i];
			if(digit(n) == 1) {
				N2 *= 10;
				N2 += num2[i];
			}else if(digit(n) == 2) {
				N2 *= 100;
				N2 += num2[i];
			}
		}
		
		if(N1 <= N2) {
			System.out.println(N1);
		}else {
			System.out.println(N2);
		}
		sc.close();
	}
	
	public static int digit(int n) {
		int count = 0;
		while(n != 0) {
			count++;
			n = n / 10;
		}
		
		return count;
	}
}