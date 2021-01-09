package codingBlocksSelfPractise;
import java.util.*;
public class TimeCheck {
public static void main(String args[])
{
	long start = System.currentTimeMillis();
	//appendString(1000000);
	appendStringBuilder(1000000);
	long end = System.currentTimeMillis();
	System.out.println(end-start);
	
}
public static void appendString(int n)
{
 String str ="";
   for(int i=0;i<=n;i++)
     {
	     str=str+" ";
     }
   
}

public static void appendStringBuilder(int n)
{
	StringBuilder sb = new StringBuilder();
	for(int i=0;i<=n;i++)
	{
		sb.append(i);
	}
	
}
}
