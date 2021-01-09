package HackerBlocks;

import java.util.Scanner;

public class BinartToDecimal {
    public static void main(String args[]) {
Scanner sc = new Scanner (System.in);
System.out.print("");
int n = sc.nextInt();
int sum=0;
int i=0;
int rem=0;
while(n!=0)
{
  rem=n%10;
 int p=rem*(int)(Math.pow(2,i));
  sum=sum+p;
  i++;
  n=n/10;
}
System.out.print(sum);

    }
}
