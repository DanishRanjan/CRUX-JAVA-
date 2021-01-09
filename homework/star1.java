package homework;
import java.util.*;
public class star1 {
	public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int nst=1;
    int rows=1;
	while(rows<=n)
	{
	    int cst=1;
		while(cst<=nst)
		{
			System.out.print("*\t");
			cst++;
		}
		System.out.println();
		nst++;
		rows++;
	}	
}
}
