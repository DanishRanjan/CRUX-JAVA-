package HackerBlocks;

import java.util.Scanner;

public class Print_fibonacci_numbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
  System.out.print("");
  int n = sc.nextInt();
  int t1=0;
  int t2=1;
  while(t1<=n)
  {
    System.out.println(t1+" ");
      int sum = t1+t2;
      t1=t2;
      t2=sum;   
  } 
  }
}
