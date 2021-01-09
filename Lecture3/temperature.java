package Lecture3;
public class temperature {
public static void main(String args[])
{
	int f=0;
	int fmax=300;
	while(f<=fmax)
	{
		int c=(int)((5.0/9)*(f-32));
	    System.out.println(f+"\t"+c);
	    f=f+20;
	}
}
}