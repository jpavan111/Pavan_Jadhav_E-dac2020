package Lecture;

class Node2
{
	int data;
	Node2 fLink;
	Node2 bLink;
	
	Node2(int data)
	{
		this.data=data;
		this.fLink=this.bLink=null;
	}
}

class DoublyLinked
{
	private Node2 start;
	private int length;
	
	DoublyLinked()
	{
		this.start=null;
		this.length=0;
	}
	public void insertBeg(int data)
	{
		Node2 newNode=new Node2(data);
		if(start==null)
		{
			start=newNode;
		}
		else
		{
			start.bLink=newNode;
			newNode.fLink=start;
			start=newNode;	
		}
		length++;
	}
	public void insertEnd(int data)
	{
		Node2 newNode=new Node2(data);
		if(start==null)
		{
			start=newNode;
		}
		else
		{
			Node2 trav=start;
			while(trav.fLink!=null)
			{
				trav=trav.fLink;
			}
			trav.fLink=newNode;
			newNode.bLink=trav;
			
		}
		length++;
	}
	public void insertpos(int data,int pos)
	{
		if(pos==1)
		{
			insertBeg(data);
		}
		else if(pos>length)
		{
			insertEnd(data);
		}
		else
		{
			int i=1;
			Node2 trav=start;
			while(trav.fLink!=null)
			{
				i++;
				if(i==pos)
				{
					break;
				}
				trav=trav.fLink;
			}
			Node2 newNode=new Node2(data);
			newNode.bLink=trav;
			newNode.fLink=trav.fLink;
			trav.fLink.bLink=newNode;
			trav.fLink=newNode;
		
			}
		length++;
	}
	
	public void deletetBeg()
	{
		Node2 n=start;
		if(start==null)
		{
			System.out.println("list is empty");
		}
		else
		{
			start=n.fLink;
			start.bLink=null;
		}
		length--;
	}
	public void deleteEnd()
	{
		if(start==null)
		{
			System.out.println("list is empty");
		}
		else
		{
			Node2 n=start;
			while(n.fLink.fLink!=null)
			{
				n=n.fLink;
			}
			n.fLink.bLink=null;
			n.fLink=null;
			length--;
		}
	}
	public void deletePos(int pos)
	{
		if(pos<0)
		{
			System.out.println("pos not valid");
			return;
		}
		if(pos==1)
		{
			deletetBeg();
		}
		else if(pos>length)
		{
			deleteEnd();
		}
		else
		{
			int i=1;
			Node2 p=start;
			while(p.fLink!=null)
			{
				i++;
				if(i==pos)
				{
					break;
				}
				p=p.fLink;
			}
			p.fLink.fLink.bLink=p;
			p.fLink=p.fLink.fLink;
			
		}
		length--;
		
	}
	
	public void displayForward()
	{
		Node2 n=start;
		while(n.fLink!=null)
		{
			System.out.println(n.data+" ");
			n=n.fLink;
		}
		System.out.println(n.data);
	}
	
	public void displayBackward()
	{
		Node2 n=start;
		while(n.fLink!=null)
		{
			n=n.fLink;
		}
		
		while(n.bLink!=null)
		{
			System.out.println(n.data);
			n=n.bLink;
		}
		System.out.println(n.data);
	}
}

public class Doubly_Linked 
{

	public static void main(String[] args) 
	{
		DoublyLinked d1=new DoublyLinked();
		d1.insertBeg(10);
		d1.insertBeg(20);
		d1.insertBeg(30);
		d1.insertEnd(40);
		d1.insertEnd(400);
		d1.insertEnd(500);
		//d1.insertpos(2, 4);
		//d1.displayForward();
		//System.out.println();
		
		//d1.deleteEnd();
		//d1.displayForward();
		//System.out.println();
		//d1.deletetBeg();
		//d1.insertBeg(100);
		//d1.insertBeg(200);
		
		d1.displayForward();
		System.out.println();
		d1.deletePos(4);
		d1.displayForward();
		System.out.println();
		d1.displayBackward();
		System.out.println();
		

	}

}
