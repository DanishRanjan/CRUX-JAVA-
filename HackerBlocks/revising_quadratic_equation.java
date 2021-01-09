package HackerBlocks;

import java.util.Scanner;

public class revising_quadratic_equation {
    public static void main(String args[]) {
 Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int D = (b*b)-(4*a*c);
        int alpha;
        int beta;
        if(D>0)
                {
                System.out.println("Real and Distinct"); 
                alpha=(int)((-b+Math.sqrt(D))/(2*a));
                beta=(int)((-b-Math.sqrt(D))/(2*a));
                    System.out.println(beta+" "+alpha);
                }
        else if(D==0)
                {
                   System.out.println("Real and Equal");
                   alpha = -b/(2*a);
                   beta = -b/(2*a);
                    System.out.println(beta+" "+alpha);
                }
        else if(D<0)
                {
                    System.out.println("Imaginary");
                }
    }
}
