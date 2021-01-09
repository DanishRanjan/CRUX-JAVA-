import java.util.*;
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
System.out.println("Enter a number : ");
int num=s.nextInt();
if(num%2==0)
{
System.out.println("Even Number");
}
else
{
	System.out.println("Odd Number");
}
System.out.println("Do you want to check another number y/n");
String st=s.next();
char ch=st.charAt(0);
while(ch=='y'||ch=='Y')
{
	num=s.nextInt();
	if(num%2==0)
	{
		System.out.println("Even Number");
	}
	else
	{
		System.out.println("Odd Number");
	}
	System.out.println("Do you want to check another number y/n");
	st=s.next();
	ch=st.charAt(0);
}
	}

}
