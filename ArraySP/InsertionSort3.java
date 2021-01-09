package ArraySP;

public class InsertionSort3 {
public static void main(String args[])
{
	int[] arr = {10,3,8,2,7,6};
	for(int i=1;i<arr.length;i++)
	{
		int temp=arr[i];
		int j=i-1;
		while(j>=0 && arr[j]>temp)
		{
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=temp;
		
	}
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+",");
	}
}
}
