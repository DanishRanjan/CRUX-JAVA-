package HackerBlocks;

import java.util.Scanner;

public class count_digits {
    public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.print("");
int a= sc.nextInt();
System.out.print("");
int b=sc.nextInt();
int count=0;
while(a!=0)
{
    if(a%10==b)
    {
    count++;
    
    }
    a=a/10;
}
System.out.print(count);

    }
}
