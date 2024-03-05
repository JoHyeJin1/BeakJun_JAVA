import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int p = sc.nextInt();
		int nh = 0;
		int nm = 0;
		if(m + p < 60) {
			nh = h;
			nm = m + p;
		}else {
			nm = (m + p) % 60;
			nh = h + ((m + p) / 60);
			if(nh >= 24) {
				nh = nh % 24;
			}
		}
		
		System.out.println(nh + " " + nm);
		sc.close();
	}
}