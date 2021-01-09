package PepCoding;
import java.util.*;
public class Sumof_twoArray {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of element:- ");
	int n1=sc.nextInt();
	int[] a1 = new int[n1];
	for(int i=0;i<a1.length;i++)
	{
		a1[i]=sc.nextInt();
	}
	
	System.out.println("Enter the number of element:- ");
	int n2 = sc.nextInt();
	int[] a2 = new int[n2];
	for(int j=0;j<a2.length;j++)
	{
		a2[j]=sc.nextInt();
	}
	
	
	int[] sum = new int[n1>n2?n1:n2];
	int carry=0;
	int digit=0;
	int i=a1.length-1;
	int j=a2.length-1;
	int k=sum.length-1;
	while(k>=0)
	{
		digit=carry;
		if(i>=0)
		{
			digit=digit+a1[i];
		}
		
		if(j>=0)
		{
			digit=digit+a2[j];
		}
		
		carry=digit/10;
		digit=digit%10;
		sum[k]=digit;
		
		i--;
		j--;
		k--;
	}
	if(carry>0)
	{
		System.out.println(carry);
	}
	for(int val:sum)
	{
		System.out.println(val);
	}
	
 }
}