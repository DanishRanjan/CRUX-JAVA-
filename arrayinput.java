import java.util.*;
public class arrayinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long num[2][2];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
			num[i][j]=sc.nextLong();
			
		}
		System.out.println(num[i][j]);
        
	}

}
