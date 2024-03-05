import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
			
			String room = "";
			if(n % h != 0) {
				room += n % h;
				if(n / h + 1 < 10) {
					room += "0";
				}
				room += n / h + 1;
			}else if(n % h == 0){
				room += h;
				if(n / h < 10) {
					room += "0";
				}
				room += n / h;
			}
			System.out.println(room);
		}
		sc.close();
	}
}