package HackerBlocks;

import java.util.Scanner;

public class lower_upper {
    public static void main(String args[]) {

Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
	
	if(ch>=97&&ch<=122)
	        {
	            System.out.println("lowercase");
	        }
	    	 
		else if(ch>=65&&ch<=91)
        {
            System.out.println("UPPERCASE");
        }
	        else
	        {
	          System.out.println("invalid");  
	        }
    }
}
