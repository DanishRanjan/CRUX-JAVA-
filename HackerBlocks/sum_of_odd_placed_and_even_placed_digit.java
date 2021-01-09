package HackerBlocks;

import java.util.Scanner;

public class sum_of_odd_placed_and_even_placed_digit {
    public static void main(String args[]) {
 Scanner sc = new Scanner(System.in);

         int N1 = sc.nextInt();
         int Even = 0;
         int Odd = 0;
         int count = 0;
         int p;
         while (N1 != 0) {
          p = N1 % 10;
          count++;
          N1 = N1 / 10;
         if (count % 2 == 0) {
            Even = Even + p;
                         } 
         else {
        	 Odd= Odd + p;
                 }
         }
         System.out.println(Odd);

         System.out.println(Even);
    }
}
