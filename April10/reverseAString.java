package April10;
import java.util.*;
public class reverseAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder(str);
		sb = sb.reverse();
		System.out.println(sb);
	
	}

}
