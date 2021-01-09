package HackerBlocks;

import java.util.Scanner;

public class LCM {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int l;
        for(l=1;l<=(a*b);l++)
        {
            if(l%a==0&&l%b==0)
            break;
        }
        System.out.println(l);
    }
}
