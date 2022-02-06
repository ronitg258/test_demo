//Calculate frequency of each character in a given string.
import java.util.Scanner;
import java.util.*;
public class FrequencyOfCharacter {
	public static void main(String[] args) {
		Map <Character, Integer> map = new HashMap <Character, Integer>();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = str.length();
		for (int i = 0; i < n; i++) {
			char ch = str.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else
				map.put(ch, 1);
		}
		System.out.println(map);
	}
}