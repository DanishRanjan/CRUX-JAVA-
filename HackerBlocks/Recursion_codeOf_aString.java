package HackerBlocks;

import java.util.ArrayList;
import java.util.Scanner;

public class Recursion_codeOf_aString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		ArrayList<String> arr = new ArrayList<>();
		REcursivestring(str, "",arr);
		System.out.println(arr);
	}

	public static void REcursivestring(String str, String ans,ArrayList<String> arr) {
		if (str.length() == 0) {
			arr.add(ans);
			return;
		}
		int n = Integer.parseInt("" + str.charAt(0));
		char ch = inttochar(n);
		String ros = str.substring(1);
		REcursivestring(ros, ans + ch,arr);
		if (str.length() > 1) {
			int n1 = Integer.parseInt(str.substring(0, 2));
			char ch1 = inttochar(n1);
			String ros1 = str.substring(2);
			if (n1 <= 26) {
				REcursivestring(ros1, ans + ch1,arr);
			}
		}
	}

	public static char inttochar(int n) {
		char ch = (char) (n + 96);
		return ch;
	}
}
