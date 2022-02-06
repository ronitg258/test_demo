//Remove special characters from string.
import java.util.Scanner;
public class RemoveSpecialCharacters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
	}
}