//Palindrome Number
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		int num, n, a, sum=0;
		Scanner sc = new Scanner(System.in);
		num= sc.nextInt();
		n = num;
		while(n>0) {
			a = n%10;
			n = n/10;
			sum = sum*10+a;
		}
		if(sum == num)
			System.out.println("Palindrome Number");
		else
			System.out.println("Not A Palindrome Number");
	}
}