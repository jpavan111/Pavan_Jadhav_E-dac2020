package Lecture;

import java.util.Scanner;

 class Node
{
  int data;
  Node next;
  
  Node(int data)
  {
	this.data=data;
	this.next=null;
  }
}

class LinkedList
{
	 static int length;
	Node head;
	
	LinkedList()
	{
		length=0;
		head=null;
	}
	void add_node_at_last(int data)
	{
		Node node=new Node(data);
		//node.data=data;
		//node.next=null;
		
		if(head==null)
		{
			head=node;
		}
		else
		{
			Node n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=node;
		}
		length++;
		System.out.println("length beg"+length);
		
	}
	
	void add_node_at_first_pos(int data)
	{
		Node node=new Node(data);
		//node.data=data;
		//node.next=null;
		
		if(head==null)
		{
			head=node;
		}
		else
		{
			node.next=head;
			head=node;
		}
		length++;	
		System.out.println("length end"+length);
	
	}
	
	void add_node_in_between(int pos,int data)
	{
		//System.out.println("inside add between"+"pos= "+pos+"data= "+data);
	  	 Node node=new Node(data);
	  	Node trav1=head;
		if(pos==1)
	  	{
	  		System.out.println("pos=1");
	  		add_node_at_first_pos(data);
	  	}
	  	else if(pos>length)
	  	{
	  			System.out.println("pos=last");
	  			add_node_at_last(data);
	  	}
	  		
	  		else
	  		{
	  			System.out.println("new position : "+pos);
	  			
	  			//node.data=data;
	  			//node.next=null;
	  			
	  			
	  			System.out.println(count_nodes());
	  			int i=1;
	  			
	  			
	  			while(trav1.next!=null)
	  			{
	  				i++;
	  				if(i==pos)
	  				{
	  					break;
	  				}
	  				trav1=trav1.next;
	  			}
	  			node.next=trav1.next;
	  			trav1.next=node;
	  		
	  		}
	  		
	  	
	length++;
	//System.out.println("length"+length);
	
	Node n=head;
	while(n.next!=null)
	{
		System.out.println(n.data+" ");
		n=n.next;
	}
	System.out.println(n.data+" ");
		
		
	}
	
	
	void delete_node_at_first()
	{
		
		if(head==null)
		{
			System.out.println("cant delete : there is nothing to delete");
		}
		else if(head!=null)
		{
			if(head.next==null)
			{
			  head=null;
			}
			else
			{
				head=head.next;
			}
			length--;
		}
		
	}
	
	void delete_node_at_last()
	{
		if(head==null)
		{
			System.out.println("Cant delete : list is empty");
		}
		else if(head!=null)
		{
			if(head.next==null)
			{
				head=null;
			}
			else
			{
				Node n=head;
				while(n.next.next!=null)
				{
					n=n.next;
				}
				n.next=null;
			}
			length--;
			
		}
	}
	
	void delete_node_at_position(int pos)
	{
		if(pos==1)
		{
			delete_node_at_first();
		}
		else if(pos==count_nodes())
		{
			delete_node_at_last();
		}
		else
		{
			Node n=head;
			int i=1;
			while(i<pos-1)
			{
				i++;
				n=n.next;
			}
			n.next=n.next.next;
			
		}
		length--;
			
	}
	
	int count_nodes()
	{
		
		int count=0;
		
		if(head!=null)
		{
			Node n=head;
			while(n!=null)
			{
				count++;
				n=n.next;
			}
		}
		
		
		return count;
	}
	
	void display()
	{
		Node node=head;
		//System.out.println(count_nodes());
		System.out.println("length"+length);
		//System.out.println("head dis"+head.data);
		if(head==null)
		{
			System.out.println("list is empty");
		}
		else
		{
			//System.out.println(count_nodes());
			while(node.next!=null)
			{
				System.out.println(node.data);
				node=node.next;
			}
		System.out.println(node.data);
		}
	}
}

public class Linked_List1 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
     LinkedList list=new LinkedList();
     
     int data;
     int pos;
     
     int choice;
    do
    {
        System.out.println("singly linear linked list\\n");
        System.out.println("1. add node at last position");
        System.out.println("2. add node at first position");
        System.out.println("3. add node at specific position");
        System.out.println("4. delete node at first position");
        System.out.println("5. delete node at last position");
        System.out.println("6. delete node at specific position");
        System.out.println("7. display list");
        System.out.println("8. Exit..!!!");
        
        System.out.println("Enter Choice : ");
        choice=sc.nextInt();
        
        switch(choice)
        {
        case 1:
        	System.out.println("Enter data");
        	 data=sc.nextInt();
        	list.add_node_at_last(data);
        	break;
        	
        case 2:
        	System.out.println("Enter data");
        	 data=sc.nextInt();
        	list.add_node_at_first_pos
        	(data);
        	break;
        	
        case 3:
        	 while(true)
        	 {
        		 System.out.println("Enter position");
        		 pos=sc.nextInt();
        		 if(pos>0 && pos<=list.length+1)
        		 {
        			 break;
        		 }
        		 
        		 System.out.println("Invalid position");
        	 }
        	 System.out.println("Enter the data");
        	 data=sc.nextInt();
        	 System.out.println(data);
        	 list.add_node_in_between(pos,data);
        	 System.out.println("length case"+list.length);
 
        case 4:
            list.delete_node_at_first();
            break;
            
        case 5:
            list.delete_node_at_last();
            break;
            
        case 6:
        	while(true)
        	{
        		System.out.println("enter position:");
        		pos=sc.nextInt();
        		
        		if(pos>0 && pos<=list.length)
        		{
        			break;
        		}
        		System.out.println("Invalid position...!!!");
        	}
        	list.delete_node_at_position(pos);
        	break;
            
        case 7:
        	list.display();
         }
        
      
    }while(choice!=8);
    
   System.out.println("Exit....!!!!");
	}

}
