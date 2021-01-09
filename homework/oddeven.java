package homework;
import java.util.*;
public class oddeven {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int a;
	int y=0;
	 for(a=0;a<n;a++)
	 {
		y= sc.nextInt();
	 
	 }
	 for(a=0;a<n;a++)
	 {
	 if(y%2==0)
	 {
	System.out.println("number is even");	 
	 }
	 else if (y%2!=0)
	 {
		 System.out.println("number is odd");
	 }	 
} 
}
}
