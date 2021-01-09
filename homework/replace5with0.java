package homework;
import  java.util.*;
public class replace5with0 {

	public static void main(String[] args) {
		// TODO Auto-generated method s
		Scanner sc = new Scanner (System.in);
        System.out.print("");
        int n = sc.nextInt();
       int ans=0;
       int i=1;
       int r;
       while(n>0)
       {
           r = n%10;
           if(r==0)
           {
               ans=5*i+ans;
           }
           else
           {ans = r*i+ans;}
           i*=10;
           n/=10;
       }
       System.out.println(ans);


	}

}
