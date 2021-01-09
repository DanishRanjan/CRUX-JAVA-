package ArraySP;

public class SelectionSort1 {
public static void main(String args[])
{
	int[] a = {10,3,76,89,7};
	int min,temp=0;
	for(int i=0;i<a.length;i++)
	{
		min=i;
		for(int j=i+1;i<a.length;i++)
		{
			if(a[j]<a[min])
			{
				min=j;
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
	}
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+",");
	}
}
}
