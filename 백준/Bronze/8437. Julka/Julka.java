import java.math.BigInteger;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		BigInteger c = a.add(b).divide(BigInteger.valueOf(2));
		BigInteger d = a.subtract(b).divide(BigInteger.valueOf(2));
		
		System.out.println(c);
		System.out.println(d);
		sc.close();
	}
}