package HackerBlocks;

import java.util.Scanner;

public class Delhi_odd_even_kejriwal {
	 public static void main(String args[]) {
		 Scanner s=new Scanner(System.in);
		 		int T=s.nextInt();
		 		int n;
		 		while(T-->0)
		 		{
		 		int counter=0;
		 		int v2=0;
		 		   int v1=0;
		 		int N=s.nextInt();
		 		n=N;
		 		while(N>0)
		 		{
		 		N=N/10;
		 		counter++;
		 		}
		 		while(counter>0)
		 		{
		 		if((n%10)%2==0)
		 		v2=v2+n%10;
		 		else
		 		v1=v1+n%10;
		 		counter--;
		 		n=n/10;
		 		}
		 		if((v1%3==0)||(v2%4==0))
		 		System.out.println("YES");
		 		else
		 		System.out.println("No");
		 		}

		     }
}
