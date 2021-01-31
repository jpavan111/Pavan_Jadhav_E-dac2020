package Lecture;

import java.util.Scanner;

class Sort
{
	Scanner sc=new Scanner(System.in);
	int[] arr1=new int[100];
	int n =6;
	
	void accept()
	{
		System.out.println("Enter array elements : ");
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
	}
	
	void display()
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
	}
	
	void insertion()
	{
		int temp;
		for(int i=1;i<n;i++)
		{
		   temp	=arr1[i];
		   int j=i-1;
		   while(j>=0 && arr1[j]>temp)
		   {
			   arr1[j+1]=arr1[j];
			   j--;
		   }
		   arr1[j+1]=temp;
		}
	}
}

public class InsertionSort 
{
  public static void main(String[] args)
  {
	Sort s1=new Sort();
	s1.accept();
	s1.display();
	s1.insertion();
	s1.display();
	
  }
}
