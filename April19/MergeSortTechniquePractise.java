package April19;

public class MergeSortTechniquePractise {

	public static void main(String[] args) {
	
         int[] arr = {20,10,30,50,60,5,30,80,25};
         int[] ans = MergeSort(arr, 0, arr.length-1);
         for(int i=0;i<ans.length;i++)
         {
        	 System.out.println(ans[i]+" ");
         }
	}
	public static int[] mergerTwoSortedArray(int[] one, int[] two)
	{
		int[] sorted = new int[one.length+two.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<one.length&&j<two.length)
		{
			if(one[i]<=two[j])
			{
			sorted[k]=one[i];
			k++;
			i++;
			
			}
			else
			{
			sorted[k]=two[j];
			k++;
			j++;
			
			}
		}
		if(i==one.length)
		{
			while(j<two.length)
			{
				sorted[k]=two[j];
				j++;
				k++;
			}
		}
		if(j==two.length)
		{
			while(i<one.length)
			{
			sorted[k]=one[i];
			i++;
			k++;
			}
		}
		return sorted;
	}
	public static int[] MergeSort(int[] arr, int low, int high)
	{
		if(low==high)
		{
			int[] br = new int[1];
			br[0]=arr[low];
			return br;
		}
		
		int mid = (low+high)/2;
		int[] fh = MergeSort(arr, low, mid);
		int[] sh = MergeSort(arr, mid+1, high);
		int[] sorted = mergerTwoSortedArray(fh, sh);
		return sorted;
	}

}
