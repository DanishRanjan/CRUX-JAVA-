package RecursionMarch30;

public class recursionLastIndex {
public static void main(String args[])
{
	int arr[] = {3,8,1,8,8,7};
	System.out.println(lastIndex(arr, 0, 8));
}
public static int lastIndex(int arr[], int si, int data)
{
	if(si==arr.length)
	{
		return -1;
	}
	int index = lastIndex(arr, si+1, data);
	
	if(index == -1)
	{
		if(arr[si]==data)
		{
			return si;
		}
		else
		{
			return -1;
		}
	}
	else {
		return index;
	}
}
}
