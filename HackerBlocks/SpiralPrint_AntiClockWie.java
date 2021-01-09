package HackerBlocks;

import java.util.Scanner;

public class SpiralPrint_AntiClockWie {
	 public static void main(String[] args) 
	 {
	 Scanner s=new Scanner(System.in);
	 int M=s.nextInt();
	 int N=s.nextInt();
	 int[][]arr=new int[M][N];
	 for(int i=0;i<M;i++)
	 {
	 for(int j=0;j<N;j++)
	 {
	 arr[i][j]=s.nextInt();
	 }
	 }
	 int top=0;
	 int left=0;
	 int bottom=M-1;
	 int right=N-1;
	 int count=(bottom+1)*(right+1);//16
	 while(left<=right&&top<=bottom)
	 {
	 int dir=1;
	 for(int i=top;i<=bottom;i++)
	 {
	 System.out.print(arr[i][left]+","+" ");
	 count--;
	 }
	 if(count==0)
	 break;
	        left++;
	 dir++;
	 for(int i=left;i<=right;i++)
	 {
	 System.out.print(arr[bottom][i]+","+" ");
	 count--;
	 }
	 if(count==0)
	 break;

	 bottom--;
	 dir++;
	 for(int i=bottom;i>=top;i--)
	 {
	 System.out.print(arr[i][right]+","+" ");
	 count--;
	 }
	 if(count==0)
	 break;

	 right--;
	 dir++;
	 for(int i=right;i>=left;i--)
	 {
	 System.out.print(arr[top][i]+","+" ");
	 count--;
	 }
	 if(count==0)
	 break;
	 top++;

	 }
	 System.out.println(""+"END");

	 }
}
