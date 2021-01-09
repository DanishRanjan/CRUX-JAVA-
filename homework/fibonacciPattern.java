package homework;

import java.util.Scanner;

public class fibonacciPattern {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int row = 1;
	int nst = 1;
	int value = 1;
	while (row <= n)
	{
		int cst = 1;
		while (cst <= nst)
		{
			System.out.print(value+"\t");
			cst++;
			value++;
		}
		System.out.println();
		nst++;
		row++;
	}
		

	}

}
