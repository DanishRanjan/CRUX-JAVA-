package HackerBlocks;

import java.util.*;

public class WavePattern_ColoumnWise {

  public static void main(String[] args)

              {

                           Scanner sc=new Scanner(System.in);
                           int row=sc.nextInt();
                           int col=sc.nextInt();
                           int[][]arr=new int[row][col];
                           int count=row*col;

                           
                           for(int i=0;i<row;i++)
                           {
                                for(int j=0;j<col;j++)
                                   {
                                       arr[i][j]=sc.nextInt();
                                   }
                           }

                          

                           for(int j=0;j<col;j++)
                           {
                               if(j%2==0)
                                  for(int i=0;i<row;i++)
                                        {
                                          System.out.print(arr[i][j]+", ");
                                           count--;
                                         }

                               else
                                  for(int i=row-1;i>=0;i--)
                                         {
                                          System.out.print(arr[i][j]+", ");
                                          count--;
                                          }
                           }
                           System.out.println(""+"END");
              }
}