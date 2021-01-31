package Lecture;

class MyStack5
{
	
	private int max=100;
	int top;
	char[] stack=new char[max];
	
	public MyStack5()
	{
		top =-1;
	}
	
	
	
	void push(char x)
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
	
	
	char pop()
	{
		char item;
		if(top<0)
		{
			//System.out.println("STack underflow");
			return ' ';
		}
		else 
		{
			 item=stack[top];
			 top--;
			 return item;
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
	public char peek()
	{
		if(top<0)
		{
		 return ' ';
		}
		else
		{
		   return stack[top];
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

class InfixToPostfix
{
	static int precedenace(char c)
	{
		switch(c)
		{
		case '+':
		case '-':
			 return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
			
		}
		return -1;
	}

	static String infixtopost(String exp)
	{
		MyStack5 s=new MyStack5();
		String res=" ";
		for(int i=0;i<exp.length();i++)
		{
			char c=exp.charAt(i);
			
			if(precedenace(c)>0)
			{
				while(!s.isEmpty() && precedenace(s.peek())>=precedenace(c))
				{
					res+=s.pop();
				}
				s.push(c);
			}
			else if(c==')')
			{
					char x=s.pop();
					while(x!='(')
					{
						res=res+x;
						x=s.pop();
					}
					
			}
			else if(c=='(')
			{
				s.push(c);
			}
			else	
			{
				res+=c; // operand push
			}
		}
		for(int i=0;i<=s.stack.length;i++)
		{
			res+=s.pop();
		}
		return res;
	}
	
	
}

public class Stack_expression_13_nov {

	public static void main(String[] args) {
    //String str="A+B*(C^D-E)";
    String str="A+B*C-D/E";
    
    System.out.println("postfix output is : "+InfixToPostfix.infixtopost(str));;
	}

}
