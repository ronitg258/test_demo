// Spiral Problem
import java.util.Scanner;
public class Spiral {
	public static void main(String args[]) {
		int n, top, left, right, bottom, i=0, k=1;
		int a[][];
		
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		top = 0; left = 0; right = n-1; bottom = n-1;
		a = new int[n][n];
		while(top<=bottom && left<=right) {
			for(i = left;i<right;i++) {
				a[top][i] = k++;
			}
			for(i = top;i<bottom;i++) {
				a[i][right] = k++;
			}
			for(i = right;i>left;i--) {
				a[bottom][i] = k++;
			}
			for(i = bottom;i>top;i--) {
				a[i][left] = k++;
			}
			top++; left++; right--; bottom--; 
		}
		for(i = 0;i<n;i++) {
			for(int j = 0;j<n;j++){
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
}