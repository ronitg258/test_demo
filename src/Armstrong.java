//Armstrong Number
import java.util.Scanner;
import java.lang.Math;
public class Armstrong {
	public static void main(String[] args) {
		int n, n1, num, sum=0;
		double a, count=0;
		Scanner sc  = new Scanner(System.in);
		n = sc.nextInt();
		num = n;
		n1 = n;
		while(n>0) {
			n=n/10;
			count+=1;
		}
		while(n1>0) {
			a = n1%10;
			n1 = n1/10;
			sum= sum+(int)(Math.pow(a,count));
		}
		if(sum == num)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not A Armstrong Number");
	}
}