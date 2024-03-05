import java.util.Scanner;
import java.math.BigInteger;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			int a = sc.nextInt();
			BigInteger total = BigInteger.valueOf(0);
			for(int j = 0; j < a; j++) {
				BigInteger b = sc.nextBigInteger();
				total = total.add(b);
			}
			if(total.compareTo(BigInteger.valueOf(0)) == 0) {
				System.out.println("0");
			}else if(total.compareTo(BigInteger.valueOf(0)) > 0) {
				System.out.println("+");
			}else {
				System.out.println("-");
			}
		}
		sc.close();
	}
}