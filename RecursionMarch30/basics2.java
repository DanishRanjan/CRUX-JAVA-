package RecursionMarch30;

public class basics2 {
public static void main(String args[])
{
	PI(1);
}
public static void PI(int n)
{
	if(n>5)
	{
		return;
	}
	System.out.println(n);
	PI(n+1);
}
}
