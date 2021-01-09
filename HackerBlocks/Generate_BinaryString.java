package HackerBlocks;
import java.util.ArrayList;
import java.util.Scanner;

public class Generate_BinaryString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while (n > 0) {
			String str = in.next();
		 wildcard(str,"",0);

			n--;
		}

	}

	public static void wildcard(String str,String ans, int count) {
		if (str.length() == 0) {
			System.out.print(ans+" ");
			return ;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		if (ch == '?') {
			wildcard(ros,ans+"0" , count+1);
			wildcard(ros,ans+"1",count+1);

		} else {
			wildcard(ros,ans+ch , count+1);
			

		}
		

	}
}
