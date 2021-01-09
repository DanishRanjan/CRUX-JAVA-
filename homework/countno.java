package homework;
import java.util.*;
public class countno {

	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("");
	int n = sc.nextInt();
	System.out.println("");
	int m= sc.nextInt();
	int count=0;
while(n!=0)
{
	if(n%10==m)
	{
		count++;
		
	}
	n=n/10;
	
}
System.out.println(count);
	}

}
