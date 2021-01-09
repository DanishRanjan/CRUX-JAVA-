package HackerBlocks;

import java.util.*;
public class WavePrint_rowWise
{
    public static void main(String args[])
    {
 Scanner sc = new Scanner(System.in);
 int row = sc.nextInt();
 int col = sc.nextInt();
 int array[][] = new int[row][col];
 for(int i=0;i<row;i++)
 {
     for(int j=0;j<col;j++)
     {
         array[i][j] = sc.nextInt();
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

