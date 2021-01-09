package homework;
import java.util.*;

public class testing {
	static void spiralPrint(int m, int n, int a[][]) {
		int i, k = 0, l = 0;

		while (k < m && l < n)
		{
			for (i = l; i < n; ++i) {
				System.out.print(a[k][i] + " ");
		}
			k++;
			
			for (i = k; i < m; ++i) {
				System.out.print(a[i][n - 1] + " ");
			}
			n--;
			if (k < m) {
				for (i = n - 1; i >= l; --i) {
					System.out.print(a[m - 1][i] + " ");
				}
				m--;
			}

			if (l < n) {
				for (i = m - 1; i >= k; --i) {
					System.out.print(a[i][l] + " ");
				}
				l++;
			}
		}
	}

	public static void main(String[] args) {
		int[][] a = { { 11, 12, 13, 14, 15, 16 }, { 21, 22, 23, 24, 25, 26 }, { 31, 32, 33, 34, 35, 36 } };
		spiralPrint(3, 6, a);
	}
}