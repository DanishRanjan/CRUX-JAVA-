package homework;
import java.util.*;
public class wavepatterncolumewise {
	public static int row;
	public static int col;
	public static int count;
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	row = sc.nextInt();
	col = sc.nextInt();
	count = row*col;
	int [][] array = new int[row][col];
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
	        for(int col=0;col<array[col].length;col++)
	        {
	            if(col%2==0)
	            {
	                for(int row=0;row<array[row].length;row++)
	                {
	                    System.out.print(array[row][col]+", ");
	                    //count--;
	                }
	            }
	            else
	            {
	            for(int row=array[row].length-1;row>=0;row--)
	            {
	                System.out.print(array[row][col]+", ");
	                //count--;            
	            }
	            }
	        }
	        System.out.print("END");
	    }
}
////4 4
////11 12 13 14
////21 22 23 24
////31 32 33 34
////41 42 43 44


//import java.util.*;
//
//public class wavepatterncolumewise {
//
//  public static void main(String[] args)
//
//              {
//
//                           Scanner sc=new Scanner(System.in);
//                           int row=sc.nextInt();
//                           int col=sc.nextInt();
//                           int[][]arr=new int[row][col];
//                           int count=row*col;
//
//                           
//                           for(int i=0;i<row;i++)
//                           {
//                                for(int j=0;j<col;j++)
//                                   {
//                                       arr[i][j]=sc.nextInt();
//                                   }
//                           }
//
//                          
//
//                           for(int j=0;j<col;j++)
//                           {
//                               if(j%2==0)
//                                  for(int i=0;i<row;i++)
//                                        {
//                                          System.out.print(arr[i][j]+", ");
//                                           count--;
//                                         }
//
//                               else
//                                  for(int i=row-1;i>=0;i--)
//                                         {
//                                          System.out.print(arr[i][j]+", ");
//                                          count--;
//                                          }
//                           }
//                           System.out.println(""+"END");
//              }
//}
