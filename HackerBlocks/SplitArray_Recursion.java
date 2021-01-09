package HackerBlocks;

import java.util.Scanner;

public class SplitArray_Recursion {
	 static int count1 = 0;
	    public static void main(String[] args) {
	        Scanner scn = new Scanner(System.in);
	        int N = scn.nextInt();
	        int[] arr = new int[N];
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = scn.nextInt();
	        }
	        sumstr(arr, "", "", 0);
	        System.out.println(count1);
	    }
	    public static void sumstr(int[] arr, String ans1, String ans2, int count) {
	        if (count == arr.length) {
	            if (sum(ans1) == sum(ans2)) {
	                System.out.println(ans1 + "and " + ans2);
	                count1++;
	            }
	            return;
	        }
	        sumstr(arr, ans1 + arr[count] + " " , ans2, count + 1);
	        sumstr(arr, ans1, ans2 + arr[count] + " ", count + 1);
	    }
	    public static int sum(String str) {
	        int sum = 0;
	        for (int i = 0; i < str.length(); i += 2) {
	            sum = sum + (str.charAt(i) - '0');
	        }
	        
	        return sum;
	    }
}
