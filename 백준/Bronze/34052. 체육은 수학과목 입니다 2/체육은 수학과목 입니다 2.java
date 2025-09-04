import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int[] list = new int[5];
		for(int i = 0; i < list.length - 1; i++) {
			list[i] = sc.nextInt();
		}
		list[4] = 300;
		
		for(int i = 0; i < list.length; i++) {
			sum += list[i];
		}
		
		if(sum <= 1800) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		sc.close();
	}
}