package Lecture3;
import java.util.*;
public class binarytodecimal 
{
public static void main(String args[])
{
	Scanner sc = new Scanner (System.in);
	System.out.println("");
	int n = sc.nextInt();
	int rem=0;
	int sum=0;
	int i = 0;
	while(n!=0)
	{
		rem=n%10;
		int s = rem*(int)(Math.pow(2,i));
		sum=sum+s;
		i++;
		n /= 10;
	}
	System.out.println(sum);
}
}
