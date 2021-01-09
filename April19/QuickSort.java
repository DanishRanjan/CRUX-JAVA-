package April19;

public class QuickSort {
public static void main(String args[])
{
	int[] arr = {20,10,30,50,60,5,30,80,25};
	quickSort(arr, 0, arr.length-1);
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]+" ");
	}
	
}
public static void quickSort(int[] arr, int low, int high)
{
	if(low>=high)
	{
		return;
	}
	int mid = (low+high)/2;
	int pivot = arr[mid];
	int left = low;
	int right= high;
	while(left<=right)
	{
		if(arr[left]<pivot)
		{
			left++;
		}
		if(arr[right]>pivot)
		{
			right--;
		}
		if(left<=right)
		{
			int temp = arr[left];
			arr[left]=arr[right];
			arr[right] = temp;
			right--;
			left++;
		}
	}
	quickSort(arr, low, right);
	quickSort(arr, left, high);
}
}
