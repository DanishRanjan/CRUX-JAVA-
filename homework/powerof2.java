package homework;

import java.util.Scanner;

public class powerof2 {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-->0)
		{
		  long n = sc.nextLong();//Enter the number
		  if(n<=0)
		  {
		      System.out.println("NO");
		  }
		  else
		  {
		     if(n!= 0 && ((n & (n - 1)) == 0))
		          System.out.println("YES");
		      else
		          System.out.println("NO");
		  }
		}
	}
}
