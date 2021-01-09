package HackerBlocks;

import java.util.Scanner;

public class Print_Primes {
    public static void main(String args[]) {
  Scanner sc = new Scanner(System.in);
  System.out.print("");
  int n = sc.nextInt();
  if(n>1&&n<1000)
  {    
  for(int k=2;k<=n;k++)
  {
      int temp=0;
      for(int i=2;i<=(k-1);i++)
      {
          if(k%i==0)
          {
              temp=temp+1;
          }
      }
      if(temp==0)
      {
          System.out.println(k);
      }
  }
}
  }
}
