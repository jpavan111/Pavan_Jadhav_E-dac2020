package Lecture;

import java.util.Scanner;

class Sorting
{
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[100];
	int n=6;
	
	void accept()
	{
		System.out.println("Enter array elements : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
	}
	
	void display()
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
	
	void selection()
	{
		for(int i=0;i<n-1;i++) // number of passes will be "n-1"
		{
			int min=i;
			int j;
			for( j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			
			if(min!=i)
			{
				
				int temp=0;
				temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
		}
		
		
	}

}
public class SelectionSort {

	public static void main(String[] args) {
		Sorting s=new Sorting();
		s.accept();
		s.display();
		s.selection();
		s.display();
		

	}

}
