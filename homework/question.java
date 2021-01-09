package homework;
import java.util.*;
public class question {
	 public static void main(String args[]) {
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
	           {
	           ans = r*i+ans;
	           }
	           i*=10;
	           n/=10;
	           
	       }
	       System.out.println(ans);

	    }

}
