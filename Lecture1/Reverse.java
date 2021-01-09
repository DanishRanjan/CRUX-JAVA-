package Lecture1;
import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number to Reverse:- ");
		int a = sc.nextInt();
		int reverse = 0;
		int rem=0;
		while(a!=0)
		{
			 rem=a%10;
			 reverse=reverse*10+rem;
			 a=a/10;
		}
		System.out.println(reverse);
		
		
	}

}
 