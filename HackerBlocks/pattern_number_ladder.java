package HackerBlocks;

import java.util.Scanner;

public class pattern_number_ladder {
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int nst=1;
    int rows=1;
    int value=1;
    while(rows<=n)
    
    {
        int cst=1;
        while(cst<=nst)
        {
         System.out.print(value+"\t");
         cst++;
         value++;
        }
        System.out.println();
        nst++;
        rows++;
    }
    }
}
