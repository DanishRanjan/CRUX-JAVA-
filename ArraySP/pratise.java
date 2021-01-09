package ArraySP;
import java.util.*;
public class pratise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of rows:- ");
int row = sc.nextInt();
System.out.println("Enterthe number of column:- ");
int col = sc.nextInt();
System.out.println("Enter the elements of array orederly:- ");
int[][] arr = new int[row][col];
for(int i=0;i<arr.length;i++)
{
	for(int j=0;j<arr.length;j++)
	{
		arr[i][j] = sc.nextInt();
	}
}

for(int i=0;i<arr.length;i++)
{
	
	if(i%2==0)
	{
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(arr[i][j]+",");
		}
	}
	else
	{
		for(int j=arr.length-1;j>=0;j--)
		{
			System.out.print(arr[i][j]+",");
		}
	}
}
System.out.print("END");



	}

}
