package HackerBlocks;

import java.util.Scanner;

public class StringMax_FrequencyCharacter {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		String arr = elements(str);
		int[] count = new int[arr.length()];
		int max = 0;
		for(int i =0 ; i<arr.length() ; i++) {
			int total = 0 ;
			for(int j =0 ;j <str.length() ; j++) {
				if(arr.charAt(i)==str.charAt(j)) {
					total++;
				}
				
			}
			if(total >max) {
				max=total;
			}
			count[i]=total;
		}
		String ans ="";
		for(int i =0 ; i<count.length ; i++) {
			if(count[i]==max) {
				ans+=arr.charAt(i);
			}
			
		}
		System.out.println(ans);
		

	}
	public static String elements(String str) {
		String arr = "";
		for(int i = 0; i <str.length();i++) {
			int count =0;
			for(int j =0 ; j<arr.length();j++) {
				if(arr.charAt(j) == str.charAt(i)) {
					count++;
				}
			}
			if(count==0) {
				arr=arr+str.charAt(i);
			}
		}
		return arr;
	}
}
