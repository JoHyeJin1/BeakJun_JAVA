import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String in = "";
		in = sc.next();
		String out = "";
		
		int tmp;
		for(int i = 0; i < in.length(); i++) {
			tmp = (int)in.charAt(i);
			if('A' <= tmp && tmp <= 'Z') {
				out += (char)(tmp + 32);
			}else if('a' <= tmp && tmp <= 'z') {
				out += (char)(tmp - 32);
			}
		}
		
		System.out.println(out);
		sc.close();
	}
}
