package Lecture;

import java.util.Scanner;

class Bubble
{
	Scanner sc=new Scanner(System.in);
	int n=6;
	int[] arr=new int[100];
   
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
			   System.out.print(arr[i] + "  ");
		   }
		   System.out.println();
	   }
	   
	   void bubbleSort()
	   {
		   int temp;
		   
		   for(int i=0;i<n-1;i++)
		   {
			   int flag=0;
			   for(int j=0;j<n-1-i;j++)
			   {
				   if(arr[j]>arr[j+1])
				   {
					  temp= arr[j];
					  arr[j]=arr[j+1];
					  arr[j+1]=temp;
					  flag=1;
				   }
			   }
			   if(flag==0)
			   {
				   break;
			   }
		   }
	   }
}

public class BubbleSort {

	public static void main(String[] args) {
	
		Bubble b=new Bubble();
		b.accept();
		b.display();
		b.bubbleSort();
		b.display();
		

	}

}
