//Fibonacci Series
public class Fibonacci {
	public static void main(String[] args) {
		int i=0, j=1, sum=0, n=0;
		System.out.print(i+" ");
		System.out.print(j+" ");
		while(n<10) {
			System.out.print((i+j)+" ");
			sum = i+j;
			i = j;
			j = sum;
			n++;
		}
	}
}