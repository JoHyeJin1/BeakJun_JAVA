import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		double total = 0;
		
		for(int i = 0; i < n; i++) {
			double b = Double.parseDouble(st.nextToken());
			total += b * b * b;
		}
		
		System.out.println(Math.cbrt(total));
	}
}