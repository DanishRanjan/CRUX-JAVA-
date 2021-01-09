package HackerBlocks;

import java.util.Scanner;

public class GCD {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h;
        for(h=a<b?a:b;h>=1;h--)
        {
            if(a%h==0&&b%h==0)
            break;
        }
        System.out.println(h);

    }
}
