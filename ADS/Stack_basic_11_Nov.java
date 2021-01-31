package Lecture;

import java.util.Scanner;

class MyStack
{
	
	private int max=5;
	int top;
	int[] stack=new int[max];
	
	public MyStack()
	{
		top =-1;
	}
	
	
	
	void push(int x)
	{
		if(top>=max-1)
		{
			System.out.println("Stack overflow");
			
		}
		else
		{
			top++;
			stack[top]=x;
			System.out.println("pushed element is : "+stack[top]+"  "+top);
		}
	}
	
	
	void pop()
	{
		int item;
		if(top<0)
		{
			System.out.println("STack underflow");
			
		}
		else 
		{
			 item=stack[top];
			 top--;
			 System.out.println("Popped element is : "+item);
		}
	}
	
	boolean isEmpty()
	{
		if(top<0)
		{
			System.out.println("Stack is empty");
		     return true;
		}
		else
		{
			System.out.println("Stack is not empty");
	        return false;
		}
	}
	public void peek()
	{
		if(top<0)
		{
			System.out.println("Error : top on empty stack");
		}
		else
		{
			System.out.println("peek element of the stack is : "+stack[top] + "and position of top is :"+top);;
		}
	}
	
		
   public void traversal()
   {
	 
	   if(!isEmpty())
	   {
	   for(int i=top;i>=0;--i)
	   {
		   System.out.println("Stack elements are : "+stack[i]);
	   }
	 
	   } 
	   
   }
}
	  
	




public class Stack_basic_11_Nov 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		MyStack s=new MyStack();
		int n;
		do
		{
			System.out.println("Enter choice : ");
			n=sc.nextInt();
		
			switch(n)
			{
			case 1:
				System.out.println("enter element");
				int x=sc.nextInt();
				s.push(x);
				break;
				
			case 2:
				s.pop();
				break;
				
			case 3:
				s.peek();
				break;
				
			case 4:
				s.isEmpty();
				break;
				
			case 5:
				s.traversal();
				break;
				
			default:
				{
				System.out.println("invalid choice");	
				}
				
			}
		}while(n!=0);
		
		System.out.println("Exit");
       

	}

}
