package HackerBlocks;

import java.util.Scanner;

public class CONVERSION_FAHRENHEITTOCELSIUS {
    public static void main(String args[]) 
    {
       Scanner sc = new Scanner(System.in);
        System.out.print("");
        int fmin = sc.nextInt();
        System.out.print("");
        int fmax = sc.nextInt();
        System.out.print("");
        int g = sc.nextInt();
        int c =0;
        while(fmin<=fmax)
        {
            c=(int)((5.0/9)*(fmin-32));
            System.out.println(fmin+" "+c);
            fmin=fmin+g;
        }
        System.out.println();
    }
}
