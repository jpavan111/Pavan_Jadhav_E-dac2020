package Lecture;

import java.util.Scanner;

class Node4
{
	int data;
	Node4 next;
	
	Node4(int data)
	{
		this.data=data;
		this.next=null;
	}
}

class CircularLinkedList
{
	Node4 head;
	static int length;
	CircularLinkedList()
	{
		length=0;
		head=null;
	}
	
	void addBeg(int data)
	{
		Node4 node=new Node4(data);
		if(head==null)
		{
			head=node;
			node.next=head;
		}
		else
		{
			Node4 n=head;
			
			while(n.next!=head)
			{
				n=n.next;
			}
			
			node.next=head;
			head=node;
			n.next=head;
			
		
		}
		length++;
		System.out.println("length ins"+length);
		
	}
	
	void addEnd(int data)
	{
		Node4 node=new Node4(data);
		 
		if(head==null)
		{
			head=node;
			node.next=head;
		}
		else
		{
			Node4 n=head;
			while(n.next!=head)
			{
				n=n.next;
			}
			
			node.next=n.next;
			n.next=node;
			
		}
		length++;
		System.out.println("length end"+length);
	}
	
	void addBetween(int pos,int data)
	{
		Node4 node=new Node4(data);
		if(pos==1)
		{
			addBeg(data);
		}
		else if(pos>length)
		{
			addEnd(data);
		}
		else
		{
			Node4 n=head;
			int i=1;
			 while(n.next!=head)
			 {
				 i++;
				 if(i==pos)
				 {
					 break;
				 }
				 n=n.next;
			 }
			 node.next=n.next;
			 n.next=node;
		}
		
		length++;
		System.out.println("length between"+length);
	}
	
	void deleteBeg()
	{
		if(head==null)
		{
			System.out.println("list is empty");
		}
		else if(length==1)
		{
			head=null;
			length--;
		}
		else
		{
			Node4 n=head;
			while(n.next!=head)
			{
				n=n.next;
			}
			head=head.next;
			n.next=head;
			
			length--;
			System.out.println("length del beg"+length);
		}
	}
	
	void deleteEnd()
	{
		if(head==null)
		{
			System.out.println("list is empty");
		}
		else if(length==1)
		{
			
			head=null;
			length--;
		}
		else
		{
			Node4 n=head;
			while(n.next.next!=head)
			{
				n=n.next;
			}
			n.next=head;
			length--;
		}
	}
	
	void deleteBetween(int pos)
	{
		if(pos==1)
		{
			deleteBeg();
		}
		else if(pos>length)
		{
			deleteEnd();
		}
		else
		{
			Node4 n=head;
			int i=1;
			while(n.next!=head)
			{
				i++;
				if(i==pos)
				{
					break;
				}
				n=n.next;
			}
			n.next=n.next.next;
			length--;
		}
		
	}
	
	void display()
	{
		Node4 n=head;
		System.out.println("total length : "+length);
		
		if(head==null)
		{
			System.out.println("list is empty");
		}
		else
		{
		while(n.next!=head)
		{
			System.out.println(n.data+" ");
			n=n.next;
		}
		System.out.println(n.data+" ");
		}
	}
	
}


public class Circular_Singly_Linked_List {

	public static void main(String[] args)
	{
		CircularLinkedList cl=new CircularLinkedList();
		
		Scanner sc=new Scanner(System.in);
		
		int data;
		int pos;
		int choice;
		do
		{
			System.out.println("\n circular singly linked list \n");
			System.out.println("1. add node at first ");
			System.out.println("2. add node at last ");
			System.out.println("3. add node at between ");
			System.out.println("4. delete node at first ");
			System.out.println("5. delete node at last ");
			System.out.println("6. delete node at between ");
			System.out.println("7. display list ");
			System.out.println("8. Exit ....!!!");
			
			System.out.println("Enter choice :");
		   	choice=sc.nextInt();
		   	
		   	switch(choice)
		   	{
		   	case 1:
		   		System.out.println("Enter data");
		   		data=sc.nextInt();
		   		cl.addBeg(data);
		   		break;
		   		
		   	case 2:
		   		System.out.println("Enter data");
		   		data=sc.nextInt();
		   		cl.addEnd(data);
		   		break;
		   		
		   	case 3:
		   		System.out.println("Enter data");
		   		data=sc.nextInt();
		   		System.out.println("Enter position");
		   		pos=sc.nextInt();
		   		cl.addBetween(pos, data);
		   		break;
		   		
		   	case 4:
		   	
		   		cl.deleteBeg();
		   		break;
		   		
		   	case 5:
		   	
		   		cl.deleteEnd();
		   		break;
		   		
		   	case 6:
		   		System.out.println("Enter position");
		   		pos=sc.nextInt();
		   		cl.deleteBetween(pos);
		   		break;
		   		
		   	case 7:
		   		cl.display();
		   		break;
		   	}
		   	
		}while(choice!=8);
		
	/*	
		cl.addBeg(10);
		cl.addBeg(20);
		cl.addBeg(30);
		cl.display();
		System.out.println();
		cl.addEnd(40);
		cl.addEnd(50);
		cl.display();
		System.out.println();
		cl.addBetween(2, 100);
		cl.display();
		
		cl.deleteBeg();
		cl.display();
		System.out.println();
		
		cl.deleteEnd();
		cl.deleteEnd();
		cl.display();
		System.out.println();
		
		cl.deleteEnd();
		cl.deleteEnd();
		cl.display();
		System.out.println();
		
		cl.deleteEnd();
		cl.display();
		System.out.println();
		
		cl.addBeg(10);
		cl.addBeg(20);
		cl.addBeg(30);
		cl.addEnd(40);
		cl.display();
		System.out.println();
		
		cl.deleteBetween(2);
		cl.display();
		System.out.println();
*/
	}

}
