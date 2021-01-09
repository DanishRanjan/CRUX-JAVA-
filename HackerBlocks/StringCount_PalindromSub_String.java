package HackerBlocks;

import java.util.Scanner;

public class StringCount_PalindromSub_String {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String  str = in.next();
		palindrome_substring(str);

	}
	public static void palindrome_substring(String str) {
		int count = 0;
		for (int i = 0; i <= str.length(); i++) {
			for(int j = i+1 ; j<= str.length(); j++) {
				String str1 = str.substring(i, j);
			
				if(IsPalindrome(str1)) {
			
				count++;
				}
			}

		}
		System.out.println( count);
	
	
	}
	public static boolean IsPalindrome(String str) {
		for(int i = 0; i<((str.length()/2)); i++) {
			if(str.charAt(i)!=str.charAt(str.length()-1-i)) {
				return false;
			}
		}
		return true;
	}
}
