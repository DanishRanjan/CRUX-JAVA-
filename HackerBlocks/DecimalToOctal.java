package HackerBlocks;

import java.util.Scanner;

public class DecimalToOctal {
	public static void main(String args[])
	{

	Scanner sc = new Scanner (System.in);
			System.out.print("");
			int n = sc.nextInt();
			int rem=0;
			int sum=0;
			int i = 0;
			while(n!=0)
			{
				rem=n%8;
				int s = rem*(int)(Math.pow(10,i));
				sum=sum+s;
				i++;
				n /= 8;
			}
			System.out.println(sum);
			

	    
	}
}
