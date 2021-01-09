package RecursionMarch30;

public class powerofANumber {
public static void main(String args[])
{
	System.out.println(Power(2, 5));
}
public static int Power(int x, int n)
{
	if(n==0)
	{
		return 1;
	}
	 int pnm1 = Power(x, n-1);
	 int p = x*pnm1;
	 return p;
}
}
