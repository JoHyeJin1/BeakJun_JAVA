import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		
		int m = sc.nextInt();
		int[] b = new int[m];
		for(int i = 0; i < m; i++) {
			if(binarySearch(a, sc.nextInt()) >= 0) {
				System.out.println("1");
			}else {
				System.out.println("0");
			}
		}
		sc.close();
	}
	
	public static int binarySearch(int[] a, int key) {
		
		int low = 0;
		int high = a.length - 1;
		
		while(low <= high) {
			int mid = (low + high) / 2;
			
			if(key < a[mid]) {
				high = mid - 1;
			}else if(key > a[mid]) {
				low = mid + 1;
			}else {
				return mid;
			}
		}
		
		return -1;
	}
}