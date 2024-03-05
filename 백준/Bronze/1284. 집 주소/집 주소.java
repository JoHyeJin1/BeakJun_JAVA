import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		
		while(a.equals("0") == false) {
			int total = 0;
			for(int i = 0; i < a.length(); i++) {
				if(a.charAt(i) == '1') {
					total += 2;
				}else if(a.charAt(i) == '2') {
					total += 3;
				}else if(a.charAt(i) == '3') {
					total += 3;
				}else if(a.charAt(i) == '4') {
					total += 3;
				}else if(a.charAt(i) == '5') {
					total += 3;
				}else if(a.charAt(i) == '6') {
					total += 3;
				}else if(a.charAt(i) == '7') {
					total += 3;
				}else if(a.charAt(i) == '8') {
					total += 3;
				}else if(a.charAt(i) == '9') {
					total += 3;
				}else if(a.charAt(i) == '0') {
					total += 4;
				}
				total++;
			}
			total += 1;
			System.out.println(total);
			a = sc.next();
		}
		sc.close();
	}
}