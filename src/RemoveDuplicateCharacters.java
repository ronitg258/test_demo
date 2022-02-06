//Remove duplicate characters from string.
import java.util.Scanner;
public class RemoveDuplicateCharacters {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char arr[] = str.toCharArray();
		int n = str.length();
		for (int i = 0; i < n; i++) {
			char ch = str.charAt(i);
			if(str.indexOf(ch, i+1) == -1) {
				sb.append(ch);
			}
		}
		System.out.println(sb);
	}
}