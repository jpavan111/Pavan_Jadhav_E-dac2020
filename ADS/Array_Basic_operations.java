package Lecture;

import java.util.Scanner;

class Array1
{
	Scanner sc=new Scanner(System.in);
	int[] arr=new int[100];
	int n=10;
	Array1()
	{
		
	}
	
	void accept()
	{
		System.out.println("WEnter array elements : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
	}
	
	boolean search(int searchkey)
	{
		int i;
		for( i=0;i<n;i++)
		{
			if(arr[i]==searchkey)
			{
				break;
			}
		}
		
		if(i==n)
		{
			System.out.println("Not found..!!!");
		    return false;
		}
		else
		{
			//System.out.println("Found...!!!");
			return true;
		}
	}
	
	void delete(int searchkey)
	{
		int i=0;
		for(i=0;i<n;i++)
		{
			if(arr[i]==searchkey)
			{
				break;
			}
		
		}
		if(arr[i]==searchkey)
		{
		for(int k=i;k<n-1;k++)
		{
			arr[k]=arr[k+1];
		}
		n--;
	
		
		for(int j=0;j<n;j++)
		{
			System.out.print(arr[j]+" ");
		}
		}
		else
		{
			System.out.println("cant delete");
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
}

public class Array_Basic_operations {

	public static void main(String[] args) 
	{
		int searchkey=70;
		Array1 a1=new Array1();
		a1.accept();
		a1.display();
		//a1.search(searchkey);
		a1.delete(searchkey);


	}

}
