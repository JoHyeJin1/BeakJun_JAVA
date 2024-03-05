import java.util.HashSet;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i = 0; i < 10; i++) {
			int a = sc.nextInt();
			set.add(a % 42);
		}
		System.out.println(set.size());
		sc.close();
	}
}