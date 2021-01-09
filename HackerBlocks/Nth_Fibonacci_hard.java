package HackerBlocks;

import java.util.Scanner;

public class Nth_Fibonacci_hard {
	  public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int a,b,s;
	        a=1;
	        b=1;
	        for(int i=1;i<n;i++)
	        {
	            s=a+b;
	            a=b;
	            b=s;
	        }
	        System.out.println(a);
	        // Your Code Here
	    }
}
