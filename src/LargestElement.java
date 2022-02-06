// Largest element in a 2d array
import java.util.Scanner;
public class LargestElement {
	public static void main(String[] args) {
		int r, c, a[][], max;
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		c = sc.nextInt();
		a = new int[r][c];
		for(int i = 0;i<r;i++) {
			for(int j = 0;j<c;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		max = a[0][0];
		for(int i = 0;i<r;i++) {
			for(int j = 0;j<c;j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		for(int i = 0;i<r;i++) {
			for(int j = 0;j<c;j++) {
				if (a[i][j]>max)
					max = a[i][j];
			}
		}
		System.out.println("Largest Element in a 2d array is: "+max);
	}
}