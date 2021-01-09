package homework;

import java.util.Scanner;

public class PowerOfTwo {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check:-");
		int n = sc.nextInt();
		if(n<=0)
		{
			System.out.println("Number is not a Power of two");
		}
		else
		{
			if(n!= 0 && ((n & (n - 1)) == 0))
			{
				System.out.println("Number is power of two");
			}
			else
			{
				System.out.println("Number is not power of two");
			}
		}
		
	}

}
