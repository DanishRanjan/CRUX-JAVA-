package homework;
import java.util.*;
public class spiralclockwise {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int m = sc.nextInt();
	int n = sc.nextInt();
	int array[][] = new int[m][n];
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			array[i][j]= sc.nextInt();
		}
	}
	wavePrint(array);
}
public static void wavePrint(int[][] array)
{
    for(int row=0;row<array.length;row++)
    {
    if(row%2==0)
    {
        for(int col=0;col<array[row].length;col++)
        {
            System.out.print(array[row][col]+", ");
        }
    }
    else
    {
     for(int col=array[row].length-1;col>=0;col--) 
     {
         System.out.print(array[row][col]+", ");
     }
    }
    
    }
    System.out.print("END");
}

}
