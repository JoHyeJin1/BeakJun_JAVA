import java.util.Scanner;
import java.math.BigInteger;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			BigInteger total = BigInteger.valueOf(0);
			int a = sc.nextInt();
			
			for(int j = 0; j < a; j++) {
				BigInteger b = sc.nextBigInteger();
				total = total.add(b);
			}
			
			if(total.remainder(BigInteger.valueOf(a)).equals(BigInteger.valueOf(0))) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		sc.close();
	}
}