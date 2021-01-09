package HackerBlocks;

import java.util.Scanner;

public class String_isPalindrome {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String word = sc.nextLine();
    String rev = "";
    int length = word.length();
    for(int i=length-1;i>=0;i--)
    {
    rev = rev+word.charAt(i);    
    }
    if(word.equals(rev))
    {
        System.out.println("true");
    }
    else
    {
    System.out.println("false");    
    }
    
    
    
    }
}
