//Reverse a given string.
import java.util.Scanner;
public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char arr[] = str.toCharArray();
		int n = str.length();
		for (int i = n-1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
	}
}