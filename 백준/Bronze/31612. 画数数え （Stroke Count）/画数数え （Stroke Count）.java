import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String a = sc.next();
		int sum = 0;
		
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) == 'j') {
				sum += 2;
			}else if(a.charAt(i) == 'o') {
				sum += 1;
			}else if(a.charAt(i) == 'i') {
				sum += 2;
			}
		}
		
		System.out.println(sum);
		sc.close();
	}
}