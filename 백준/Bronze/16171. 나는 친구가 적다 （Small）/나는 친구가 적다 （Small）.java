import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String s = bf.readLine();
		String newS = "";
		
		String find = bf.readLine();
		for(int i = 0; i < s.length(); i++) {
			if('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
				newS += s.charAt(i);
			}else if('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
				newS += s.charAt(i);
			}
		}
		
		if(newS.contains(find)) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}
}