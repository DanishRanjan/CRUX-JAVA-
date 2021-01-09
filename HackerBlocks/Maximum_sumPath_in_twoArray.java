package HackerBlocks;

import java.util.Scanner;

public class Maximum_sumPath_in_twoArray {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int ts = in.nextInt();
		while(ts>0) {
			int n = in.nextInt();
			int m = in.nextInt();
			int[] arr1 = takeinput(n);
			int[] arr2 = takeinput(m);
			int piggy=0;
			int sum1 =0 ;
			int sum2 =0;
			int i = 0;
			int j =0;
			int max =0;
			while(i<n && j<m) {
				if(arr1[i]<arr2[j]) {
					sum1+=arr1[i];
					i++;
				}else if(arr1[i]>arr2[j]) {
					sum2+=arr2[j];
					j++;
				}else {
					if(sum1>sum2) {
						max=sum1;
					}else {
						max=sum2;
					}
					piggy+=max+arr1[i];
					i++;
					j++;
					sum1=0;
					sum2=0;
				}
			}
			if(i==n) {
				while(j<m) {
					piggy+=arr2[j];
					j++;
				}
			}else {
				while(i<n) {
					piggy+=arr1[i];
					i++;
				}
				
			}
			System.out.println(piggy);
			ts--;
		}
		

	}
	public static int[] takeinput(int n) {

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		return arr;

	}

}
