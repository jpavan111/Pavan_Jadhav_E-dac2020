package Lecture;

import java.util.Scanner;

class BSTNode
{
	int data;
	BSTNode left,right;
	
	BSTNode()
	{
		left=null;
		right=null;
		data=0;
	}
	
	BSTNode(int n)
	{
		left=null;
		right=null;
		data=n;
	}
	
	void setLeft(BSTNode n)
	{
		left=n;
	}
	void setRight(BSTNode n)
	{
		right=n;
	}
	
	int getData()
	{
	  return data;	
	}
	
	BSTNode getLeft()
	{
		return left;
	}
	
	BSTNode getRight()
	{
		return right;
	}
	
	
	
}

class BST
{
	BSTNode root;
	
	public boolean isEmpty()
	{
		return root==null;
	}
	
	public boolean search(int val)
	{
		return search(root,val);
	}
	
	public int countNodes()
	{
		return countNodes(root);
	}
	
	private int countNodes(BSTNode r)
	{
		if(r==null)
		{
			return 0;
		}
		else
		{
			int l=1;
			l+=countNodes(r.getLeft());
			l+=countNodes(r.getRight());
			return l;
		}
	}
	
	public boolean search(BSTNode r, int val)
	{
		boolean found=false;
		while((r!=null) && !found)
		{
			int rval=r.getData();
			
			if(val<rval)
			{
				r=r.getLeft();
			}
			else if(val>rval)
			{
				r=r.getRight();
			}
			else
			{
				found=true;
			    break;
			}
			found=search(r,val);
			
		}
		return found;
	}
	
	void insert(int data)
	{
		
		root=insert(root,data);
		System.out.println(root);
	}
	
	BSTNode insert(BSTNode node,int data)
	{
		//System.out.println("1st node"+node);
		if(node==null)
		{
			node=new BSTNode(data);
		}
		else
		{
			if(data<=node.getData())
			{
				node.left=insert(node.left,data);
				System.out.println("node lft"+node.left);
			}
			else
			{
				node.right=insert(node.right,data);
				System.out.println("node lft"+node.right);
			}
		}
		//System.out.println("fun"+node);
		return node;
	}
	
	void delete(int k)
	{
		if(isEmpty())
		{
		  System.out.println("Tree is empty");	
		}
		else if(search(k)==false)
		{
			System.out.println("We cant delete"+ k + "is not present");
		}
		else
		{
			root=delete(root,k);
			System.out.println("delete"+root);
		
		}
	}
	
	BSTNode delete(BSTNode root,int k)
	{
		BSTNode p,p2,n;
		if(root.getData()==k)
		{
			BSTNode lt,rt;
			lt=root.getLeft();
			rt=root.getRight();
			System.out.println("root = "+root);
			System.out.println("lt = "+lt);
			System.out.println("rt = "+rt);
			
			if(lt==null && rt==null)
			{
				return null;
			}
			else if(lt==null)
			{
				p=rt;
				return p;
			}
			else if(rt==null)
			{
				p=lt;
				return p;
			}
			else
			{
				p2=rt;
				p=rt;
				System.out.println("p2="+p2);
				System.out.println("p="+p);
				
				while(p.getLeft()!=null)
				{
				  p=p.getLeft();	
				}
				p.setLeft(lt);
				System.out.println("p = "+p);
				System.out.println("p.lt"+p.left);
				System.out.println("return p2"+p2);
				return p2;
				
			}
		}
		
		if(k<root.getData())
		{
			n=delete(root.getLeft(),k);
			root.setLeft(n);
		}
		else
		{
			n=delete(root.getRight(),k);
			root.setRight(n);
			
		}
		System.out.println("return root"+root);
		return root;
	}
	
	public void inorder()
	{
	inorder(root);	
	}
	
	void inorder(BSTNode r)
	{
		System.out.println("inorder"+root);
		System.out.println("inorder r"+r);
		if(r!=null)
		{
			inorder(r.getLeft());
			System.out.print(r.getData()+" ");
			inorder(r.getRight());
		}
	}
	
	void preorder()
	{
		preorder(root);
	}
	
	void preorder(BSTNode r)
	{
		if(r!=null)
		{
			System.out.println(r.getData());
			preorder(r.getLeft());
			preorder(r.getRight());
		}
	}
	
	void postorder()
	{
		postorder(root);
	}
	
	void postorder(BSTNode r)
	{
		if(r!=null)
		{
			postorder(r.getLeft());
			postorder(r.getRight());
			System.out.println(r.getData());
		}
	}
	
	
}

public class Tree_BST {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BST bst=new BST();
		
		char ch;
		
		do
		{
			System.out.println("\nBinary Search Tree Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. delete");
            System.out.println("3. search");
            System.out.println("4. count nodes");
            System.out.println("5. check empty"); 
 
            int choice = sc.nextInt();
            
            switch(choice)
            {
		  case 1 : 
              System.out.println("Enter integer element to insert");
              bst.insert( sc.nextInt() );                     
              break;                          
          case 2 : 
              System.out.println("Enter integer element to delete");
              bst.delete( sc.nextInt() );                     
              break;                         
          case 3 : 
              System.out.println("Enter integer element to search");
              System.out.println("Search result : "+ bst.search( sc.nextInt() ));
              break;                                          
          case 4 : 
              System.out.println("Nodes = "+ bst.countNodes());
              break;     
          case 5 :  
              System.out.println("Empty status = "+ bst.isEmpty());
              break;            
          default : 
              System.out.println("Wrong Entry \n ");
              break;   
          }
          /*  Display tree  */ 
          System.out.print("\nPost order : ");
          bst.postorder();
          System.out.print("\nPre order : ");
          bst.preorder();
          System.out.print("\nIn order : ");
          bst.inorder();

          System.out.println("\nDo you want to continue (Type y or n) \n");
          ch = sc.next().charAt(0);  
            
		}while(ch=='y' || ch=='Y');
		System.out.println("Exit...!!!");

	}

}
