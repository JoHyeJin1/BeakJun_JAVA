import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String[] b = a.split("/");
		
		int k = Integer.parseInt(b[0]);
		int d = Integer.parseInt(b[1]);
		int s = Integer.parseInt(b[2]);
		
		if(k + s < d || d == 0) {
			System.out.println("hasu");
		}else {
			System.out.println("gosu");
		}
		sc.close();
	}
}