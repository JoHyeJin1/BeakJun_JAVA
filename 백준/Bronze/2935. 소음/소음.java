import java.util.Scanner;
import java.math.BigInteger;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BigInteger A = sc.nextBigInteger();
		String B = sc.next();
		BigInteger C = sc.nextBigInteger();
		
		if(B.equals("+")) {
			System.out.println(A.add(C));
		}else if(B.equals("*")) {
			System.out.println(A.multiply(C));
		}
		
		sc.close();
	}
}