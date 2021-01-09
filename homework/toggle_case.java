package homework;
import java.util.*;
class toggle_case{ 
     public static void main(String[] args)  
     { 
        StringBuffer str = new StringBuffer();
        Scanner input = new Scanner(System.in);

        str.append(input.nextLine());
         convertOpposite(str); 
         System.out.println(str); 
        } 
        
        
        static void convertOpposite(StringBuffer str) 
     { 
        int ln = str.length(); 
             
        // Conversion using predefined methods 
        for (int i=0; i<ln; i++) 
        { 
            Character c = str.charAt(i); 
            if (Character.isLowerCase(c)) 
                str.replace(i, i+1, Character.toUpperCase(c)+""); 
            else
                str.replace(i, i+1, Character.toLowerCase(c)+""); 
             
        } 
     }
 } 