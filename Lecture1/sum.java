package Lecture1;
import java.util.*;
public class sum {

	public static void main(String[] args) {
		System.out.println("Enter a Number:- ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	int sum=0;
		for(int i=1;i<=n;i++)
		{
	
			sum=sum+i;
		}
		System.out.println("the sum :- "+sum);
		

	}

}
