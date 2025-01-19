import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] size = new int[n];
		
		for(int i = 0; i < n; i++) {
			size[i] = sc.nextInt();
		}
		
		int left = 1;
		int leftMax = size[0];
		for(int i = 0; i < n; i++) {
			if(leftMax < size[i]) {
				left++;
				leftMax = size[i];
			}
		}
		
		int right = 1;
		int rightMax = size[size.length - 1];
		for(int i = size.length - 1; i >= 0; i--) {
			if(rightMax < size[i]) {
				right++;
				rightMax = size[i];
			}
		}
		System.out.println(left);
		System.out.println(right);
		sc.close();
	}
}