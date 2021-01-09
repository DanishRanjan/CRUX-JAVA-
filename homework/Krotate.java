package homework;
import java.util.*;
public class Krotate {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-->0)
		{
			int n = sc.nextInt();//elements in array
			int k = sc.nextInt();//rotate
			int[] arr = new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			StringBuffer sb = new StringBuffer();
			for(int i=k;i<n;i++)
			{
				sb.append(arr[i]+" ");
			}
			for(int i=0;i<k;i++)
			{
			sb.append(arr[i]+" ");
			}
			System.out.println(sb);
		}
		
//		2
//		5
//		2
//		1
//		2
//		3
//		4
//		5
	}

}
