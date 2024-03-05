import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int h = sc.nextInt();
		int v = sc.nextInt();
		int volume = 1;
		
		if(h > n - h) {
			volume *= h;
		}else {
			volume *= n - h;
		}
		
		if(v > n - v) {
			volume *= v;
		}else {
			volume *= n - v;
		}
		
		volume = volume * 4;
		System.out.println(volume);
		
		sc.close();
	}
}