import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(bf.readLine());
		for(int i = 0; i < t; i++) {
			BigInteger n = new BigInteger(bf.readLine());
			System.out.println(n.multiply(n));
		}
		bw.flush();
		bw.close();
	}
}