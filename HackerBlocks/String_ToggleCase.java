package HackerBlocks;

import java.util.Scanner;

public class String_ToggleCase {
    public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
for(int i=0;i<str.length();i++)
{
char ch=str.charAt(i);
if(Character.isUpperCase(ch))
ch=Character.toLowerCase(ch);
else if(Character.isLowerCase(ch))
ch=Character.toUpperCase(ch);
System.out.print(ch);
}

}
}
