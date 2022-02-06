// Java Program to find the frequency of odd & even numbers in the given matrix.
import java.util.Scanner;
public class FrequencyOfOddEven {
	public static void main(String[] args) {
		int r, c, a[][], count = 0, count1 = 0;
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		c = sc.nextInt();
		a = new int[r][c];
		for(int i = 0;i<r;i++) {
			for(int j = 0;j<c;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for(int i = 0;i<r;i++) {
			for(int j = 0;j<c;j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		for(int i = 0;i<r;i++) {
			for(int j = 0;j<c;j++) {
				if (a[i][j]%2 == 0)
					count++;
				else
					count1++;
			}
		}
		System.out.println("Count of even number in the matrix is: "+count);
		System.out.println("Count of odd number in the matrix is: "+count1);
	}
}