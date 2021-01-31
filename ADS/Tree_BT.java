package Lecture;

class Tnode
{
   int key;
   Tnode left;
   Tnode right;
   
   Tnode(int item)
   {
	   this.key=item;
	   left=null;
	   right=null;
   }
   
}

class BinaryTree
{
	
	Tnode root;
	
	BinaryTree()
	{
		root=null;
	}
	
	void printInorder(Tnode node)
	{
		if(node==null)
			return;
		printInorder(node.left);
		System.out.println(node.key);
		printInorder(node.right);
		
	}
	void printPreorder(Tnode node)
	{
		if(node==null)
			return;
		
		System.out.println(node.key+" ");
		printPreorder(node.left);
		printPreorder(node.right);
		
	}
	
	void printPostorder(Tnode node)
	{
		if(node==null)
			return;
		
	
		printPostorder(node.left);
		printPostorder(node.right);
		System.out.println(node.key+" ");
	}
	
	
	//// Wrappers over above recursive functions 
	void printInorder()
	{
		printInorder(root);
	}
	void printPreorder()
	{
		printPreorder(root);
	}
	
	void printPostorder()
	{
		printPostorder(root);
	}
	
	

}

public class Tree_BT 
{

	public static void main(String[] args) 
	{
		BinaryTree tree=new BinaryTree();
		tree.root=new Tnode(1);
		tree.root.left=new Tnode(2);
		tree.root.right=new Tnode(3);
		tree.root.left.left=new Tnode(4);
		tree.root.left.right=new Tnode(5);
		
		System.out.println("P[rerder traversal of tree");
		tree.printPreorder();
		

        System.out.println("\nInorder traversal of binary tree is "); 
        tree.printInorder(); 
  
        System.out.println("\nPostorder traversal of binary tree is "); 
        tree.printPostorder(); 
      
	}

}
