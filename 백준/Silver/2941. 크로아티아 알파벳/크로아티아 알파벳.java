import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int count = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'c') {
				if(i + 1 < s.length()) {
					if(s.charAt(i + 1) == '=') {
						i++;
						count++;
					}else if(s.charAt(i + 1) == '-') {
						i++;
						count++;
					}else {
						count++;
					}
				}else {
					count++;
				}
			}else if(s.charAt(i) == 'd') {
				if(i + 1 < s.length()) {
					if(s.charAt(i + 1) == '-') {
						i++;
						count++;
					}else if(i + 2 < s.length()) {
						if(s.charAt(i + 1) == 'z' && s.charAt(i + 2) == '=') {
							i += 2;
							count++;
						}else {
							count++;
						}
					}else {
						count++;
					}
				}else {
					count++;
				}
			}else if(s.charAt(i) == 'l') {
				if(i + 1 < s.length()) {
					if(s.charAt(i + 1) == 'j') {
						i++;
						count++;
					}else {
						count++;
					}
				}else {
					count++;
				}
			}else if(s.charAt(i) == 'n') {
				if(i + 1 < s.length()) {
					if(s.charAt(i + 1) == 'j') {
						i++;
						count++;
					}else {
						count++;
					}
				}else {
					count++;
				}
			}else if(s.charAt(i) == 's') {
				if(i + 1 < s.length()) {
					if(s.charAt(i + 1) == '=') {
						i++;
						count++;
					}else {
						count++;
					}
				}else {
					count++;
				}
			}else if(s.charAt(i) == 'z') {
				if(i + 1 < s.length()) {
					if(s.charAt(i + 1) == '=') {
						i++;
						count++;
					}else {
						count++;
					}
				}else {
					count++;
				}
			}else {
				count++;
			}
		}
		
		System.out.println(count);
		sc.close();
	}
}