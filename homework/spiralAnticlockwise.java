package homework;
import java.util.*;
public class spiralAnticlockwise {
	public static int row,col;
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	row = sc.nextInt();
	 col = sc.nextInt();
	int[][] array = new int[row][col];
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			array[i][j] = sc.nextInt();
		}
	}
	spiralPrint(array);
	
}

public static void spiralPrint(int[][] array)
{
	int dir=1;
	int left = 0;
	int top = 0;
	int right = col-1;
	int bottom = row-1;
	int count=(right+1)*(bottom+1);
   
	while(top<=bottom&&left<=right)
	{
		if(count>0)
		{
			if(dir==1)
			{
				for(int i=top;i<=bottom;i++)
				{
					System.out.print(array[i][left]+", ");
					count--;
				}
			}
			
			dir=2;
			left++;
		}
		
		
		
		if(count>0)
		{
			if(dir==2)
			{
				for(int i = left;i<=right;i++)
				{
					System.out.print(array[bottom][i]+", ");
				    count--;
				}
			}
			
			dir=3;
			bottom--;
		}
		
		
		
		if(count>0)
		{
			if(dir==3)
			{
				for(int i=bottom;i<=right;i--)
				{
					System.out.print(array[i][right]+", ");
					count--;
				}
			}
			
			dir=4;
			right--;
		}
		
		
		
		if(count>0)
		{
			if(dir==4)
			{
				for(int i=right;i>=left;i--)
				{
					System.out.print(array[top][i]+", ");
			        count--;	
				}
			}
			
			dir=1;
			top++;
		}
	
		
		
	}
  System.out.println("END");

}

}
