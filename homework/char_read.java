package homework;
import java.util.*;
public class char_read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
char ch = sc.next().charAt(0);
System.out.println(ch);
int n1 = sc.nextInt();
int n2 = sc.nextInt();
        if(ch=='+')
                {
	                System.out.print(n1+n2);
                }
         else if(ch=='-')
                {
                  System.out.println(n1-n2);	
                 }
         else if(ch=='*')
                {
	                System.out.println(n1*n2);
                 }
         else if(ch=='/')
                {  
	                if(n2!=0)
	                   {
		                  System.out.println(n1/n2);
	                    }
                 }
         else if(ch=='%')
                 {
	                 if(n2!=0)
	                    {
	                      int rem;
	                      rem=n1%n2;
	                      System.out.println(rem);
	                     }
                  }
         else if (ch=='X'|| ch=='x')
                 {
        	          break;
                  }
          else
                 {
	                System.out.println("Invalid operation. Try again.");
                 }

	}

}
