package HackerBlocks;

import java.util.Scanner;

public class fibonacci_pattern {
    public static void main(String args[]) {
int row=1;
int nst=1;
int fn =0;
int sn=1;
int next=0;
Scanner sc=new Scanner (System.in);
int n = sc.nextInt();
while(row<=n)
{
	int cst=1;
	while(cst<=nst)
	{
		System.out.print(fn+"\t");
		next=fn+sn;
		fn=sn;
		sn=next;
		cst++;
	}
	System.out.println();
	nst++;
	row++;
}
    }
}
