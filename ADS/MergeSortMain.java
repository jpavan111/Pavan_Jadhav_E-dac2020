package Lecture;
class MergeSort
{
	void mergeSort(int[] a,int lb,int ub)
	{
		//System.out.println("a value  " + a);
		//System.out.println("lb value  "+lb);
		//System.out.println("ub value  "+ub);
		int mid=0;
		if(lb<ub)
		{
			mid=(lb+ub)/2;
			//System.out.println("mid is "+mid);
			mergeSort(a, lb, mid);
			mergeSort(a, mid+1, ub);
			merge(a,lb,mid,ub);
		}
	}
	
	void merge(int[] a,int lb,int mid,int ub)
	{
		int i=lb;
		int j=mid+1;
		int k=lb;
		//System.out.println("i start "+i);
		//System.out.println(" j start "+j);
		int[] b=new int[a.length];
		
		while(i<=mid && j<=ub)
		{
			if(a[i]<=a[j])
			{
				b[k]=a[i];
				i++;
			}
			else  // a[i]>=a[j]
			{
				b[k]=a[j];
				j++;
			}
			k++;
		}
		
		if(i>mid)
		{
			while(j<=ub)
			{
				b[k]=a[j];
				j++;
				k++;
			}
		}
		else // j==ub
		{
			while(i<=mid)
			{
				b[k]=a[i];
				k++;
				i++;
			}
		}
			
		
		for(k=lb;k<=ub;k++)
		{
			a[k]=b[k];
		}
	}
	
	void display(int arr[])
	{
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
		System.out.println();
	}
}

public class MergeSortMain {

	public static void main(String[] args) {
		int[] a={6,5,12,10,9,1};
		MergeSort obj=new MergeSort();
		System.out.println("Original array");
		obj.display(a);
		obj.mergeSort(a,0,a.length-1);
		System.out.println("Sorted array is : ");
		obj.display(a);

	}

}
