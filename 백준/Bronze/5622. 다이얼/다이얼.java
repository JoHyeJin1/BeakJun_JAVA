import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int time = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(65 <= (int)s.charAt(i) && (int)s.charAt(i) <= 67) {
				time += 2;
			}else if(68 <= (int)s.charAt(i) && (int)s.charAt(i) <= 70) {
				time += 3;
			}else if(71 <= (int)s.charAt(i) && (int)s.charAt(i) <= 73) {
				time += 4;
			}else if(74 <= (int)s.charAt(i) && (int)s.charAt(i) <= 76) {
				time += 5;
			}else if(77 <= (int)s.charAt(i) && (int)s.charAt(i) <= 79) {
				time += 6;
			}else if(80 <= (int)s.charAt(i) && (int)s.charAt(i) <= 83) {
				time += 7;
			}else if(84 <= (int)s.charAt(i) && (int)s.charAt(i) <= 86) {
				time += 8;
			}else if(87 <= (int)s.charAt(i) && (int)s.charAt(i) <= 90) {
				time += 9;
			}
		}
		time += s.length();
		System.out.println(time);
		sc.close();
	}
}