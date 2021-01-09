package HackerBlocks;

import java.util.ArrayList;
import java.util.Scanner;

public class RecursionDictionary_order {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		ArrayList<String> ans = Dictionary(str);
		for(String vall : ans) {
			System.out.println(vall);
		}
	


	}

	public static ArrayList<String> Dictionary(String str) {
		if (str.length() == 0) {
			ArrayList<String> ans = new ArrayList<>();
			ans.add(" ");
			return ans;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> sub = Dictionary(ros);
		ArrayList<String> ans = new ArrayList<>();
		for (String val : sub) {

			for (int i = 0; i < val.length(); i++) {
				if (val.charAt(i) < ch) {
					String add = val.substring(0, i) + ch + val.substring(i);
					if(add.compareTo(str)>0) {
						ans.add(add);
					}

				}
			}
		}
		return ans;
	}
}
