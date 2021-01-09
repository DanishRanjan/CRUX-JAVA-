package Lecture1;
import java.util.*;
class Prime{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number:- ");
int n = sc.nextInt();
for(int i=2;i<=(n-1);i++)
{
	n=n%i;
}
if(n==0)
{
	System.out.println("Number is not prime");
}
else
{
	System.out.println("Number is prime");
}
}
}