package homework;

import java.util.Scanner;

public class spiralprintClockwise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int coloumn = sc.nextInt();
		int[][] array = new int[row][coloumn];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<coloumn;j++)
			{
				array[i][j] = sc.nextInt();
			}
		}
	spiralPrint(array);	
}
	
	public static void spiralPrint(int[][] array)
	{
		int left=0,top=0;
		int right=array[top].length-1;
		int bottom = array[left].length-1;
		int count=(right+1)*(bottom+1);
		int dir=1;
		
		while(left<=right&&top<=bottom)
		{
			if(count>0) {
				if(dir==1)
				{
					for(int i=left;i<=right;i++)
					{
						System.out.print(array[top][i]+", ");
						count--;
					}
				}
				dir=2;
				top++;	
			}
			
			
			
			
			if(count>0)
			{
				if(dir==2)
				{
					for(int i=top;i<=bottom;i++)
					{
						System.out.print(array[i][right]+", ");
						count--;
					}
				}
				dir=3;
				right--;
			}
			
			
			
			
			if(count>0)
			{
				if(dir==3)
				{
					for(int i=right;i>=left;i--)
					{
						System.out.print(array[bottom][i]+", ");
					    count--;
					}
				}
				dir=4;
				bottom--;
				
			}
			
			
			
			
			if(count>0)
			{
			     if(dir==4)
			     {
			    	 for(int i=bottom;i>=top;i--)
			    	 {
			    		 System.out.print(array[i][left]+", ");
			    		 count--;
			    	 }
			     }
			     dir=1;
			     left++;
			}
			
			
			
		}
		System.out.print("END");
	}
}
