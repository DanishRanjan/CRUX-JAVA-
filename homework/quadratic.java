package homework;
import java.util.*;
public class quadratic {
	public static void main(String args[])
	{
	     Scanner sc = new Scanner(System.in);
	        int a=sc.nextInt();
	        int b=sc.nextInt();
	        int c=sc.nextInt();
	        int sum=0;
	        int x=0;
	        int m,n;
	        sum=(int)(a*x*x+b*x+c);
	        int D=(b*b-4*a*c);
	        if(D>0)
	        {
	        	m = (int)(((-b+Math.sqrt(D))/(2*a)));
	        	m = (int)(((-b-Math.sqrt(D))/(2*a)));
	        	System.out.println("Real and Distinct");
	        	System.out.print(n+" "+m);
	        }
	}

}
