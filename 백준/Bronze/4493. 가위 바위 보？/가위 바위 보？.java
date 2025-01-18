import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int p1Win = 0;
			int p2Win = 0;
			
			for(int j = 0; j < n; j++) {
				String p1 = sc.next();
				String p2 = sc.next();
				
				if(p1.equals("R")) {
					if(p2.equals("P")) {
						p2Win++;
					}else if(p2.equals("S")) {
						p1Win++;
					}
				}else if(p1.equals("S")) {
					if(p2.equals("R")) {
						p2Win++;
					}else if(p2.equals("P")) {
						p1Win++;
					}
				}else if(p1.equals("P")) {
					if(p2.equals("R")) {
						p1Win++;
					}else if(p2.equals("S")) {
						p2Win++;
					}
				}
			}
			if(p1Win > p2Win) {
				System.out.println("Player 1");
			}else if(p1Win < p2Win) {
				System.out.println("Player 2");
			}else {
				System.out.println("TIE");
			}
		}
		sc.close();
	}
}