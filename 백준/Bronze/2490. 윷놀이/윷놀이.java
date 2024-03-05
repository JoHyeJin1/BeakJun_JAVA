import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			String a = sc.nextLine();
			int count0 = 0;
			
			for(int i = 0; i < a.length(); i++) {
				if(a.charAt(i) == '0') {
					count0++;
				}
			}
			if(count0 == 0) {
				System.out.println("E");
			}else if(count0 == 1) {
				System.out.println("A");
			}else if(count0 == 2) {
				System.out.println("B");
			}else if(count0 == 3) {
				System.out.println("C");
			}else if(count0 == 4) {
				System.out.println("D");
			}
		}
		sc.close();
	}
}