package homework;
import java.util.*;
public class palindrome
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
String word = sc.nextLine();
int length = word.length();
String rev = "";
for(int i=length-1;i>=0;i--)
{
	rev = rev+word.charAt(i);
}

if(word.equals(rev))
{
	System.out.println("true");
}
else
{
	System.out.println("false");
}
}
}


